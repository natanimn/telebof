package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.updates.Message;

@FunctionalInterface
public interface BusinessMessageHandler {
    void handle(BotContext context, Message business_message);
}
