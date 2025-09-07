package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.EditedChannelPostHandlers;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling edited channel post events in a declarative manner.
 * Designed specifically for handling events when a channel post is edited,
 * providing filtering options for commands, text content, regular expressions,
 * message types, and custom filtering logic.
 *
 * This annotation enables structured handling of post edits in Telegram channels
 * with comprehensive filtering capabilities.
 * <br><br>
 * It is the same as using {@link io.github.natanimn.telebof.BotClient#onEditedChannelPost(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(EditedChannelPostHandlers.class)
public @interface EditedChannelPostHandler {

    /**
     * Specifies the bot commands to match in edited channel posts.
     * Multiple commands are combined using OR logic - the handler will trigger
     * if the edited channel post contains any of the specified commands.
     *
     * @return array of command strings to match
     * @implNote Empty array matches any edited channel post (no command filtering)
     */
    String[] commands() default {};

    /**
     * Specifies exact text content to match in the edited channel post.
     * Multiple texts are combined using OR logic - the handler will trigger
     * if the edited channel post text exactly matches any of the specified strings.
     *
     * @return array of exact text strings to match
     * @implNote Empty array matches any edited channel post content
     */
    String[] texts() default {};

    /**
     * Regular expression pattern to match against edited channel post text content.
     * The handler will trigger if the edited channel post text matches the specified regex pattern.
     *
     * @return regex pattern string for channel post text matching
     * @implNote Empty string disables regex matching
     */
    String regex() default "";

    /**
     * Specifies the message types to match in edited channel posts.
     * Multiple message types are combined using OR logic - the handler will trigger
     * if the edited channel post type matches any of the specified types.
     *
     * @return array of {@link MessageType} enum values to filter by
     * @implNote Empty array matches all message types in channel posts
     */
    MessageType[] type() default {};

    /**
     * Custom filter class for advanced filtering of edited channel post events.
     * Use this to implement custom logic for determining which channel post edits
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