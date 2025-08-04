package io.github.natanimn.types.passport;

import io.github.natanimn.enums.PassportElementErrorSource;
import io.github.natanimn.enums.PassportElementType;

/**
 * Represents an issue with a document scan.
 * The error is considered resolved when the file with the document scan changes.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PassportElementErrorFile extends PassportElementError {
    public PassportElementErrorFile(PassportElementType type, String file_hash, String message) {
        super(PassportElementErrorSource.FILE, type, file_hash, message);
    }
}
