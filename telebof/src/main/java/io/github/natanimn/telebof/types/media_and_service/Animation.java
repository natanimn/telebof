package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents an animation file (GIF or H.264/MPEG-4 AVC video without sound).
 * @param fileId Identifier for this file, which can be used to download or reuse the file
 * @param fileUniqueId Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param fileName Optional. Original animation filename as defined by the sender
 * @param mimeType Optional. MIME type of the file as defined by the sender
 * @param width Video width as defined by the sender
 * @param height Video height as defined by the sender
 * @param duration Duration of the video in seconds as defined by the sender
 * @param fileSize Optional. File size in bytes.
 * @param thumbnail Optional. Animation thumbnail as defined by the sender
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Animation(
        @SerializedName("file_id") String fileId,
        @SerializedName("file_unique_id") String fileUniqueId,
        @SerializedName("file_name") String fileName,
        @SerializedName("mime_type") String mimeType,
        Integer width,
        Integer height,
        Integer duration,
        @SerializedName("file_size") Long fileSize,
        PhotoSize thumbnail
) {}