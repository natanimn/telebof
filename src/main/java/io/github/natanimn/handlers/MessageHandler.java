package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.updates.Message;

@FunctionalInterface
public interface MessageHandler {
    void handle(BotContext context, Message message);
}
