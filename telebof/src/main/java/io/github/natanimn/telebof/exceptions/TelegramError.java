package io.github.natanimn.telebof.exceptions;

/**
 * Represents invalid bot token error
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class TelegramError extends RuntimeException{
    public TelegramError(String msg){
        super(msg);
    }
}
