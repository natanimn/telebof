package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.DeletedBusinessMessageHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling deleted business message events in a declarative manner.
 * Designed specifically for handling events when a business message is deleted,
 * typically in the context of Telegram Business accounts and their conversations.
 * <br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onDeletedBusinessMessage(FilterExecutor, UpdateHandler)} 
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(DeletedBusinessMessageHandlers.class)
public @interface DeletedBusinessMessageHandler {

    /**
     * Custom filter class for advanced filtering of deleted business message events.
     * Use this to implement custom logic for determining which message deletion events
     * should trigger this handler, such as filtering by chat type, message content,
     * business account characteristics, or other application-specific criteria.
     *
     * @return class implementing {@link CustomFilter} interface
     * @implNote Defaults to {@link DefaultCustomFilter} which applies to all deletion events
     * @example Filter to only handle deletions from verified business accounts
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Priority order for handler registration and execution.
     * Handlers with lower priority numbers are registered and executed before
     * those with higher numbers. This allows controlling the order of handler
     * processing when multiple handlers could match the same deletion event.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     */
    int priority() default 0;
}