package io.github.natanimn.errors;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class TelegramError extends RuntimeException{
    public TelegramError(String msg){
        super(msg);
    }
}
