package io.github.natanimn.telebof.requests;

import com.google.gson.Gson;
import io.github.natanimn.telebof.ApiResponse;
import io.github.natanimn.telebof.BotLog;
import io.github.natanimn.telebof.Util;
import io.github.natanimn.telebof.TelegramApiException;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.errors.ConnectionError;
import io.github.natanimn.telebof.errors.TelegramError;
import io.github.natanimn.telebof.types.input.InputMedia;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Request;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * A class to interact with telegram server
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class RequestSender {

    protected int TIMEOUT = 120;
    private final String URL;
    private final String FILE_URL;
    private final OkHttpClient client;
    private final Gson gson = new Gson();
    private final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private final String botToken;
    private final Request.Builder builder;

    public RequestSender(String botToken, boolean useTestServer, Proxy proxy, @Nullable String localBotAPiUrl){
        this.botToken = botToken;
        this.client = new OkHttpClient.Builder()
                .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
                .proxy(proxy)
                .build();

        this.builder = new Request.Builder();
        this.FILE_URL = "https://api.telegram.org/file/bot%s/%s";

        if (localBotAPiUrl != null && !localBotAPiUrl.isEmpty())
            this.URL = localBotAPiUrl;
        else
            this.URL = "https://api.telegram.org/bot%s" + (useTestServer?"/test/%s":"/%s");
    }

    private RequestBody prepareRequest(AbstractBaseRequest<?, ?> baseRequest) {
        if (baseRequest.hasMultipart()) {
            return buildMultipartBody(baseRequest);
        }
        return buildJsonBody(baseRequest);
    }

    private RequestBody buildMultipartBody(AbstractBaseRequest<?, ?> request) {
        MultipartBody.Builder builder = new MultipartBody.Builder()
                .setType(MultipartBody.FORM);

        MediaType contentType = MediaType.parse(request.getContentType());

        request.getParameters().entrySet().stream()
                .filter(entry -> entry.getValue() != null)
                .forEach(entry -> addMultipartPart(builder, entry, contentType));

        return builder.build();
    }

    private void addMultipartPart(MultipartBody.Builder builder,
                                  Map.Entry<String, Object> entry,
                                  MediaType contentType) {
        String name = entry.getKey();
        Object value = entry.getValue();


        if (value instanceof InputMedia ) {
            if (((InputMedia) value).hasFile()) {
                for (File file: ((InputMedia) value).getFiles())
                    builder.addFormDataPart(
                            file.getName(),
                            file.getName(),
                            RequestBody.create(file, contentType)
                    );

            }

        } else if (value instanceof InputMedia[]) {
            for (InputMedia media : (InputMedia[]) value) {
                if (media.hasFile()) {
                    for (File file : media.getFiles())
                        builder.addFormDataPart(
                                file.getName(),
                                file.getName(),
                                RequestBody.create(file, contentType)
                        );
                }
            }
        }

        if (value instanceof File file) {
            builder.addFormDataPart(
                    name,
                    file.getName(),
                    RequestBody.create(file, contentType)
            );

        } else {
            if (name.equals("parse_mode"))
                value = ((ParseMode)value).name().toLowerCase();
            String stringValue = convertToString(value);
            builder.addFormDataPart(name, stringValue);
        }
    }

    private String convertToString(Object value) {
        if (value.getClass().isPrimitive() || value instanceof Number ||
                value instanceof Boolean || value instanceof Character ||
                value instanceof String) {
            return String.valueOf(value);
        }
        return gson.toJson(value);
    }

    private RequestBody buildJsonBody(AbstractBaseRequest<?, ?> request) {
        return RequestBody.create(
                gson.toJson(request.getParameters()),
                MediaType.get("application/json; charset=utf-8")
        );
    }

    private String getUrl(AbstractBaseRequest<?, ?> baseRequest) {
        return String.format(URL, botToken, baseRequest.getMethodName());
    }

    public  <T> ApiResponse<T> postRequest(AbstractBaseRequest<?, ?> baseRequest){
        RequestBody requestBody = prepareRequest(baseRequest);
        Request request = builder.url(getUrl(baseRequest))
                .post(requestBody).build();

        String jsonString = "";
        try (Response response = client.newCall(request).execute()){
            ResponseBody responseBody = response.body();
            jsonString         = responseBody.string();

            return Util.parseApiResponse(jsonString, baseRequest.getResponseType());
        } catch (UnknownHostException e){
            throw new ConnectionError(String.format("Unable to send request to %s", request.url().url().getHost()));
        } catch (IOException e){
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println(jsonString + " " + baseRequest.getResponseType());
            throw new RuntimeException(e);
        }
    }

    public <T, R> R makeRequest(AbstractBaseRequest<T, R> abstractBase) {
        if (botToken == null || botToken.isEmpty()) throw new TelegramError("Undefined botToken");
        BotLog.debug(String.format("Request: method=%s, url=%s", abstractBase.methodName, getUrl(abstractBase)));
        ApiResponse<R> response = postRequest(abstractBase);
        BotLog.debug(String.format("The server returned: %s", response.result));
        if (!response.ok) throw new TelegramApiException(response);
        else return response.result;
    }

    public byte[] downloadFile(String filePath) {
        Request request = new Request.Builder().url(String.format(FILE_URL, botToken, filePath)).build();
        BotLog.debug(String.format("Request: file=%s, url=%s", filePath, request.url()));
        try (Response response = client.newCall(request).execute()){
            if (response.code() != 200)
                throw new IOException(String.format("Error %d! Unable to download file. %s", response.code(), response.body().string()));
            BotLog.debug("The server returned status code: " + response.code());
            return response.body().bytes();
        } catch (AssertionError e){
            throw new RuntimeException("Server send back empty response");
        } catch (UnknownHostException e){
            throw new ConnectionError(String.format("Unable to send request to %s", request.url().url().getHost()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
