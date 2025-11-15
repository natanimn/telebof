package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object contains information about the users whose identifiers were shared with the bot using a {@link io.github.natanimn.telebof.types.keyboard.KeyboardButtonRequestUsers} button.
 * @param requestId Identifier of the request
 * @param users Information about users shared with the bot.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record UsersShared(
        @SerializedName("request_id") Integer requestId,
        List<SharedUser> users
) {}