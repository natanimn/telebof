package io.github.natanimn.types.passport;

import io.github.natanimn.enums.PassportElementErrorSource;
import io.github.natanimn.enums.PassportElementType;

/**
 * Represents an issue with the selfie with a document.
 * The error is considered resolved when the file with the selfie changes.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PassportElementErrorSelfie extends PassportElementError {
    public PassportElementErrorSelfie(PassportElementType type, String fileHash, String message) {
        super(PassportElementErrorSource.SELFIE, type, fileHash, message);
    }
}
