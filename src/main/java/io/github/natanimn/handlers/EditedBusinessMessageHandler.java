package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.Message;

@FunctionalInterface
public interface EditedBusinessMessageHandler {
    void handle(BotContext context, Message edited_business_message);
}
