package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.ChatBoostUpdated;

@FunctionalInterface
public interface ChatBoostHandler {
    void handle(BotContext context, ChatBoostUpdated chat_boost);
}
