package io.github.natanimn.errors;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ConnectionError extends RuntimeException{
    public ConnectionError(String msg){
        super(msg);
    }
}
