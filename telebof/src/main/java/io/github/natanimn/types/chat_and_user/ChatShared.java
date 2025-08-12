package io.github.natanimn.types.chat_and_user;

import io.github.natanimn.types.media_and_service.PhotoSize;

import java.util.List;
import java.util.Objects;

/**
 * This object contains information about a chat that was shared with the bot using a {@link io.github.natanimn.types.keyboard.KeyboardButtonRequestChat} button.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class ChatShared {
    /**
     * Identifier of the request
     */
    public Integer request_id;

    /**
     * Identifier of the shared chat.
     */
    public Long chat_id;

    /**
     * Optional. Title of the chat, if the title was requested by the bot.
     */
    public String title;

    /**
     * Optional. Username of the chat, if the username was requested by the bot and available.
     */
    public String username;

    /**
     * Optional. Available sizes of the chat photo, if the photo was requested by the bot
     */
    public List<PhotoSize> photo;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatShared that = (ChatShared) object;
        return Objects.equals(request_id, that.request_id) && Objects.equals(chat_id, that.chat_id) &&
                Objects.equals(title, that.title) && Objects.equals(username, that.username) && Objects.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request_id, chat_id, title, username, photo);
    }
}
