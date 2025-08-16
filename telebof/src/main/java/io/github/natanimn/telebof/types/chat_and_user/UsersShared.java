package io.github.natanimn.telebof.types.chat_and_user;

import java.util.List;

/**
 * This object contains information about the users whose identifiers were shared with the bot using a {@link io.github.natanimn.telebof.types.keyboard.KeyboardButtonRequestUsers} button.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class UsersShared {
    /**
     * Identifier of the request
     */
    public Integer request_id;

    /**
     * Information about users shared with the bot.
     */
    public List<SharedUser> users;

}
