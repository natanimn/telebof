package io.github.natanimn.enums;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.types.media_and_service.MessageEntity;
import java.io.Serializable;

/**
 * Describes {@link MessageEntity#type}
 * @author Natanim
 * @since 3 March, 2025
 * @version 0.7
 */

public enum EntityType implements Serializable {
    @SerializedName("mention")
    MENTION,

    @SerializedName("hashtag")
    HASHTAG,

    @SerializedName("cashtag")
    CASHTAG,

    @SerializedName("bot_command")
    BOT_COMMAND,

    @SerializedName("url")
    URL,

    @SerializedName("email")
    EMAIL,

    @SerializedName("phone_number")
    PHONE_NUMBER,

    @SerializedName("bold")
    BOLD,

    @SerializedName("italic")
    ITALIC,

    @SerializedName("underline")
    UNDERLINE,

    @SerializedName("strikethrough")
    STRIKETHROUGH,

    @SerializedName("spoiler")
    SPOILER,

    @SerializedName("code")
    CODE,

    @SerializedName("pre")
    PRE,

    @SerializedName("text_link")
    TEXT_LINK,

    @SerializedName("text_mention")
    TEXT_MENTION,

    @SerializedName("custom_emoji")
    CUSTOM_EMOJI
}