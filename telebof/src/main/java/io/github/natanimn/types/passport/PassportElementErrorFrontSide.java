package io.github.natanimn.types.passport;

import io.github.natanimn.enums.PassportElementErrorSource;
import io.github.natanimn.enums.PassportElementType;

/**
 * Represents an issue with the front side of a document.
 * The error is considered resolved when the file with the front side of the document changes.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PassportElementErrorFrontSide extends PassportElementError {
    public PassportElementErrorFrontSide(PassportElementType type, String fileHash, String message) {
       super(PassportElementErrorSource.FRONT_SIDE, type, fileHash, message);
    }
}
