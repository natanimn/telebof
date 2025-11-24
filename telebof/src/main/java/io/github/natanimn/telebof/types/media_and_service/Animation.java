package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents an animation file (GIF or H.264/MPEG-4 AVC video without sound).
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Animation {
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
     * Optional. Original animation filename as defined by the sender
     */
    @SerializedName("file_name")
    private String fileName;

    /**
     * Optional. MIME type of the file as defined by the sender
     */
    @SerializedName("mime_type")
    private String mimeType;

    /**
     * Video width as defined by the sender
     */
    private Integer width;

    /**
     * Video height as defined by the sender
     */
    private Integer height;

    /**
     * Duration of the video in seconds as defined by the sender
     */
    private Integer duration;

    /**
     * Optional. File size in bytes.
     */
    @SerializedName("file_size")
    private Long fileSize;

    /**
     * Optional. Animation thumbnail as defined by the sender
     */
    private PhotoSize thumbnail;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public String getFileName() {
        return fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getDuration() {
        return duration;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }
}