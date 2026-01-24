package io.github.natanimn.telebof.exceptions;

/**
 * Base class for forbidden errors.
 * @author Natanim
 * @since 18 August 2025
 * @version 1.3.0
 */
public class Forbidden extends TelegramApiException {
    /**
     * @param description human readable description
     */
    public Forbidden(String description) {
        super(403, description, "FORBIDDEN");
    }
}
