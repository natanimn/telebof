package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.PreCheckoutHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling pre-checkout query events in a declarative manner.
 * Designed specifically for handling events when users initiate payment processes,
 * providing validation and processing capabilities before completing transactions.
 *
 * This annotation enables structured handling of payment pre-authorization with
 * filtering options for payload content, regular expressions, and custom logic
 * for validating and processing payment requests.
 * <br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onPreCheckout(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(PreCheckoutHandlers.class)
public @interface PreCheckoutHandler {

    /**
     * Specifies the payment payload identifiers to match in pre-checkout queries.
     * Multiple payload values are combined using OR logic - the handler will trigger
     * if the payment payload matches any of the specified identifiers.
     *
     * @return array of payload identifier strings to match
     * @implNote Empty array matches any payment payload
     */
    String[] payload() default {};

    /**
     * Regular expression pattern to match against payment payload content.
     * The handler will trigger if the payment payload matches the specified regex pattern.
     *
     * @return regex pattern string for payload matching
     * @implNote Empty string disables regex matching
     */
    String regex() default "";

    /**
     * Custom filter class for advanced filtering of pre-checkout query events.
     * Use this to implement custom logic for determining which payment requests
     * should trigger this handler, such as filtering by payment amount, currency,
     * user payment history, inventory availability, or other business rules.
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