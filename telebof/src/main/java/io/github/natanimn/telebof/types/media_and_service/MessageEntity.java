package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.EntityType;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.chat_and_user.User;

import java.io.Serializable;

/**
 * This object represents one special entity in a text message. For example, hashtags, usernames, URLs, etc.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class MessageEntity implements Serializable {
    /**
     * Optional. For “text_link” only, URL that will be opened after user taps on the text
     */
    public String url;

    /**
     * Optional. For “pre” only, the programming language of the entity text
     */
    public String language;

    /**
     * Offset in <a href="https://core.telegram.org/api/entities#entity-length">UTF-16 code units</a> to the start of the entity
     */
    public Integer offset;

    /**
     * Length of the entity in <a href="https://core.telegram.org/api/entities#entity-length">UTF-16 code units</a>
     */
    public Integer length;

    /**
     * Optional. For “text_mention” only, the mentioned user
     */
    public User user;

    /**
     * Optional. For “custom_emoji” only, unique identifier of the custom emoji.
     * Use {@link BotContext#getCustomEmojiStickers} to get full information about the sticker
     */
    public String custom_emoji_id;

    /**
     * Type of the entity.
     */
    public EntityType type;


    public MessageEntity type(EntityType type) {
        this.type = type;
        return this;
    }

    public MessageEntity offset(int offset) {
        this.offset = offset;
        return this;
    }

    public MessageEntity length(int length) {
        this.length = length;
        return this;
    }

    public MessageEntity url(String url) {
        this.url = url;
        return this;
    }

    public MessageEntity user(User user) {
        this.user = user;
        return this;
    }

    public MessageEntity language(String language) {
        this.language = language;
        return this;

    }

    public MessageEntity customEmojiId(String custom_emoji_id) {
        this.custom_emoji_id = custom_emoji_id;
        return this;
    }
}