package io.github.natanimn.telebof.exceptions;

/**
 * Base class for bad_request errors.
 * @author Natanim
 * @since 18 August 2025
 * @version 0.9.5
 */
public class BadRequest extends TelegramApiException {
    /**
     * @param description human-readable description
     * @param name canonical Telegram error name
     */
    public BadRequest(String description, String name) {
        super(400, description, name);
    }

}
