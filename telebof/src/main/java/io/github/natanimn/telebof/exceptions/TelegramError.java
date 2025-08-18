package io.github.natanimn.telebof.exceptions;

/**
 * Represents invalid bot token erro
 * @author Natanim
 * @since 3 March 2025
 */
public class TelegramError extends RuntimeException{
    public TelegramError(String msg){
        super(msg);
    }
}
