package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.ChatMemberUpdated;

@FunctionalInterface
public interface MyChatMemberHandler {
    void handle(BotContext context, ChatMemberUpdated chat_member_updated);
}
