package io.github.natanimn.telebof.types.chat_and_user;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a list of boosts added to a chat by a user.
 * @param boosts The list of boosts added to the chat by the user
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public record UserChatBoosts(List<ChatBoost> boosts) {}