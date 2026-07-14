package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Represents type of rich text message
 * @author Natanim
 * @since 2.1
 */
public enum RichTextType {
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

    @SerializedName("date_time")
    DATE_TIME,

    @SerializedName("text_mention")
    TEXT_MENTION,

    @SerializedName("subscript")
    SUBSCRIPT,

    @SerializedName("superscript")
    SUPERSCRIPT,

    @SerializedName("marked")
    MARKED,

    @SerializedName("code")
    CODE,

    @SerializedName("custom_emoji")
    CUSTOM_EMOJI,

    @SerializedName("mathematical_expression")
    MATHEMATICAL_EXPRESSION,

    @SerializedName("url")
    URL,

    @SerializedName("email_address")
    EMAIL_ADDRESS,

    @SerializedName("phone_number")
    PHONE_NUMBER,

    @SerializedName("bank_card_number")
    BANK_CARD_NUMBER,

    @SerializedName("mention")
    MENTION,

    @SerializedName("hashtag")
    HASHTAG,

    @SerializedName("cashtag")
    CASHTAG,

    @SerializedName("bot_command")
    BOT_COMMAND,

    @SerializedName("anchor")
    ANCHOR,

    @SerializedName("anchor_link")
    ANCHOR_LINK,

    @SerializedName("reference")
    REFERENCE,

    @SerializedName("reference_link")
    REFERENCE_LINK,
}
