package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.ManagedBotHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling managed bot updates
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onMyChatMember(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ManagedBotHandlers.class)
public @interface ManagedBotHandler {
    /**
     * Custom filter class for advanced filtering of the bot's chat member update events.
     * Use this to implement custom logic for determining which of the bot's status changes
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
