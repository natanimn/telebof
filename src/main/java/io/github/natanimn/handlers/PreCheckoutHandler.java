package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.updates.PreCheckoutQuery;

public interface PreCheckoutHandler {
    void handle(BotContext context, PreCheckoutQuery pre_checkout_query);
}
