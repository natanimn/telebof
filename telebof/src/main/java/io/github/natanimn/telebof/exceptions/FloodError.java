package io.github.natanimn.telebof.exceptions;

import io.github.natanimn.telebof.types.media_and_service.ResponseParameters;

/**
 * Base class for flood errors.
 * @author Natanim
 * @since 18 August 2025
 * @version 1.3.0
 */
public class FloodError extends TelegramApiException {
    /**
     * @param description human readable description
     */
    public FloodError(String description, ResponseParameters parameters) {
        super(420, description, parameters, "FLOOD_ERROR");
    }
}
