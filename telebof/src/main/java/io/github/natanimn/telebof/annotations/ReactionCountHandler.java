package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.ReactionCountHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling reaction count update events in a declarative manner.
 * Designed specifically for handling events when message reaction counts change,
 * providing real-time monitoring of user engagement and interaction patterns.
 *
 * This annotation enables structured handling of reaction updates with
 * custom filtering capabilities for processing reaction count changes
 * and tracking message popularity and user engagement metrics.
 *<br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onReactionCount(FilterExecutor, UpdateHandler)}}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ReactionCountHandlers.class)
public @interface ReactionCountHandler {

    /**
     * Custom filter class for advanced filtering of reaction count update events.
     * Use this to implement custom logic for determining which reaction updates
     * should trigger this handler, such as filtering by reaction type, count thresholds,
     * message content, user demographics, or engagement level criteria.
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