package io.github.natanimn.types;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class PassportElementErrorDataField extends PassportElementError {
    private String data_hash, field_name;
    public PassportElementErrorDataField(String source, String type, String fieldName, String dataHash, String message) {
        super(source, type, message);
        this.data_hash = dataHash;
        this.field_name = fieldName;
    }

}
