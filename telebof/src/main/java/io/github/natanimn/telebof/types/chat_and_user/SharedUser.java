package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.PhotoSize;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object contains information about a user that was shared with the bot using a {@link io.github.natanimn.telebof.types.keyboard.KeyboardButtonRequestUsers} button.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SharedUser {
    /**
     * Identifier of the shared user.
     */
    @SerializedName("user_id")
    private Long userId;

    /**
     * Optional. First name of the user, if the name was requested by the bot
     */
    @SerializedName("first_name")
    private String firstName;

    /**
     * Optional. Last name of the user, if the name was requested by the bot
     */
    @SerializedName("last_name")
    private String lastName;

    /**
     * Optional. Username of the user, if the username was requested by the bot
     */
    private String username;

    /**
     * Optional. Available sizes of the chat photo, if the photo was requested by the bot
     */
    private List<PhotoSize> photo;

    public Long getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }
}