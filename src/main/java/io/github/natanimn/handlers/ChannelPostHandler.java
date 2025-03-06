package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.Message;

@FunctionalInterface
public interface ChannelPostHandler {
    void handle(BotContext context, Message message);
}
