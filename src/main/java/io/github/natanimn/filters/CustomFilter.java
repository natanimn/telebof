package io.github.natanimn.filters;

import io.github.natanimn.types.Update;

public interface CustomFilter {
    boolean check(Update update);
}