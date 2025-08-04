package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.updates.InlineQuery;

@FunctionalInterface
public interface InlineHandler {
    void handle(BotContext context, InlineQuery inline_query);
}
