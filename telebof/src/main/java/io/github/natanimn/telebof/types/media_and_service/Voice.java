package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a voice note.
 * @param fileId Identifier for this file, which can be used to download or reuse the file
 * @param fileUniqueId Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param mimeType Optional. MIME type of the file as defined by the sender
 * @param duration Duration of the audio in seconds as defined by the sender
 * @param fileSize Optional. File size in bytes.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Voice(
        @SerializedName("file_id") String fileId,
        @SerializedName("file_unique_id") String fileUniqueId,
        @SerializedName("mime_type") String mimeType,
        Integer duration,
        @SerializedName("file_size") Long fileSize
) {}