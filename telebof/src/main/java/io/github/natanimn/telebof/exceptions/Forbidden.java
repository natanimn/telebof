package io.github.natanimn.telebof.exceptions;

/**
 * Base class for forbidden errors.
 * @author Natanim
 * @since 18 August 2025
 * @version 0.9.5
 */
public class Forbidden extends TelegramApiException {
    /**
     * @param description human readable description
     * @param name canonical Telegram error name
     */
    public Forbidden(String description, String name) {
        super(403, description, name);
    }
}
