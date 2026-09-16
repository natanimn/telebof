package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.EntityType;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * This object represents one special entity in a text message. For example, hashtags, usernames, URLs, etc.
 * @author Natanim
 * @since 0.1
 */
@Getter
@Setter
@Accessors(chain = true)
public class MessageEntity implements Serializable, JsonFormatter {
    /**
     * Optional. For “text_link” only, URL that will be opened after user taps on the text
     */
    private String url;

    /**
     * Optional. For “pre” only, the programming language of the entity text
     */
    private String language;

    /**
     * Offset in UTF-16 code units to the start of the entity
     */
    private Integer offset;

    /**
     * Length of the entity in UTF-16 code units
     */
    private Integer length;

    /**
     * Optional. For “text_mention” only, the mentioned user
     */
    private User user;

    /**
     * Optional. For “custom_emoji” only, unique identifier of the custom emoji. Use {@link BotContext#getCustomEmojiStickers} to get full information about the sticker
     */
    @SerializedName("custom_emoji_id")
    private String customEmojiId;

    /**
     * Type of the entity.
     */
    private EntityType type;

}