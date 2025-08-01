package io.github.natanimn.types.passport;

import io.github.natanimn.enums.PassportElementErrorSource;
import io.github.natanimn.enums.PassportElementType;

/**
 * Represents an issue in one of the data fields that was provided by the user.
 * The error is considered resolved when the field's value changes.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PassportElementErrorDataField extends PassportElementError {
    public PassportElementErrorDataField(PassportElementType type, String field_name, String data_hash, String message) {
        super(PassportElementErrorSource.DATA, type, field_name, data_hash, message);
    }
}
