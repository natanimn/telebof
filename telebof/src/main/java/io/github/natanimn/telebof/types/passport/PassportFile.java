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
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class PassportFile{
    /**
     * Identifier for this file, which can be used to download or reuse the file
     */
    @SerializedName("file_id")
    private String fileId;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots.
     * Can't be used to download or reuse the file.
     */
    @SerializedName("file_unique_id")
    private String fileUniqueId;

    /**
     * File size in bytes
     */
    @SerializedName("file_size")
    private Integer fileSize;

    /**
     *  Unix time when the file was uploaded
     */
    @SerializedName("file_date")
    private Integer fileDate;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public Integer getFileDate() {
        return fileDate;
    }
}