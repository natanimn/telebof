package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.PurchasedPaidMediaHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling purchased paid media events in a declarative manner.
 * Designed specifically for handling events when users purchase paid media content,
 * providing processing capabilities for completed media transactions and content delivery.
 *
 * This annotation enables structured handling of paid media purchases with
 * filtering options for payload content and custom logic for processing
 * media purchase completions and content access provisioning.
 *<br><br>
 *  Equivalent with using {@link io.github.natanimn.telebof.BotClient#onPurchasedPaidMedia(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(PurchasedPaidMediaHandlers.class)
public @interface PurchasedPaidMediaHandler {

    /**
     * Specifies the media purchase payload identifiers to match.
     * Multiple payload values are combined using OR logic - the handler will trigger
     * if the purchase payload matches any of the specified identifiers.
     *
     * @return array of payload identifier strings to match
     * @implNote Empty array matches any media purchase payload
     */
    String[] payload() default {};

    /**
     * Custom filter class for advanced filtering of purchased paid media events.
     * Use this to implement custom logic for determining which media purchases
     * should trigger this handler, such as filtering by media type, purchase amount,
     * content category, user access levels, or other business-specific criteria.
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