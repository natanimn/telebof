package io.github.natanimn;

import io.github.natanimn.types.media_and_service.ResponseParameters;

import java.util.Objects;

/**
 * ApiResponse class. Telegram response
 * @author Natanim
 * @since 3 March 2025
 */
public class ApiResponse<T> {
    public boolean ok;
    public String description;
    public int error_code;
    public T result;
    public ResponseParameters parameters;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ApiResponse<?> that = (ApiResponse<?>) object;
        return ok == that.ok && error_code == that.error_code &&
                Objects.equals(description, that.description) &&
                Objects.equals(result, that.result) &&
                Objects.equals(parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ok, description, error_code, result, parameters);
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "ok=" + ok +
                ", description='" + description + '\'' +
                ", error_code=" + error_code +
                ", result=" + result +
                ", parameters=" + parameters +
                '}';
    }
}

