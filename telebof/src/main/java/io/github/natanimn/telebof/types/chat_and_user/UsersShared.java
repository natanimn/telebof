package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object contains information about the users whose identifiers were shared with the bot using a {@link io.github.natanimn.telebof.types.keyboard.KeyboardButtonRequestUsers} button.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class UsersShared {
    /**
     * Identifier of the request
     */
    @SerializedName("request_id")
    private Integer requestId;

    /**
     * Information about users shared with the bot.
     */
    private List<SharedUser> users;

    public Integer getRequestId() {
        return requestId;
    }

    public List<SharedUser> getUsers() {
        return users;
    }
}