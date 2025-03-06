package io.github.natanimn.requests;

import com.google.gson.Gson;
import io.github.natanimn.ApiResponse;
import io.github.natanimn.BotLog;
import io.github.natanimn.Util;
import io.github.natanimn.TelegramApiException;
import io.github.natanimn.errors.ConnectionError;
import io.github.natanimn.errors.TelegramError;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Request;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.Proxy;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * <p>Class for sending request</p>
 * @author Natanim
 */

/**
 * Natanim Negash
 *  3 March 2025
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
        this.client = new OkHttpClient.Builder().readTimeout(TIMEOUT, TimeUnit.SECONDS)
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

    private RequestBody prepareRequest(AbstractBaseRequest<?, ?> baseRequest){
        if (baseRequest.hasMultipart()){
            MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
            for (Map.Entry<String, Object> param: baseRequest.getParameters().entrySet()){
                String name = param.getKey();
                Object val = param.getValue();
                MediaType contentType = MediaType.parse(baseRequest.getContentType());
                if (val == null) continue;
                if (val instanceof java.io.File file){
                    builder.addFormDataPart(name, file.getName(), RequestBody.create(file, contentType));
                } else {
                    String stringVal;
                    if (val.getClass().getName().startsWith("java.lang") || val.getClass().isPrimitive())
                        stringVal = String.valueOf(val);
                    else stringVal = gson.toJson(val);
                    builder.addFormDataPart(name, stringVal);
                }

            }
            return builder.build();

        } else {
            return RequestBody.create(gson.toJson(baseRequest.getParameters()), JSON);
        }
    }

    private String getUrl(AbstractBaseRequest<?, ?> baseRequest) {
        return String.format(URL, botToken, baseRequest.getMethodName());
    }

    public <T> ApiResponse<T> postRequest(AbstractBaseRequest<?, ?> baseRequest){
        RequestBody requestBody = prepareRequest(baseRequest);
        Request request = builder.url(getUrl(baseRequest))
                .post(requestBody).build();

        try (Response response = client.newCall(request).execute()){
            ResponseBody responseBody = response.body();
            return Util.parseApiResponse(responseBody.string(), baseRequest.getResponseType());
        } catch (UnknownHostException e){
            throw new ConnectionError(String.format("Unable to send request to %s", request.url().url().getHost()));
        } catch (IOException e){
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
