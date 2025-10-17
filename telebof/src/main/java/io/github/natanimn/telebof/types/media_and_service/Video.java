package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * @param fileId Identifier for this file, which can be used to download or reuse the file
 * @param fileUniqueId Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param width Video width as defined by the sender
 * @param height Video height as defined by the sender
 * @param duration Duration of the video in seconds as defined by the sender
 * @param fileName Original filename as defined by the sender
 * @param mimeType MIME type of the file as defined by the sender
 * @param fileSize File size in bytes.
 * @param thumbnail Video thumbnail
 * @param startTimestamp Timestamp in seconds from which the video will play in the message
 * @param cover Available sizes of the cover of the video in the message
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Video(
        @SerializedName("file_id") String fileId,
        @SerializedName("file_unique_id") String fileUniqueId,
        Integer width,
        Integer height,
        Integer duration,
        @SerializedName("file_name") String fileName,
        @SerializedName("mime_type") String mimeType,
        @SerializedName("file_size") Integer fileSize,
        PhotoSize thumbnail,
        @SerializedName("start_timestamp") Integer startTimestamp,
        List<PhotoSize> cover
) {}