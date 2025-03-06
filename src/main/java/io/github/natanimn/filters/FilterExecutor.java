package io.github.natanimn.filters;

@FunctionalInterface
public interface FilterExecutor {
    boolean execute(Filter filter);
}
