package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.MessageHandlers;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling incoming messages in a declarative manner.
 * Provides a convenient alternative to programmatic message registration using
 * {@link io.github.natanimn.telebof.BotClient#onMessage(FilterExecutor, UpdateHandler)}.
 *
 * <p><b>Basic command handler example:</b>
 * <pre>{@code
 * @MessageHandler(commands = "start")
 * void handleStartCommand(BotContext context, Message message) {
 *     // Handle /start command
 * }
 * }</pre>
 *
 * Equivalent to:
 * <pre>{@code
 * bot.onMessage(filter -> filter.commands("start"), (ctx, message) -> {});
 * }</pre>
 *
 * <p><b>Advanced example with multiple filters:</b>
 * <pre>{@code
 * @MessageHandler(
 *     commands = {"help", "support"},
 *     chatType = ChatType.PRIVATE,
 *     state = "awaiting_help"
 * )
 * void handlePrivateHelp(BotContext context, Message message) {
 *     // Handle private text messages with commands /help or /support
 *     // matching specific conversation state
 * }
 * }</pre>
 *
 * Equivalent to:
 * <pre>{@code
 * bot.onMessage(filter ->
 *     (filter.commands("help") || filter.commands("support")) &&
 *     filter.Private() &&
 *     filter.state("awaiting_help"),
 *     (ctx, message) -> {}
 * );
 * }</pre>
 *
 * <p><b>Media message example:</b>
 * <pre>{@code
 * @MessageHandler(type = {MessageType.PHOTO, MessageType.VIDEO})
 * void handleMediaMessages(BotContext context, Message message) {
 *     // Handle both photo and video messages
 * }
 * }</pre>
 *
 * @author Natanim
 * @since 1.2.0
 * @see io.github.natanimn.telebof.BotClient#onMessage(FilterExecutor, UpdateHandler)
 * @see MessageType
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Repeatable(MessageHandlers.class)
public @interface MessageHandler {

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
     * Specifies the chat types where this message handler should be active.
     * Multiple chat types are combined using OR logic - the handler will trigger
     * if the chat type matches any of the specified types.
     *
     * @return array of {@link ChatType} enum values to filter by
     * @implNote Empty array matches all chat types
     */
    ChatType[] chatType() default {};

    /**
     * Regular expression pattern to match against message text content.
     * The handler will trigger if the message text matches the specified regex pattern.
     *
     * @return regex pattern string for message text matching
     * @implNote Empty string disables regex matching
     */
    String regex() default "";

    /**
     * Specifies the message types to match (text, photo, video, etc.).
     * Multiple message types are combined using OR logic - the handler will trigger
     * if the message type matches any of the specified types.
     *
     * @return array of {@link MessageType} enum values to filter by
     * @implNote Empty array matches all message types
     */
    MessageType[] type() default {};

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
     * Conversation state required for this message handler to trigger.
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
     * processing when multiple handlers could match the same message.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     */
    int priority() default 0;
}