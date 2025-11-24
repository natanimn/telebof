package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents an audio file to be treated as music by the Telegram clients.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Audio {
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
     * Optional. Performer of the audio as defined by the sender or by audio tags
     */
    private String performer;

    /**
     * Optional. Title of the audio as defined by the sender or by audio tags
     */
    private String title;

    /**
     * Optional. Original filename as defined by the sender
     */
    @SerializedName("file_name")
    private String fileName;

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

    /**
     * Optional. Thumbnail of the album cover to which the music file belongs
     */
    private PhotoSize thumbnail;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public String getPerformer() {
        return performer;
    }

    public String getTitle() {
        return title;
    }

    public String getFileName() {
        return fileName;
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

    public PhotoSize getThumbnail() {
        return thumbnail;
    }
}