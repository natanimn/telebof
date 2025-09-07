package io.github.natanimn.telebof;

import io.github.natanimn.telebof.types.updates.TelegramUpdate;

@FunctionalInterface
public interface UpdateHandler<T extends TelegramUpdate> {
    void invoke(BotContext ctx, T t) throws Throwable;

}
