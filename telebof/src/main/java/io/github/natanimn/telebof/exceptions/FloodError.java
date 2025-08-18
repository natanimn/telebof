package io.github.natanimn.telebof.exceptions;

import io.github.natanimn.telebof.types.media_and_service.ResponseParameters;

/**
 * Base class for flood errors.
 * @author Natanim
 * @since 18 August 2025
 * @version 0.9.5
 */
public class FloodError extends TelegramApiException {
    /**
     * @param description human readable description
     * @param name canonical Telegram error name
     */
    public FloodError(String description, String name, ResponseParameters parameters) {
        super(420, description, parameters, name);
    }
}
