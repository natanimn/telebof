package io.github.natanimn.handlers;


import io.github.natanimn.BotContext;
import io.github.natanimn.types.ChatMemberUpdated;

@FunctionalInterface
public interface ChatMemberHandler {
    void handle(BotContext context, ChatMemberUpdated chatMemberUpdated);
}
