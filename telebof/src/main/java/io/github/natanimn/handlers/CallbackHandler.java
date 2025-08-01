package io.github.natanimn.handlers;


import io.github.natanimn.BotContext;
import io.github.natanimn.types.updates.CallbackQuery;

@FunctionalInterface
public interface CallbackHandler {
    void handle(BotContext context, CallbackQuery callbackQuery);
}
