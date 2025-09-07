package io.github.natanimn.telebof.filters;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Update;

public class DefaultCustomFilter implements CustomFilter{
    @Override
    public boolean check(Update update) {
        return true;
    }
}
