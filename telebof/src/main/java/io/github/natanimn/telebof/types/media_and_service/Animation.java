package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import lombok.Getter;

/**
 * This object represents an animation file (GIF or H.264/MPEG-4 AVC video without sound).
 * @author Natanim
 * @since 0.1
 */
@Getter
public class Animation implements JsonFormatter {
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

}