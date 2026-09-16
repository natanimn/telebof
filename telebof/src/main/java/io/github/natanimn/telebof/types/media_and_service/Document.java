package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object represents a general file (as opposed to {@link PhotoSize}, {@link Voice} and {@link Audio}).
 * @author Natanim
 * @since 0.1
 */
@Getter
public class Document {
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
     * Optional. File size in bytes.
     */
    @SerializedName("file_size")
    private Long fileSize;

    /**
     * Optional. Document thumbnail as defined by the sender
     */
    private PhotoSize thumbnail;

}