package io.github.natanimn.telebof.types.passport;

import io.github.natanimn.telebof.enums.PassportElementType;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Describes documents or other Telegram Passport elements shared with the bot by the user.
 * @param type Passport element type
 * @param data Base64-encoded encrypted Telegram Passport element data provided by the user; available only for {@link PassportElementType#PERSONAL_DETAILS}, {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE}, {@link PassportElementType#IDENTITY_CARD}, {@link PassportElementType#INTERNAL_PASSPORT} and {@link PassportElementType#ADDRESS} types. Can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
 * @param phoneNumber User's verified phone number; available only for {@link PassportElementType#PHONE_NUMBER} type
 * @param email User's verified email address; available only for {@link PassportElementType#EMAIL} type
 * @param files Array of encrypted files with documents provided by the user; available only for {@link PassportElementType#UTILITY_BILL}, {@link PassportElementType#BANK_STATEMENT}, {@link PassportElementType#RENTAL_AGREEMENT}, {@link PassportElementType#PASSPORT_REGISTRATION} and {@link PassportElementType#TEMPORARY_REGISTRATION} types. Files can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
 * @param frontSide Encrypted file with the front side of the document, provided by the user; available only for {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE}, {@link PassportElementType#IDENTITY_CARD} and {@link PassportElementType#INTERNAL_PASSPORT}. The file can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
 * @param reverseSide Encrypted file with the reverse side of the document, provided by the user; available only for {@link PassportElementType#DRIVER_LICENSE} and {@link PassportElementType#IDENTITY_CARD}. The file can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
 * @param translation Array of encrypted files with translated versions of documents provided by the user; available if requested for {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE}, {@link PassportElementType#IDENTITY_CARD}, {@link PassportElementType#INTERNAL_PASSPORT}, {@link PassportElementType#UTILITY_BILL}, {@link PassportElementType#BANK_STATEMENT}, {@link PassportElementType#RENTAL_AGREEMENT}, {@link PassportElementType#PASSPORT_REGISTRATION} and {@link PassportElementType#TEMPORARY_REGISTRATION} types. Files can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
 * @param selfie Encrypted file with the selfie of the user holding a document, provided by the user; available if requested for {@link PassportElementType#PASSPORT}, {@link PassportElementType#DRIVER_LICENSE}, {@link PassportElementType#IDENTITY_CARD} types. The file can be decrypted and verified using the accompanying {@link EncryptedCredentials}.
 * @param hash Base64-encoded element hash for using in {@link PassportElementErrorUnspecified}
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record EncryptedPassportElement(
        PassportElementType type,
        String data,
        @SerializedName("phone_number") String phoneNumber,
        String email,
        List<PassportFile> files,
        @SerializedName("front_side") PassportFile frontSide,
        @SerializedName("reverse_side") PassportFile reverseSide,
        List<PassportFile> translation,
        PassportFile selfie,
        String hash
) {}