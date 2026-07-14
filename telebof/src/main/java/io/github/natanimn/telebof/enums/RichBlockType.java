package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Represents type of text block
 * @author Natanim
 * @since 2.1
 */
public enum RichBlockType {
    @SerializedName("paragraph")
    PARAGRAPH,

    @SerializedName("heading")
    HEADING,

    @SerializedName("pre")
    PRE,

    @SerializedName("footer")
    FOOTER,

    @SerializedName("divider")
    DIVIDER,

    @SerializedName("mathematical_expression")
    MATHEMATICAL_EXPRESSION,

    @SerializedName("anchor")
    ANCHOR,

    @SerializedName("list")
    LIST,

    @SerializedName("blockquote")
    BLOCKQUOTE,

    @SerializedName("pullquote")
    PULLQUOTE,

    @SerializedName("collage")
    COLLAGE,

    @SerializedName("slideshow")
    SLIDESHOW,

    @SerializedName("table")
    TABLE,

    @SerializedName("details")
    DETAILS,

    @SerializedName("map")
    MAP,

    @SerializedName("animation")
    ANIMATION,

    @SerializedName("audio")
    AUDIO,

    @SerializedName("photo")
    PHOTO,

    @SerializedName("video")
    VIDEO,

    @SerializedName("voice_note")
    VOICE_NOTE,

    @SerializedName("thinking")
    THINKING,

}
