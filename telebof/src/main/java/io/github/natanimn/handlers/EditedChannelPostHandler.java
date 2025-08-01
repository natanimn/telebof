package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.updates.Message;

@FunctionalInterface
public interface EditedChannelPostHandler {
    void handle(BotContext context, Message edited_channel_post);
}
