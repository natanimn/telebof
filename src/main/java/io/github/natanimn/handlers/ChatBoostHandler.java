package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.updates.ChatBoostUpdated;

@FunctionalInterface
public interface ChatBoostHandler {
    void handle(BotContext context, ChatBoostUpdated chat_boost);
}
