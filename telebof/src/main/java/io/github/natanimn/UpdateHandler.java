package io.github.natanimn;

import io.github.natanimn.types.updates.TelegramUpdate;

@FunctionalInterface
public interface UpdateHandler<T extends TelegramUpdate> {
    void invoke(BotContext ctx, T t);

}
