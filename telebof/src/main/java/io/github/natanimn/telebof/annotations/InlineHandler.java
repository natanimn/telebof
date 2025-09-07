package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.InlineHandlers;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling inline query events in a declarative manner.
 * Designed for handling events when users perform inline searches across Telegram,
 * providing filtering options for query content, chat types, regular expressions,
 * and custom filtering logic.
 *
 * This annotation enables structured handling of inline queries with comprehensive
 * filtering capabilities for building responsive inline search experiences.
 * <br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onInline(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(InlineHandlers.class)
public @interface InlineHandler {

    /**
     * Specifies the query text to match in inline searches.
     * Multiple query strings are combined using OR logic - the handler will trigger
     * if the inline query matches any of the specified strings.
     *
     * @return array of query strings to match
     * @implNote Empty array matches any inline query
     */
    String[] query() default {};

    /**
     * Specifies the chat types where this inline handler should be active.
     * Multiple chat types are combined using OR logic - the handler will trigger
     * if the chat type matches any of the specified types.
     *
     * @return array of {@link ChatType} enum values to filter by
     * @implNote Empty array matches all chat types
     */
    ChatType[] chatType() default {};

    /**
     * Regular expression pattern to match against inline query text.
     * The handler will trigger if the inline query matches the specified regex pattern.
     *
     * @return regex pattern string for query matching
     * @implNote Empty string disables regex matching
     */
    String regex() default "";

    /**
     * Custom filter class for advanced filtering of inline query events.
     * Use this to implement custom logic for determining which inline queries
     * should trigger this handler.
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