package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.PhotoSize;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object contains information about a user that was shared with the bot using a {@link io.github.natanimn.telebof.types.keyboard.KeyboardButtonRequestUsers} button.
 * @param userId Identifier of the shared user.
 * @param firstName Optional. First name of the user, if the name was requested by the bot
 * @param lastName Optional. Last name of the user, if the name was requested by the bot
 * @param username Optional. Username of the user, if the username was requested by the bot
 * @param photo Optional. Available sizes of the chat photo, if the photo was requested by the bot
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record SharedUser(
        @SerializedName("user_id") Long userId,
        @SerializedName("first_name") String firstName,
        @SerializedName("last_name") String lastName,
        String username,
        List<PhotoSize> photo
) { }