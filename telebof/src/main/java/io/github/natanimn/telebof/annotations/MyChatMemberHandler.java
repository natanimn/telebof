package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.MyChatMemberHandlers;
import io.github.natanimn.telebof.enums.ChatMemberStatus;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling the bot's own chat member status updates in a declarative manner.
 * Designed specifically for handling events when the bot's own status changes in a chat,
 * such as when the bot is added to a group, promoted to administrator, restricted, or removed.
 *
 * This annotation enables structured handling of the bot's membership changes with
 * status-based filtering and custom filtering capabilities.
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onMyChatMember(FilterExecutor, UpdateHandler)} 
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(MyChatMemberHandlers.class)
public @interface MyChatMemberHandler {

    /**
     * Specifies the chat member status changes to match for the bot.
     * Multiple status values are combined using OR logic - the handler will trigger
     * if the bot's new status matches any of the specified status values.
     *
     * @return array of {@link ChatMemberStatus} enum values to filter by
     * @implNote Empty array matches all status changes
     */
    ChatMemberStatus[] status() default {};

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