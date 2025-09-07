package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.ChatBoostHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling chat boost events in a declarative manner.
 * Designed specifically for handling events when a chat receives a boost,
 * which can include supergroup upgrades, premium features activation,
 * or other boost-related notifications.
 *
 * <p><b>Basic chat boost handler example:</b>
 * <pre>{@code
 * @ChatBoostHandler
 * void handleChatBoost(BotContext context, ChatBoostUpdated boost) {
 *     // Handle chat boost event
 *
 * }
 * }</pre>
 *
 * <p><b>Custom filtered boost handler example:</b>
 * <pre>{@code
 * @ChatBoostHandler(filter = PremiumBoostFilter.class)
 * void handlePremiumBoost(BotContext context, ChatBoostUpdated boost) {
 *     // Handle premium-level chat boosts using custom filtering
 * }
 * }</pre>
 *
 * <p><b>Multiple boost handlers with priorities:</b>
 * <pre>{@code
 * @ChatBoostHandler(priority = -10)
 * void handleFirstBoost(BotContext context, ChatBoostUpdated boost) {
 *     // This handler executes first due to lower priority
 * }
 *
 * @ChatBoostHandler(priority = 0)
 * void handleSecondBoost(BotContext context, ChatBoostUpdated boost) {
 *     // This handler executes second
 * }
 * }</pre>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onChatBoost(FilterExecutor, UpdateHandler)} 
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ChatBoostHandlers.class)
public @interface ChatBoostHandler {

    /**
     * Custom filter class for advanced filtering of chat boost events.
     * Use this to implement custom logic for determining which boost events
     * should trigger this handler, such as filtering by boost count, boost level,
     * booster information, or other application-specific criteria.
     *
     * @return class implementing {@link CustomFilter} interface
     * @implNote Defaults to {@link DefaultCustomFilter} which applies to all boost events
     * @example Filter to only handle boosts that reach a certain level
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Priority order for handler registration and execution.
     * Handlers with lower priority numbers are registered and executed before
     * those with higher numbers. This allows controlling the order of handler
     * processing when multiple handlers could match the same chat boost event.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     * @example A handler with priority -10 executes before one with priority 5
     */
    int priority() default 0;
}