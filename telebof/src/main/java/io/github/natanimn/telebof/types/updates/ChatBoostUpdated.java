package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.ChatBoost;
import lombok.Getter;

/**
 * This object represents a boost added to a chat or changed.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class ChatBoostUpdated implements TelegramUpdate, JsonFormatter {
    /**
     * Chat which was boosted
     */
    private Chat chat;

    /**
     * Information about the chat boost
     */
    private ChatBoost boost;
}