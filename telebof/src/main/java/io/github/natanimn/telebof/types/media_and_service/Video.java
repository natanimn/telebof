package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a video file.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Video {
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
     * Original filename as defined by the sender
     */
    @SerializedName("file_name")
    private String fileName;

    /**
     * MIME type of the file as defined by the sender
     */
    @SerializedName("mime_type")
    private String mimeType;

    /**
     * File size in bytes.
     */
    @SerializedName("file_size")
    private Integer fileSize;

    /**
     * Video thumbnail
     */
    private PhotoSize thumbnail;

    /**
     * Timestamp in seconds from which the video will play in the message
     */
    @SerializedName("start_timestamp")
    private Integer startTimestamp;

    /**
     * Available sizes of the cover of the video in the message
     */
    private List<PhotoSize> cover;

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

    public Integer getDuration() {
        return duration;
    }

    public String getFileName() {
        return fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public Integer getStartTimestamp() {
        return startTimestamp;
    }

    public List<PhotoSize> getCover() {
        return cover;
    }
}