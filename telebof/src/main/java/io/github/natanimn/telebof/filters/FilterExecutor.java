package io.github.natanimn.telebof.filters;

/**
 * Filter executor
 * @author Natanim
 * @since 3 March 20025
 * @version 0.9.4
 */
@FunctionalInterface
public interface FilterExecutor {
    boolean execute(Filter filter);
}
