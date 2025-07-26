package io.github.natanimn.types.passport;

import io.github.natanimn.enums.PassportElementErrorSource;
import io.github.natanimn.enums.PassportElementType;

/**
 * Represents an issue with a list of scans.
 * The error is considered resolved when the list of files containing the scans changes.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PassportElementErrorFiles extends PassportElementError {
    public PassportElementErrorFiles(PassportElementType type, String[] fileHashes, String message) {
        super(PassportElementErrorSource.FILES, type, fileHashes, message);
    }
}
