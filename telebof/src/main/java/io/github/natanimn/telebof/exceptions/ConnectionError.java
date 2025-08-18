package io.github.natanimn.telebof.exceptions;

/**
 * Describes connection error
 * @author Natanim
 * @since 3 March 2025
 */
public class ConnectionError extends RuntimeException{
    public ConnectionError(String msg){
        super(msg);
    }
}
