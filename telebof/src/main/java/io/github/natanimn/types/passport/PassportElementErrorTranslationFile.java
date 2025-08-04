package io.github.natanimn.types.passport;

import io.github.natanimn.enums.PassportElementErrorSource;
import io.github.natanimn.enums.PassportElementType;

/**
 * Represents an issue with one of the files that constitute the translation of a document.
 * The error is considered resolved when the file changes.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PassportElementErrorTranslationFile extends PassportElementError {
    public PassportElementErrorTranslationFile(PassportElementType type, String fileHash, String message) {
        super(PassportElementErrorSource.TRANSLATIONAL_FILE, type, fileHash, message);
    }
}
