package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.Message;

@FunctionalInterface
public interface EditedMessageHandler {
    void handle(BotContext context, Message edited_message);
}
