package io.github.natanimn.telebof.types.passport;

import io.github.natanimn.telebof.enums.PassportElementErrorSource;
import io.github.natanimn.telebof.enums.PassportElementType;

/**
 * Represents an issue in one of the data fields that was provided by the user.
 * The error is considered resolved when the field's value changes.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class PassportElementErrorDataField extends PassportElementError {
    public PassportElementErrorDataField(PassportElementType type, String fieldName, String dataHash, String message) {
        super(PassportElementErrorSource.DATA, type, fieldName, dataHash, message);
    }
}
