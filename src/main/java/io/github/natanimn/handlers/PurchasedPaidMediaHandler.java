package io.github.natanimn.handlers;

import io.github.natanimn.BotContext;
import io.github.natanimn.types.PaidMediaPurchased;

@FunctionalInterface
public interface PurchasedPaidMediaHandler {
    void handle(BotContext context, PaidMediaPurchased paidMediaPurchased);
}
