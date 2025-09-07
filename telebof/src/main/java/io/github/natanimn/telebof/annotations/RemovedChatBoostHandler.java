package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.RemovedChatBoostHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling removed chat boost events in a declarative manner.
 * Designed specifically for handling events when chat boosts are removed or expire,
 * providing monitoring capabilities for boost status changes and community engagement metrics.
 *
 * This annotation enables structured handling of boost removal events with
 * custom filtering capabilities for processing boost expiration, voluntary removals,
 * and tracking community support patterns over time.
 *<br><br>
 *  Equivalent with using {@link io.github.natanimn.telebof.BotClient#onRemovedChatBoost(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(RemovedChatBoostHandlers.class)
public @interface RemovedChatBoostHandler {

    /**
     * Custom filter class for advanced filtering of removed chat boost events.
     * Use this to implement custom logic for determining which boost removal events
     * should trigger this handler, such as filtering by boost duration, boost level,
     * removal reason, user demographics, or community impact metrics.
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