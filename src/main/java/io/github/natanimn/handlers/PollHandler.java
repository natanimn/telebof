package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.Poll;

public interface PollHandler {
    void handle(BotContext context, Poll poll);
}
