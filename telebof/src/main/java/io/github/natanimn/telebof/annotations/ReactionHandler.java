package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.ReactionHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling message reaction events in a declarative manner.
 * Designed specifically for handling events when users add or remove reactions to messages,
 * providing real-time monitoring of user interactions and sentiment expression.
 *
 * This annotation enables structured handling of reaction events with
 * filtering options for specific reaction types and custom logic for
 * processing user engagement and interaction patterns.
 *<br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onReaction(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ReactionHandlers.class)
public @interface ReactionHandler {

    /**
     * Specifies the specific reaction emoji to match.
     * The handler will trigger if the reaction added or removed matches
     * the specified emoji string.
     *
     * @return reaction emoji string to match
     * @implNote Empty string matches any reaction
     * @example "👍", "❤️", "🔥"
     */
    String reaction() default "";

    /**
     * Custom filter class for advanced filtering of reaction events.
     * Use this to implement custom logic for determining which reaction events
     * should trigger this handler, such as filtering by user identity, message content,
     * reaction count, timing patterns, or other engagement metrics.
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