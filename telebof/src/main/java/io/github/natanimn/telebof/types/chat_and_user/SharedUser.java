package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.PhotoSize;

import java.util.List;
import java.util.Objects;

/**
 * This object contains information about a user that was shared with the bot using a {@link io.github.natanimn.telebof.types.keyboard.KeyboardButtonRequestUsers button.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class SharedUser {
    /**
     * 	Identifier of the shared user.
     */
    public Long user_id;

    /**
     * Optional. First name of the user, if the name was requested by the bot
     */
    public String first_name;

    /**
     * Optional. Last name of the user, if the name was requested by the bot
     */
    public String last_name;

    /**
     * Optional. Username of the user, if the username was requested by the bot
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
        SharedUser that = (SharedUser) object;
        return Objects.equals(user_id, that.user_id) && Objects.equals(first_name, that.first_name) &&
                Objects.equals(last_name, that.last_name) && Objects.equals(username, that.username) &&
                Objects.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, first_name, last_name, username, photo);
    }
}
