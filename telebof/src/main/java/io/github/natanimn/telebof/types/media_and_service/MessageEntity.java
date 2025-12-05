package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.EntityType;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This object represents one special entity in a text message. For example, hashtags, usernames, URLs, etc.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class MessageEntity implements Serializable {
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

    public String getUrl() {
        return url;
    }

    public MessageEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public MessageEntity setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Integer getOffset() {
        return offset;
    }

    public MessageEntity setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public MessageEntity setLength(Integer length) {
        this.length = length;
        return this;
    }

    public User getUser() {
        return user;
    }

    public MessageEntity setUser(User user) {
        this.user = user;
        return this;
    }

    public String getCustomEmojiId() {
        return customEmojiId;
    }

    public MessageEntity setCustomEmojiId(String customEmojiId) {
        this.customEmojiId = customEmojiId;
        return this;
    }

    public EntityType getType() {
        return type;
    }

    public MessageEntity setType(EntityType type) {
        this.type = type;
        return this;
    }
}