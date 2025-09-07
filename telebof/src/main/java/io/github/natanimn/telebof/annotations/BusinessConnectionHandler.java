package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.BusinessConnectionHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling business connection events in a declarative manner.
 * Designed specifically for handling events related to Telegram Business account connections,
 * providing monitoring capabilities for connection status changes, authorization events,
 * and business account management operations.
 *
 * This annotation enables structured handling of business connection lifecycle events with
 * custom filtering capabilities for processing connection establishment, updates,
 * and termination events in business communication contexts.
 * <b></b>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onBusinessConnection(FilterExecutor, UpdateHandler)} 
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BusinessConnectionHandlers.class)
public @interface BusinessConnectionHandler {

    /**
     * Custom filter class for advanced filtering of business connection events.
     * Use this to implement custom logic for determining which connection events
     * should trigger this handler, such as filtering by business account type,
     * connection status, authorization scope, service categories, or other
     * business-specific connection criteria.
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