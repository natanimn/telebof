package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.CallbackHandlers;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling incoming callback queries in a declarative manner.
 * Provides a convenient alternative to programmatic callback registration using
 * {@link io.github.natanimn.telebof.BotClient#onCallback(FilterExecutor, UpdateHandler)}.
 *
 * <p><b>Basic usage example:</b>
 * <pre>{@code
 * @CallbackHandler(data = "hello")
 * void handleHelloCallback(BotContext context, CallbackQuery query) {
 *     // Handle callback with data "hello"
 * }
 * }</pre>
 *
 * Equivalent to:
 * <pre>{@code
 * bot.onCallback(filter -> filter.callbackData("hello"), (ctx, query) -> {});
 * }</pre>
 *
 * <p><b>Advanced example with multiple filters:</b>
 * <pre>{@code
 * @CallbackHandler(
 *     data = {"hi", "hello"},
 *     chatType = ChatType.PRIVATE,
 *     state = "awaiting_response"
 * )
 * void handlePrivateStartCallback(BotContext context, CallbackQuery query) {
 *     // Handle private chat callbacks with data "hi" or "hello"
 *     // and only when conversation state is "awaiting_response"
 * }
 * }</pre>
 *
 * Equivalent to:
 * <pre>{@code
 * bot.onCallback(filter ->
 *     (filter.callbackData("hi") || filter.callbackData("hello")) &&
 *     filter.Private() &&
 *     filter.state("awaiting_response"),
 *     (ctx, query) -> {}
 * );
 * }</pre>
 *
 * <p><b>Custom filter example:</b>
 * <pre>{@code
 * @CallbackHandler(filter = MyCustomFilter.class)
 * void handleCustomCallback(BotContext context, CallbackQuery query) {
 *     // Handle callback using custom filtering logic
 * }
 * }</pre>
 *
 * @author Natanim
 * @since 1.2.0
 * @see io.github.natanimn.telebof.BotClient#onCallback(FilterExecutor, UpdateHandler)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(CallbackHandlers.class)
public @interface CallbackHandler {

    /**
     * Specifies the callback data values to match.
     * Multiple values are combined using OR logic - the handler will trigger
     * if the callback data matches any of the specified values.
     * @return array of callback data strings to match
     * @implNote Empty array matches any callback data
     */
    String[] data() default {};

    /**
     * Specifies the chat types where this callback handler should be active.
     * Multiple chat types are combined using OR logic - the handler will trigger
     * if the chat type matches any of the specified types.
     *
     * @return array of {@link ChatType} enum values to filter by
     * @implNote Empty array matches all chat types
     */
    ChatType[] chatType() default {};

    /**
     * Regular expression pattern to match against callback data.
     * The handler will trigger if the callback data matches the specified regex pattern.
     *
     * @return regex pattern string for callback data matching
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
     * Conversation state required for this callback handler to trigger.
     * The handler will only be invoked if the current conversation state
     * matches the specified state value.
     *
     * @return required conversation state string
     * @implNote Empty string matches any state (no state filtering)
     */
    String state() default "";

    /**
     * Priority order for handler registration and execution.
     * Handlers with lower priority numbers are registered and executed before
     * those with higher numbers. This allows controlling the order of handler
     * processing when multiple handlers could match the same callback.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     * @example A handler with priority 1 executes before one with priority 5
     */
    int priority() default 0;
}