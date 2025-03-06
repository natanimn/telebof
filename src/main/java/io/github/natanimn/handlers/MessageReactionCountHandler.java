package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.MessageReactionCountUpdated;

@FunctionalInterface
public interface MessageReactionCountHandler {
    void handle(BotContext context, MessageReactionCountUpdated reaction_count_update);
}
