package io.github.natanimn.telebof.types.passport;

import io.github.natanimn.telebof.enums.PassportElementErrorSource;

/**
 * Represents an issue in an unspecified place.
 * The error is considered resolved when new data is added.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PassportElementErrorUnspecified extends PassportElementError {
    public PassportElementErrorUnspecified(String type, String elementHash, String message) {
        super(PassportElementErrorSource.UNSPECIFIED, type, elementHash, message);
    }
}
