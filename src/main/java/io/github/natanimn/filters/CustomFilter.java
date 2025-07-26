package io.github.natanimn.filters;

import io.github.natanimn.types.updates.Update;

public interface CustomFilter {
    boolean check(Update update);
}