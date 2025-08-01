package io.github.natanimn.types.passport;

import io.github.natanimn.enums.PassportElementErrorSource;
import io.github.natanimn.enums.PassportElementType;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Telegram Passport is a unified authorization method for services that require personal identification.
 * Users can upload their documents once, then instantly share their data with services that require real-world ID (finance, ICOs, etc.).
 * Please see the <a href="https://core.telegram.org/passport">manual</a> for details.
 * </p>
 * <br>
 * This class represents an error in the Telegram Passport element which was submitted that should be resolved by the user.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public abstract class PassportElementError implements Serializable {
    /**
     * Error source
     */
    private PassportElementErrorSource source;

    /**
     * Type of element of the user's Telegram Passport which has the issue.
     * It is {@link PassportElementType} if {@link PassportElementError#source} is different from {@link PassportElementErrorSource#UNSPECIFIED}.
     * Otherwise, it is String
     */
    private Object type;

    /**
     * Error message
     */
    private String message;

    /**
     * Base64-encoded file hash
     */
    private String file_hash;

    /**
     * Base64-encoded element hash
     */
    private String element_hash;

    /**
     * List of base64-encoded file hashes
     */
    private List<String> file_hashes;

    /**
     * Base64-encoded data hash
     */
    private String data_hash;

    /**
     * Name of the data field which has the error
     */
    private String field_name;

    /**
     * @param source Error source
     * @param type Type of element of the user's Telegram Passport which has the issue.
     * @param fileHash Base64-encoded file hash
     * @param message error message
     */
    public PassportElementError(PassportElementErrorSource source, PassportElementType type, String fileHash, String message) {
        this.source = source;
        this.type = type;
        this.message = message;
        this.file_hash = fileHash;
    }

    /**
     * @param source Error source
     * @param type Type of element of the user's Telegram Passport which has the issue.
     * @param message error message
     */
    public PassportElementError(PassportElementErrorSource source, PassportElementType type, String message) {
        this.source = source;
        this.type = type;
        this.message = message;
    }

    /**
     * @param source Error source
     * @param type Type of element of the user's Telegram Passport which has the issue.
     * @param fileHashes List of base64-encoded file hashes
     * @param message error message
     */
    public PassportElementError(PassportElementErrorSource source, PassportElementType type, String[] fileHashes, String message) {
        this.source = source;
        this.type = type;
        this.message = message;
        this.file_hashes = List.of(fileHashes);
    }

    /**
     * @param source Error source
     * @param type Type of element of the user's Telegram Passport which has the issue.
     * @param element_hash Base64-encoded element hash
     * @param message error message
     */
    public PassportElementError(PassportElementErrorSource source, String type, String element_hash, String message) {
        this.source = source;
        this.type = type;
        this.element_hash = element_hash;
        this.message = message;
    }

    /**
     * @param source Error source
     * @param type Type of element of the user's Telegram Passport which has the issue.
     * @param data_hash Base64-encoded data hash
     * @param field_name Name of the data field which has the error
     * @param message error message
     */
    public PassportElementError(PassportElementErrorSource source, PassportElementType type, String field_name, String data_hash, String message) {
        this.source = source;
        this.type = type;
        this.field_name = field_name;
        this.data_hash = data_hash;
        this.message = message;
    }

}
