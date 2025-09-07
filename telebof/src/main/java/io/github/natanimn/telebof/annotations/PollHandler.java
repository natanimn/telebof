package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.PollHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling poll state update events in a declarative manner.
 * Designed specifically for handling events when polls are created, updated,
 * or reach their conclusion in chats, providing real-time monitoring of poll
 * status changes and final results.
 *
 * This annotation enables structured handling of poll lifecycle events with
 * custom filtering capabilities for processing poll state changes and results.
 *<br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onPoll(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(PollHandlers.class)
public @interface PollHandler {

    /**
     * Custom filter class for advanced filtering of poll state update events.
     * Use this to implement custom logic for determining which poll updates
     * should trigger this handler, such as filtering by specific poll types,
     * question content, option counts, completion status, or result thresholds.
     *
     * @return class implementing {@link CustomFilter} interface
     * @implNote Defaults to {@link DefaultCustomFilter} which applies no additional filtering
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Priority order for handler registration and execution.
     * Handlers with lower priority numbers are registered and executed before
     * those with higher numbers.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     */
    int priority() default 0;
}