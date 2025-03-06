package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.PollAnswer;

@FunctionalInterface
public interface PollAnswerHandler {
    void handle(BotContext context, PollAnswer poll_answer);
}
