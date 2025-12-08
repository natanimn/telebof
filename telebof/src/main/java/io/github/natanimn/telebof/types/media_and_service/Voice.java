package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a voice note.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Voice {
    /**
     * Identifier for this file, which can be used to download or reuse the file
     */
    @SerializedName("file_id")
    private String fileId;

    /**
     * Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    @SerializedName("file_unique_id")
    private String fileUniqueId;

    /**
     * Optional. MIME type of the file as defined by the sender
     */
    @SerializedName("mime_type")
    private String mimeType;

    /**
     * Duration of the audio in seconds as defined by the sender
     */
    private Integer duration;

    /**
     * Optional. File size in bytes.
     */
    @SerializedName("file_size")
    private Long fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Integer getDuration() {
        return duration;
    }

    public Long getFileSize() {
        return fileSize;
    }
}