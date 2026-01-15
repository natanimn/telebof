package io.github.natanimn.telebof.types.passport;

import io.github.natanimn.telebof.enums.PassportElementType;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Describes documents or other Telegram Passport elements shared with the bot by the user.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class EncryptedPassportElement {
    /**
     * Passport element type
     */
    private PassportElementType type;

    /**
     * Base64-encoded encrypted Telegram Passport element data provided by the user; available only for {@link PassportElementType#PERSONAL_DETAILS}, {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE}, {@link PassportElementType#IDENTITY_CARD}, {@link PassportElementType#INTERNAL_PASSPORT} and {@link PassportElementType#ADDRESS} types. Can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */
    private String data;

    /**
     * User's verified phone number; available only for {@link PassportElementType#PHONE_NUMBER} type
     */
    @SerializedName("phone_number")
    private String phoneNumber;

    /**
     * User's verified email address; available only for {@link PassportElementType#EMAIL} type
     */
    private String email;

    /**
     * Array of encrypted files with documents provided by the user; available only for {@link PassportElementType#UTILITY_BILL}, {@link PassportElementType#BANK_STATEMENT}, {@link PassportElementType#RENTAL_AGREEMENT}, {@link PassportElementType#PASSPORT_REGISTRATION} and {@link PassportElementType#TEMPORARY_REGISTRATION} types. Files can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */
    private List<PassportFile> files;

    /**
     * Encrypted file with the front side of the document, provided by the user; available only for {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE}, {@link PassportElementType#IDENTITY_CARD} and {@link PassportElementType#INTERNAL_PASSPORT}. The file can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */
    @SerializedName("front_side")
    private PassportFile frontSide;

    /**
     * Encrypted file with the reverse side of the document, provided by the user; available only for {@link PassportElementType#DRIVER_LICENSE} and {@link PassportElementType#IDENTITY_CARD}. The file can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */
    @SerializedName("reverse_side")
    private PassportFile reverseSide;

    /**
     * Array of encrypted files with translated versions of documents provided by the user; available if requested for {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE}, {@link PassportElementType#IDENTITY_CARD}, {@link PassportElementType#INTERNAL_PASSPORT}, {@link PassportElementType#UTILITY_BILL}, {@link PassportElementType#BANK_STATEMENT}, {@link PassportElementType#RENTAL_AGREEMENT}, {@link PassportElementType#PASSPORT_REGISTRATION} and {@link PassportElementType#TEMPORARY_REGISTRATION} types. Files can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */
    private List<PassportFile> translation;

    /**
     * Encrypted file with the selfie of the user holding a document, provided by the user; available if requested for {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE}, {@link PassportElementType#IDENTITY_CARD} types. The file can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */
    private PassportFile selfie;

    /**
     * Base64-encoded element hash for using in {@link PassportElementErrorUnspecified}
     */
    private String hash;

    public PassportElementType getType() {
        return type;
    }

    public String getData() {
        return data;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<PassportFile> getFiles() {
        return files;
    }

    public PassportFile getFrontSide() {
        return frontSide;
    }

    public PassportFile getReverseSide() {
        return reverseSide;
    }

    public List<PassportFile> getTranslation() {
        return translation;
    }

    public PassportFile getSelfie() {
        return selfie;
    }

    public String getHash() {
        return hash;
    }
}