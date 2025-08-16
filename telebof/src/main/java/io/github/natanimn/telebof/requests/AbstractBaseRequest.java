package io.github.natanimn.telebof.requests;

import io.github.natanimn.telebof.requests.service.MediaContentType;

import java.io.File;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.TreeMap;

/**
 * Request builder class for Telegram methods
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9.4
 */
@SuppressWarnings("unchecked")
abstract public class AbstractBaseRequest<T, R>{
    protected Map<String, Object> parameters = new TreeMap<>();
    private boolean hasMultipart;
    T type = (T) this;
    protected String methodName ;
    protected RequestSender requestSender;
    private final Type responseType;

    public AbstractBaseRequest(Object chat_id, RequestSender requestSender, String methodName, Type responseType) {
        add("chat_id", chat_id);
        this.requestSender = requestSender;
        this.methodName = methodName;
        this.responseType = responseType;
    }

    public AbstractBaseRequest(RequestSender requestSender, String methodName, Type responseType) {
        this.methodName = methodName;
        this.requestSender = requestSender;
        this.responseType = responseType;
    }

    public AbstractBaseRequest(RequestSender requestSender, String methodName) {
        this.methodName = methodName;
        this.requestSender = requestSender;
        this.responseType = Boolean.class;
    }

    protected Type getResponseType(){
        return responseType;
    }

    final protected T add(String key, Object values) {
        parameters.put(key, values);
        if (!hasMultipart)
            this.setHasMultipart(values instanceof File);
        return type;
    }

    protected void setHasMultipart(boolean hasMultipart) {
        this.hasMultipart = hasMultipart;
    }

    protected Map<String, Object> getParameters() {
        return parameters;
    }

    protected String getMethodName() {
        return methodName;
    }

    protected boolean hasMultipart() {
        return hasMultipart;
    }

    protected String getContentType() {
        return MediaContentType.DEFAULT;
    }

    /**
     * executes the request to Telegram.
     * @return {@link R}
     */
    public final R exec(){
        return requestSender.makeRequest(this);
    }

}
