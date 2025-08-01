package io.github.natanimn.handlers;


import io.github.natanimn.BotContext;
import io.github.natanimn.types.updates.ChosenInlineResult;

@FunctionalInterface
public interface ChosenInlineResultHandler {
    void handle(BotContext context, ChosenInlineResult chosenInlineResult);
}
