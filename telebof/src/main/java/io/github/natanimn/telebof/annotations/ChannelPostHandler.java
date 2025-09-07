package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.ChannelPostHandlers;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling incoming channel posts in a declarative manner.
 * Specifically designed for filtering and handling messages posted in channels.
 *
 * <p><b>Basic command handler example for channels:</b>
 * <pre>{@code
 * @ChannelPostHandler(commands = "announce")
 * void handleAnnounceCommand(BotContext context, Message message) {
 *     // Handle /announce command in channel posts
 * }
 * }</pre>
 *
 * <p><b>Media post example:</b>
 * <pre>{@code
 * @ChannelPostHandler(type = {MessageType.PHOTO, MessageType.VIDEO})
 * void handleChannelMedia(BotContext context, Message message) {
 *     // Handle both photo and video posts in channels
 * }
 * }</pre>
 *
 * <p><b>Advanced example with text matching:</b>
 * <pre>{@code
 * @ChannelPostHandler(texts = {"news", "update"})
 * void handleImportantUpdates(BotContext context, Message message) {
 *     // Handle text posts containing "news" or "update" with "important" prefix
 * }
 * }</pre>
 * <br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onChannelPost(FilterExecutor, UpdateHandler)} 
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ChannelPostHandlers.class)
public @interface ChannelPostHandler {

    /**
     * Specifies the bot commands to match in channel posts (e.g., "/announce", "/news").
     * Multiple commands are combined using OR logic - the handler will trigger
     * if the channel post contains any of the specified commands.
     *
     * @return array of command strings to match
     * @implNote Empty array matches any channel post (no command filtering)
     */
    String[] commands() default {};

    /**
     * Specifies exact text content to match in the channel post.
     * Multiple texts are combined using OR logic - the handler will trigger
     * if the channel post text exactly matches any of the specified strings.
     *
     * @return array of exact text strings to match
     * @implNote Empty array matches any channel post content
     */
    String[] texts() default {};

    /**
     * Regular expression pattern to match against channel post text content.
     * The handler will trigger if the channel post text matches the specified regex pattern.
     *
     * @return regex pattern string for channel post text matching
     * @implNote Empty string disables regex matching
     */
    String regex() default "";

    /**
     * Specifies the message types to match in channel posts (text, photo, video, etc.).
     * Multiple message types are combined using OR logic - the handler will trigger
     * if the channel post type matches any of the specified types.
     *
     * @return array of {@link MessageType} enum values to filter by
     * @implNote Empty array matches all message types in channel posts
     */
    MessageType[] type() default {};

    /**
     * Custom filter class for advanced filtering logic beyond the built-in options.
     * Use this when you need complex or application-specific filtering conditions
     * for channel posts that cannot be expressed through the other annotation parameters.
     *
     * @return class implementing {@link CustomFilter} interface
     * @implNote Defaults to {@link DefaultCustomFilter} which applies no additional filtering
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Priority order for handler registration and execution.
     * Handlers with lower priority numbers are registered and executed before
     * those with higher numbers. This allows controlling the order of handler
     * processing when multiple handlers could match the same channel post.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     * @example A handler with priority -10 executes before one with priority 5
     */
    int priority() default 0;
}