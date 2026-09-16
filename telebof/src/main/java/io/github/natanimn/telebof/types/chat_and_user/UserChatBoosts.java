package io.github.natanimn.telebof.types.chat_and_user;

import lombok.Getter;

import java.util.List;

/**
 * This object represents a list of boosts added to a chat by a user.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class UserChatBoosts {
    /**
     * The list of boosts added to the chat by the user
     */
    private List<ChatBoost> boosts;

}