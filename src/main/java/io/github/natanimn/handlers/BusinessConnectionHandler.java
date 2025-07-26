package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.updates.BusinessConnection;

@FunctionalInterface
public interface BusinessConnectionHandler {
    void handle(BotContext context, BusinessConnection connection);
}
