package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents one size of a photo or a file / sticker thumbnail.
 * @param fileId Identifier for this file, which can be used to download or reuse the file
 * @param fileUniqueId Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param width Photo width
 * @param height Photo height
 * @param fileSize Optional. File size in bytes
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record PhotoSize(
        @SerializedName("file_id") String fileId,
        @SerializedName("file_unique_id") String fileUniqueId,
        Integer width,
        Integer height,
        @SerializedName("file_size") Integer fileSize
) {}