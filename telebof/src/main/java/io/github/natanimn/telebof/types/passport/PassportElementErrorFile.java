package io.github.natanimn.telebof.types.passport;

import io.github.natanimn.telebof.enums.PassportElementErrorSource;
import io.github.natanimn.telebof.enums.PassportElementType;

/**
 * Represents an issue with a document scan.
 * The error is considered resolved when the file with the document scan changes.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class PassportElementErrorFile extends PassportElementError {
    public PassportElementErrorFile(PassportElementType type, String fileHash, String message) {
        super(PassportElementErrorSource.FILE, type, fileHash, message);
    }
}
