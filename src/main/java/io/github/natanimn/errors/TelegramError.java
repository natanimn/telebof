package io.github.natanimn.errors;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class TelegramError extends RuntimeException{
    public TelegramError(String msg){
        super(msg);
    }
}
