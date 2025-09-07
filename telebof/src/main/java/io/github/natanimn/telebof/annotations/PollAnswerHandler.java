package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.PollAnswerHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling poll answer events in a declarative manner.
 * Designed specifically for handling events when users answer polls in chats,
 * providing real-time feedback on poll responses and user voting patterns.
 *
 * This annotation enables structured handling of poll interactions with
 * custom filtering capabilities for processing user responses to polls.
 * <br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onPollAnswer(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(PollAnswerHandlers.class)
public @interface PollAnswerHandler {

    /**
     * Custom filter class for advanced filtering of poll answer events.
     * Use this to implement custom logic for determining which poll answers
     * should trigger this handler, such as filtering by specific poll IDs,
     * user characteristics, selected options, or voting patterns.
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