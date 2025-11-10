package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.ChatBoost;

/**
 * This object represents a boost added to a chat or changed.
 * @param chat Chat which was boosted
 * @param boost Information about the chat boost
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ChatBoostUpdated(
        Chat chat,
        ChatBoost boost
) implements TelegramUpdate {}