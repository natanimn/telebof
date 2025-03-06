package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.BusinessMessagesDeleted;
import io.github.natanimn.types.Message;

@FunctionalInterface
public interface DeletedBusinessMessageHandler {
    void handle(BotContext context, BusinessMessagesDeleted deleted_business_message);
}
