package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.ChatBoostRemoved;

@FunctionalInterface
public interface RemovedChatBoostHandler {
    void handle(BotContext context, ChatBoostRemoved removed_chat_boost);
}
