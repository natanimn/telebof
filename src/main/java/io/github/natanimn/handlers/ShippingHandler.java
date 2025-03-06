package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.ShippingQuery;

@FunctionalInterface
public interface ShippingHandler {
    boolean handle(BotContext context, ShippingQuery shipping_query);
}
