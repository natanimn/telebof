package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.ChatJoinRequest;

@FunctionalInterface
public interface ChatJoinRequestHandler {
    boolean handle(BotContext context, ChatJoinRequest chatJoinRequest);
}
