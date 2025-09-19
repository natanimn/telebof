package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a chat photo.
 * @param smallFileId File identifier of small (160x160) chat photo. This file_id can be used only for photo download and only for as long as the photo is not changed.
 * @param smallFileUniqueId Unique file identifier of small (160x160) chat photo, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @param bigFileId File identifier of big (640x640) chat photo. This file_id can be used only for photo download and only for as long as the photo is not changed.
 * @param bigFileUniqueId Unique file identifier of big (640x640) chat photo, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.2.4
 */
public record ChatPhoto(
        @SerializedName("small_file_id") String smallFileId,
        @SerializedName("small_file_unique_id") String smallFileUniqueId,
        @SerializedName("big_file_id") String bigFileId,
        @SerializedName("big_file_unique_id") String bigFileUniqueId
) { }