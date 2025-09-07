package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.EditedMessageHandlers;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;
import java.lang.annotation.ElementType;

/**
 * Annotation for handling edited message events in a declarative manner.
 * Designed for handling events when any message is edited across various chat types,
 * providing comprehensive filtering options including commands, text content,
 * chat types, regular expressions, message types, conversation states, and custom filters.
 *
 * This annotation enables structured handling of message edits with the same
 * comprehensive filtering capabilities as MessageHandler but specifically for edited messages.
 * <br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onEditedMessage(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(EditedMessageHandlers.class)
public @interface EditedMessageHandler {

    /**
     * Specifies the bot commands to match in edited messages.
     * Multiple commands are combined using OR logic - the handler will trigger
     * if the edited message contains any of the specified commands.
     *
     * @return array of command strings to match
     * @implNote Empty array matches any edited message (no command filtering)
     */
    String[] commands() default {};

    /**
     * Specifies exact text content to match in the edited message.
     * Multiple texts are combined using OR logic - the handler will trigger
     * if the edited message text exactly matches any of the specified strings.
     *
     * @return array of exact text strings to match
     * @implNote Empty array matches any edited message content
     */
    String[] texts() default {};

    /**
     * Specifies the chat types where this edited message handler should be active.
     * Multiple chat types are combined using OR logic - the handler will trigger
     * if the chat type matches any of the specified types.
     *
     * @return array of {@link ChatType} enum values to filter by
     * @implNote Empty array matches all chat types
     */
    ChatType[] chatType() default {};

    /**
     * Regular expression pattern to match against edited message text content.
     * The handler will trigger if the edited message text matches the specified regex pattern.
     *
     * @return regex pattern string for message text matching
     * @implNote Empty string disables regex matching
     */
    String regex() default "";

    /**
     * Specifies the message types to match in edited messages.
     * Multiple message types are combined using OR logic - the handler will trigger
     * if the edited message type matches any of the specified types.
     *
     * @return array of {@link MessageType} enum values to filter by
     * @implNote Empty array matches all message types
     */
    MessageType[] type() default {};

    /**
     * Custom filter class for advanced filtering of edited message events.
     * Use this to implement custom logic for determining which message edits
     * should trigger this handler.
     *
     * @return class implementing {@link CustomFilter} interface
     * @implNote Defaults to {@link DefaultCustomFilter} which applies no additional filtering
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Conversation state required for this edited message handler to trigger.
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
     * those with higher numbers.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     */
    int priority() default 0;
}