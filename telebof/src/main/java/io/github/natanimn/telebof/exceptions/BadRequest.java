package io.github.natanimn.telebof.exceptions;

/**
 * Base class for bad_request errors.
 * @author Natanim
 * @since 18 August 2025
 * @version 1.3.0
 */
public class BadRequest extends TelegramApiException {
    /**
     * @param description human-readable description
     */
    public BadRequest(String description) {
        super(400, description, "BAD_REQUEST");
    }

}
