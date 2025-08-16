package io.github.natanimn.telebof.types.passport;

import io.github.natanimn.telebof.enums.PassportElementType;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Describes documents or other Telegram Passport elements shared with the bot by the user.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class EncryptedPassportElement implements Serializable {
    /**
     * Passport element type
     */
    public PassportElementType type;

    /**
     * Base64-encoded encrypted Telegram Passport element data provided by the user;
     * available only for {@link PassportElementType#PERSONAL_DETAILS}, {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE},
     * {@link PassportElementType#IDENTITY_CARD}, {@link PassportElementType#INTERNAL_PASSPORT} and {@link PassportElementType#ADDRESS} types.
     * Can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */
    public String data;

    /**
     *  User's verified phone number; available only for {@link PassportElementType#PHONE_NUMBER} type
     */
    public String phone_number;

    /**
     * User's verified email address; available only for {@link PassportElementType#EMAIL} type
     */
    public String email;

    /**
     * Array of encrypted files with documents provided by the user;
     * available only for {@link PassportElementType#UTILITY_BILL}, {@link PassportElementType#BANK_STATEMENT},
     * {@link PassportElementType#RENTAL_AGREEMENT}, {@link PassportElementType#PASSPORT_REGISTRATION} and {@link PassportElementType#TEMPORARY_REGISTRATION} types.
     * Files can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */
    public List<PassportFile> files;

    /**
     * Encrypted file with the front side of the document, provided by the user;
     * available only for {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE},
     * {@link PassportElementType#IDENTITY_CARD} and {@link PassportElementType#INTERNAL_PASSPORT}.
     * The file can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */
    public PassportFile front_side;

    /**
     * Encrypted file with the reverse side of the document, provided by the user;
     * available only for {@link PassportElementType#DRIVER_LICENSE} and {@link PassportElementType#IDENTITY_CARD}.
     * The file can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */
    public PassportFile reverse_side;

    /**
     * Array of encrypted files with translated versions of documents provided by the user;
     * available if requested for {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE},
     * {@link PassportElementType#IDENTITY_CARD}, {@link PassportElementType#INTERNAL_PASSPORT},
     * {@link PassportElementType#UTILITY_BILL}, {@link PassportElementType#BANK_STATEMENT},
     * {@link PassportElementType#RENTAL_AGREEMENT}, {@link PassportElementType#PASSPORT_REGISTRATION} and {@link PassportElementType#TEMPORARY_REGISTRATION} types.
     * Files can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */

    public List<PassportFile> translation;

    /**
     * Encrypted file with the selfie of the user holding a document, provided by the user;
     * available if requested for {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE}, {@link PassportElementType#IDENTITY_CARD} types.
     * The file can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
     */
    public PassportFile selfie;

    /**
     * Base64-encoded element hash for using in {@link PassportElementErrorUnspecified}
     */
    public String hash;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        EncryptedPassportElement that = (EncryptedPassportElement) object;
        return  Objects.equals(type, that.type) &&
                Objects.equals(data, that.data) &&
                Objects.equals(phone_number, that.phone_number) &&
                Objects.equals(email, that.email) &&
                Objects.equals(files, that.files) &&
                Objects.equals(front_side, that.front_side) &&
                Objects.equals(reverse_side, that.reverse_side) &&
                Objects.equals(selfie, that.selfie) &&
                Objects.equals(translation, that.translation) &&
                Objects.equals(hash, that.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                type,
                data,
                phone_number,
                email,
                files,
                front_side,
                reverse_side,
                selfie,
                translation,
                hash
        );
    }
}
