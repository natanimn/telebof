package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import lombok.Getter;

import java.util.List;

/**
 * This object represents a live photo.
 * @author Natanim
 * @since 2.0.0
 */
@Getter
public class LivePhoto implements JsonFormatter {
    /**
     * Optional. Available sizes of the corresponding static photo
     */
    private List<PhotoSize> photo;

    /**
     * Identifier for the video file which can be used to download or reuse the file
     */
    @SerializedName("file_id")
    private String fileId;

    /**
     * Unique identifier for the video file which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
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
     * Optional. MIME type of the file as defined by the sender
     */
    @SerializedName("mime_type")
    private String mimeType;

    /**
     * Optional. MIME type of the file as defined by the sender
     */
    @SerializedName("file_size")
    private Long fileSize;

}
