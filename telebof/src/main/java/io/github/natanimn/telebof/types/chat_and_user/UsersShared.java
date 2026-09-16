package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

/**
 * This object contains information about the users whose identifiers were shared with the bot using a {@link io.github.natanimn.telebof.types.keyboard.KeyboardButtonRequestUsers} button.
 * @author Natanim
 * @since 0.1
 */
@Getter
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

}