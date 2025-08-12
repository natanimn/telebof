package io.github.natanimn.enums;

import com.google.gson.annotations.SerializedName;

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
