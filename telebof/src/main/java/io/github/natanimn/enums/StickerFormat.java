package io.github.natanimn.enums;

import com.google.gson.annotations.SerializedName;

/**
 * @author Natanim
 * @since 3 March, 2025
 * @version 0.7
 */
public enum StickerFormat {
    @SerializedName("static")
    STATIC,

    @SerializedName("animated")
    ANIMATED,

    @SerializedName("video")
    VIDEO
}
