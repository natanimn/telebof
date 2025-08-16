package io.github.natanimn.telebof.types.passport;

import io.github.natanimn.telebof.enums.PassportElementErrorSource;
import io.github.natanimn.telebof.enums.PassportElementType;

/**
 * Represents an issue with the reverse side of a document.
 * The error is considered resolved when the file with reverse side of the document changes.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PassportElementErrorReverseSide extends PassportElementError {
    public PassportElementErrorReverseSide(PassportElementType type, String fileHash, String message) {
        super(PassportElementErrorSource.REVERSE_SIDE, type, fileHash, message);
    }
}
