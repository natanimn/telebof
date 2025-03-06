package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.MessageReactionUpdated;

@FunctionalInterface
public interface MessageReactionHandler {
    void handle(BotContext context, MessageReactionUpdated reaction_updated);

}
