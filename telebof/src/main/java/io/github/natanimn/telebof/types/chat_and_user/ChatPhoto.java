package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object represents a chat photo.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class ChatPhoto {
    /**
     * File identifier of small (160x160) chat photo. This file_id can be used only for photo download and only for as long as the photo is not changed.
     */
    @SerializedName("small_file_id")
    private String smallFileId;

    /**
     * Unique file identifier of small (160x160) chat photo, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    @SerializedName("small_file_unique_id")
    private String smallFileUniqueId;

    /**
     * File identifier of big (640x640) chat photo. This file_id can be used only for photo download and only for as long as the photo is not changed.
     */
    @SerializedName("big_file_id")
    private String bigFileId;

    /**
     * Unique file identifier of big (640x640) chat photo, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
     */
    @SerializedName("big_file_unique_id")
    private String bigFileUniqueId;

}