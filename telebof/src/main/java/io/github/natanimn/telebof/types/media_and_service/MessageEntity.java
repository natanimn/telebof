package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.EntityType;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This object represents one special entity in a text message. For example, hashtags, usernames, URLs, etc.
 * @param url Optional. For “text_link” only, URL that will be opened after user taps on the text
 * @param language Optional. For “pre” only, the programming language of the entity text
 * @param offset Offset in UTF-16 code units to the start of the entity
 * @param length Length of the entity in UTF-16 code units
 * @param user Optional. For “text_mention” only, the mentioned user
 * @param customEmojiId Optional. For “custom_emoji” only, unique identifier of the custom emoji. Use {@link BotContext#getCustomEmojiStickers} to get full information about the sticker
 * @param type Type of the entity.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record MessageEntity(
        String url,
        String language,
        Integer offset,
        Integer length,
        User user,
        @SerializedName("custom_emoji_id") String customEmojiId,
        EntityType type
) implements Serializable {

    /**
     * Creates a new MessageEntity builder
     */
    public static MessageEntityBuilder builder() {
        return new MessageEntityBuilder();
    }

    /**
     * Builder class for MessageEntity
     */
    public static class MessageEntityBuilder {
        private String url;
        private String language;
        private Integer offset;
        private Integer length;
        private User user;
        private String customEmojiId;
        private EntityType type;

        public MessageEntityBuilder type(EntityType type) {
            this.type = type;
            return this;
        }

        public MessageEntityBuilder offset(int offset) {
            this.offset = offset;
            return this;
        }

        public MessageEntityBuilder length(int length) {
            this.length = length;
            return this;
        }

        public MessageEntityBuilder url(String url) {
            this.url = url;
            return this;
        }

        public MessageEntityBuilder user(User user) {
            this.user = user;
            return this;
        }

        public MessageEntityBuilder language(String language) {
            this.language = language;
            return this;
        }

        public MessageEntityBuilder customEmojiId(String customEmojiId) {
            this.customEmojiId = customEmojiId;
            return this;
        }

        public MessageEntity build() {
            return new MessageEntity(
                    url,
                    language,
                    offset,
                    length,
                    user,
                    customEmojiId,
                    type
            );
        }
    }
}