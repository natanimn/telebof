package io.github.natanimn.telebof;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.media_and_service.ResponseParameters;

import java.util.Objects;

/**
 * ApiResponse class. Telegram response
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ApiResponse<T> {
    private boolean ok;
    private String description;

    @SerializedName("error_code")
    private Integer errorCode;

    private T result;
    private ResponseParameters parameters;

    public boolean isOk() {
        return ok;
    }

    public String getDescription() {
        return description;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public T getResult() {
        return result;
    }

    public ResponseParameters getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "ok=" + ok +
                ", description='" + description + '\'' +
                ", errorCode=" + errorCode +
                ", result=" + result +
                ", parameters=" + parameters +
                '}';
    }
}

