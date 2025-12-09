package io.github.natanimn.telebof.types.chat_and_user;

import java.util.List;

/**
 * This object represents a list of boosts added to a chat by a user.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class UserChatBoosts {
    /**
     * The list of boosts added to the chat by the user
     */
    private List<ChatBoost> boosts;

    public List<ChatBoost> getBoosts() {
        return boosts;
    }
}