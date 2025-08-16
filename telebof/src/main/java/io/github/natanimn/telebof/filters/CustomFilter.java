package io.github.natanimn.telebof.filters;

import io.github.natanimn.telebof.types.updates.Update;

/**
 * Custom filter
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9.4
 */
public interface CustomFilter {
    boolean check(Update update);
}