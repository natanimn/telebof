package io.github.natanimn.telebof.types.passport;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * <p>
 * <strong>Telegram Passport</strong> is a unified authorization method for services that require personal identification.
 * Users can upload their documents once, then instantly share their data with services that require real-world ID (finance, ICOs, etc.).
 * Please see the <a href="https://core.telegram.org/passport">manual</a> for details.
 * </p>
 *<br>
 * This class represents a file uploaded to Telegram Passport.
 * Currently, all Telegram Passport files are in JPEG format when decrypted and don't exceed 10MB.
 * @param fileId Identifier for this file, which can be used to download or reuse the file
 * @param fileUniqueId Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param fileSize File size in bytes
 * @param fileDate Unix time when the file was uploaded
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record PassportFile(
        @SerializedName("file_id") String fileId,
        @SerializedName("file_unique_id") String fileUniqueId,
        @SerializedName("file_size") Integer fileSize,
        @SerializedName("file_date") Integer fileDate
) {}