package io.github.natanimn.types.media_and_service;

import io.github.natanimn.enums.EntityType;
import io.github.natanimn.types.chat_and_user.User;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class MessageEntity implements Serializable {
    public String url, language;
    public Integer offset, length;
    public User user;
    public String custom_emoji_id;
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

    public MessageEntity customEmojiId(String customEmojiId) {
        this.custom_emoji_id = customEmojiId;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MessageEntity entity = (MessageEntity) object;
        return Objects.equals(url, entity.url) && Objects.equals(language, entity.language) &&
                Objects.equals(type, entity.type) && Objects.equals(offset, entity.offset) &&
                Objects.equals(length, entity.length) && Objects.equals(user, entity.user) &&
                Objects.equals(custom_emoji_id, entity.custom_emoji_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, language, type, offset, length, user, custom_emoji_id);
    }
}