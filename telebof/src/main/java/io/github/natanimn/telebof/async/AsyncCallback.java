package io.github.natanimn.telebof.async;

/**
 * Asynchronous callback interface.
 * @param <T>
 * @author Natanim
 * @since 2.0.0
 */
public interface AsyncCallback<T> {
    /**
     * Handles a successful request
     * @param t type
     */
    void onSuccess(T t);

    /**
     * Handles failed request
     * @param exception an exception
     */
    default void onFailure(Exception exception) {
        throw new RuntimeException(exception);
    }
}
