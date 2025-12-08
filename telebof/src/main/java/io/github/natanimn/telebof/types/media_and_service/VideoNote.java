package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a video message
 * (available in Telegram apps as of v.4.0).
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class VideoNote {
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
     * Video width and height (diameter of the video message) as defined by the sender
     */
    private Integer length;

    /**
     * Duration of the video in seconds as defined by the sender
     */
    private Integer duration;

    /**
     * Optional. File size in bytes
     */
    @SerializedName("file_size")
    private Integer fileSize;

    /**
     * Optional. Video thumbnail
     */
    private PhotoSize thumbnail;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }
}