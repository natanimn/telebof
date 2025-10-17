package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a video message
 * (available in Telegram apps as of v.4.0).
 * @param fileId Identifier for this file, which can be used to download or reuse the file
 * @param fileUniqueId Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param length Video width and height (diameter of the video message) as defined by the sender
 * @param duration Duration of the video in seconds as defined by the sender
 * @param fileSize Optional. File size in bytes
 * @param thumbnail Optional. Video thumbnail
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record VideoNote(
        @SerializedName("file_id") String fileId,
        @SerializedName("file_unique_id") String fileUniqueId,
        Integer length,
        Integer duration,
        @SerializedName("file_size") Integer fileSize,
        PhotoSize thumbnail
) {}