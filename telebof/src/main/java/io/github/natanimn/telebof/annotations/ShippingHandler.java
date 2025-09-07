package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.ShippingHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling shipping query events in a declarative manner.
 * Designed specifically for handling events when users proceed with shipping
 * information during checkout processes, providing validation and calculation
 * capabilities for shipping options and costs.
 *
 * This annotation enables structured handling of shipping queries with
 * filtering options for payload content and custom logic for processing
 * shipping information, calculating costs, and validating delivery addresses.
 *<br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onShipping(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ShippingHandlers.class)
public @interface ShippingHandler {

    /**
     * Specifies the shipping query payload identifiers to match.
     * Multiple payload values are combined using OR logic - the handler will trigger
     * if the shipping query payload matches any of the specified identifiers.
     *
     * @return array of payload identifier strings to match
     * @implNote Empty array matches any shipping query payload
     */
    String[] payload() default {};

    /**
     * Custom filter class for advanced filtering of shipping query events.
     * Use this to implement custom logic for determining which shipping queries
     * should trigger this handler, such as filtering by destination regions,
     * shipping methods, product types, weight categories, or customer tiers.
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