package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a general file (as opposed to {@link PhotoSize}, {@link Voice} and {@link Audio}).
 * @param fileId Identifier for this file, which can be used to download or reuse the file
 * @param fileUniqueId Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param fileName Optional. Original filename as defined by the sender
 * @param mimeType Optional. MIME type of the file as defined by the sender
 * @param fileSize Optional. File size in bytes.
 * @param thumbnail Optional. Document thumbnail as defined by the sender
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Document(
        @SerializedName("file_id") String fileId,
        @SerializedName("file_unique_id") String fileUniqueId,
        @SerializedName("file_name") String fileName,
        @SerializedName("mime_type") String mimeType,
        @SerializedName("file_size") Long fileSize,
        PhotoSize thumbnail
) {}