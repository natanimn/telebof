package io.github.natanimn.telebof.annotations;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;

import io.github.natanimn.telebof.annotations.container.GuestHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;

/**
 * Annotation for handling guest message updates
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(GuestHandlers.class)
public @interface GuestHandler {
    /**
     * Specifies the bot commands to match (e.g., "/start", "/help").
     * Multiple commands are combined using OR logic - the handler will trigger
     * if the message contains any of the specified commands.
     *
     * @return array of command strings to match
     * @implNote Empty array matches any message (no command filtering)
     */
    String[] commands() default {};

    /**
     * Specifies exact text content to match in the message.
     * Multiple texts are combined using OR logic - the handler will trigger
     * if the message text exactly matches any of the specified strings.
     *
     * @return array of exact text strings to match
     * @implNote Empty array matches any message content
     */
    String[] texts() default {};

    /**
     * Regular expression pattern to match against message text content.
     * The handler will trigger if the message text matches the specified regex pattern.
     *
     * @return regex pattern string for message text matching
     * @implNote Empty string disables regex matching
     */
    String regex() default "";

    /**
     * Custom filter class for advanced filtering logic beyond the built-in options.
     * Use this when you need complex or application-specific filtering conditions
     * that cannot be expressed through the other annotation parameters.
     *
     * @return class implementing {@link CustomFilter} interface
     * @implNote Defaults to {@link DefaultCustomFilter} which applies no additional filtering
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Priority order for handler registration and execution.
     * Handlers with lower priority numbers are registered and executed before
     * those with higher numbers. This allows controlling the order of handler
     * processing when multiple handlers could match the same message.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     */
    int priority() default 0;

}
