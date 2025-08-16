package io.github.natanimn.telebof.types.passport;

import io.github.natanimn.telebof.enums.PassportElementErrorSource;
import io.github.natanimn.telebof.enums.PassportElementType;

/**
 * Represents an issue with the translated version of a document.
 * The error is considered resolved when a file with the document translation change.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PassportElementErrorTranslationFiles extends PassportElementError {
    public PassportElementErrorTranslationFiles(PassportElementType type, String[] fileHashes, String message) {
        super(PassportElementErrorSource.TRANSLATIONAL_FILES, type, fileHashes, message);
    }
}
