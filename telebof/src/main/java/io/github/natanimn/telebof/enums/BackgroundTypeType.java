package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Describes of {@link io.github.natanimn.telebof.types.media_and_service.BackgroundType#type}
 * @author Natanim
 * @since 12 August 2025
 * @version 0.9
 */
public enum BackgroundTypeType {
    @SerializedName("fill")
    FILL,

    @SerializedName("wallpaper")
    WALLPAPER,

    @SerializedName("pattern")
    PATTERN,

    @SerializedName("chat_theme")
    CHAT_THEME
}
