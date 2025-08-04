package io.github.natanimn.requests;

import java.io.File;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.TreeMap;

/**
 * Natanim Negash 
 *  3 March 2025
 */
@SuppressWarnings("unchecked")
abstract public class AbstractBaseRequest<T, R>{
    Map<String, Object> parameters = new TreeMap<>();
    private String contentType = MediaContentType.DEFAULT;
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

    public AbstractBaseRequest(Object chat_id, RequestSender requestSender, String methodName) {
        add("chat_id", chat_id);
        this.requestSender = requestSender;
        this.methodName = methodName;
        this.responseType = Boolean.class;
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

    protected void setContentType(String contentType){
         this.contentType = contentType;
    }

    protected String getContentType() {
        return contentType;
    }

    public final R exec(){
        return requestSender.makeRequest(this);
    }

}
