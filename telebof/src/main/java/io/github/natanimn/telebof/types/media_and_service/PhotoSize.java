package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents one size of a photo or a file / sticker thumbnail.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class PhotoSize {
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
     * Photo width
     */
    private Integer width;

    /**
     * Photo height
     */
    private Integer height;

    /**
     * Optional. File size in bytes
     */
    @SerializedName("file_size")
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getFileSize() {
        return fileSize;
    }
}