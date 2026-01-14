package io.github.natanimn.telebof.types.passport;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.PassportElementErrorSource;
import io.github.natanimn.telebof.enums.PassportElementType;

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
 * @version 1.3.0
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
    @SerializedName("file_hash")
    private String fileHash;

    /**
     * Base64-encoded element hash
     */
    @SerializedName("element_hash")
    private String elementHash;

    /**
     * List of base64-encoded file hashes
     */
    @SerializedName("file_hashes")
    private List<String> fileHashes;

    /**
     * Base64-encoded data hash
     */
    @SerializedName("data_hash")
    private String dataHash;

    /**
     * Name of the data field which has the error
     */
    @SerializedName("field_name")
    private String fieldName;

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
        this.fileHash = fileHash;
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
        this.fileHashes = List.of(fileHashes);
    }

    /**
     * @param source Error source
     * @param type Type of element of the user's Telegram Passport which has the issue.
     * @param elementHash Base64-encoded element hash
     * @param message error message
     */
    public PassportElementError(PassportElementErrorSource source, String type, String elementHash, String message) {
        this.source = source;
        this.type = type;
        this.elementHash = elementHash;
        this.message = message;
    }

    /**
     * @param source Error source
     * @param type Type of element of the user's Telegram Passport which has the issue.
     * @param dataHash Base64-encoded data hash
     * @param fieldName Name of the data field which has the error
     * @param message error message
     */
    public PassportElementError(PassportElementErrorSource source, PassportElementType type, String fieldName, String dataHash, String message) {
        this.source = source;
        this.type = type;
        this.fieldName = fieldName;
        this.dataHash = dataHash;
        this.message = message;
    }

}
