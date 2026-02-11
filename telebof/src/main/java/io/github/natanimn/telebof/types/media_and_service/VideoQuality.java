package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a video file of a specific quality.
 * @author Natanim
 * @version 1.4.0
 * @since 1.4.0
 */
public class VideoQuality {
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
     * Video width
     */
    private Integer width;

    /**
     * Video height
     */
    private Integer height;

    /**
     * Codec that was used to encode the video, for example, “h264”, “h265”, or “av01”
     */
    private String codec;

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

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String getCodec() {
        return codec;
    }

    public Long getFileSize() {
        return fileSize;
    }
}
