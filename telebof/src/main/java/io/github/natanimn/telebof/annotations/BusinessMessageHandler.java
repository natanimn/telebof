package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.BusinessMessageHandlers;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling business message events in a declarative manner.
 * Designed specifically for handling messages within Telegram Business accounts,
 * providing comprehensive filtering options for commands, text content, chat types,
 * regular expressions, message types, conversation states, and custom business logic.
 *
 * This annotation enables structured handling of business communications with
 * the same comprehensive filtering capabilities as MessageHandler but specifically
 * tailored for business account contexts and professional communication needs.
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onBusinessMessage(FilterExecutor, UpdateHandler)}
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Repeatable(BusinessMessageHandlers.class)
public @interface BusinessMessageHandler {

    /**
     * Specifies the bot commands to match in business messages.
     * Multiple commands are combined using OR logic - the handler will trigger
     * if the business message contains any of the specified commands.
     *
     * @return array of command strings to match
     * @implNote Empty array matches any business message (no command filtering)
     */
    String[] commands() default {};

    /**
     * Specifies exact text content to match in business messages.
     * Multiple texts are combined using OR logic - the handler will trigger
     * if the business message text exactly matches any of the specified strings.
     *
     * @return array of exact text strings to match
     * @implNote Empty array matches any business message content
     */
    String[] texts() default {};

    /**
     * Specifies the chat types where this business message handler should be active.
     * Multiple chat types are combined using OR logic - the handler will trigger
     * if the chat type matches any of the specified types.
     *
     * @return array of {@link ChatType} enum values to filter by
     * @implNote Empty array matches all chat types
     */
    ChatType[] chatType() default {};

    /**
     * Regular expression pattern to match against business message text content.
     * The handler will trigger if the business message text matches the specified regex pattern.
     *
     * @return regex pattern string for message text matching
     * @implNote Empty string disables regex matching
     */
    String regex() default "";

    /**
     * Specifies the message types to match in business messages.
     * Multiple message types are combined using OR logic - the handler will trigger
     * if the business message type matches any of the specified types.
     *
     * @return array of {@link MessageType} enum values to filter by
     * @implNote Empty array matches all message types
     */
    MessageType[] type() default {};

    /**
     * Custom filter class for advanced filtering of business message events.
     * Use this to implement custom logic for determining which business messages
     * should trigger this handler, such as filtering by business account type,
     * customer tiers, service categories, or other business-specific criteria.
     *
     * @return class implementing {@link CustomFilter} interface
     * @implNote Defaults to {@link DefaultCustomFilter} which applies no additional filtering
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Conversation state required for this business message handler to trigger.
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