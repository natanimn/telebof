package io.github.natanimn.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Describes chat action
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public enum ChatAction {
    @SerializedName("typing")
    TYPING,

    @SerializedName("upload_photo")
    UPLOAD_PHOTO,

    @SerializedName("upload_vide")
    UPLOAD_VIDEO,

    @SerializedName("upload_document")
    UPLOAD_DOCUMENT,

    @SerializedName("record_voice")
    RECORD_VOICE,

    @SerializedName("upload_voice")
    UPLOAD_VOICE,

    @SerializedName("chose_sticker")
    CHOSE_STICKER,

    @SerializedName("find_location")
    FIND_LOCATION,

    @SerializedName("record_video")
    RECORD_VIDEO,

    @SerializedName("upload_video_note")
    UPLOAD_VIDEO_NOTE,

    @SerializedName("record_video_note")
    RECORD_VIDEO_NOTE,
}
