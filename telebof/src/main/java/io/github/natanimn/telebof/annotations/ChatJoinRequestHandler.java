package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.ChatJoinRequestHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling chat join request events in a declarative manner.
 * Designed specifically for handling events when a user requests to join
 * a chat (typically a private group or channel that requires approval).
 *
 * <p><b>Basic join request handler example:</b>
 * <pre>{@code
 * @ChatJoinRequestHandler
 * void handleJoinRequest(BotContext context, ChatJoinRequest request) {
 *     // Handle chat join request event
 *     context.approveJoinRequest(request.chat.id, request.from.id));
 * }
 * }</pre>
 *
 * <p><b>Custom filtered join request handler example:</b>
 * <pre>{@code
 * @ChatJoinRequestHandler(filter = PremiumUserFilter.class)
 * void handlePremiumJoinRequest(BotContext context, ChatJoinRequest request) {
 *     // Automatically approve join requests from premium users
 *     context.approveJoinRequest(request.chat.id, request.from.id));
 * }
 * }</pre>
 *
 * <p><b>Multiple join request handlers with priorities:</b>
 * <pre>{@code
 * @ChatJoinRequestHandler(priority = -1, filter = PremiumUserFilter.class)
 * void validateJoinRequest(BotContext context, ChatJoinRequest request) {
 *     // Automatically approve join requests from premium users
 *     context.approveJoinRequest(request.chat.id, request.from.id));
 * }
 *
 * @ChatJoinRequestHandler
 * void welcomeApprovedUser(BotContext context, ChatJoinRequest request) {
 *     // This handler executes for approved requests
 *     context.approveJoinRequest(request.chat.id, request.from.id));
 * }
 * }</pre>
 * <br><br>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onChatJoinRequest(FilterExecutor, UpdateHandler)} 
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ChatJoinRequestHandlers.class)
public @interface ChatJoinRequestHandler {

    /**
     * Custom filter class for advanced filtering of chat join request events.
     * Use this to implement custom logic for determining which join requests
     * should trigger this handler, such as filtering by user profile, join date,
     * referral source, or other application-specific criteria.
     *
     * @return class implementing {@link CustomFilter} interface
     * @implNote Defaults to {@link DefaultCustomFilter} which applies to all join request events
     * @example Filter to only handle requests from users with complete profiles
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Priority order for handler registration and execution.
     * Handlers with lower priority numbers are registered and executed before
     * those with higher numbers. This allows controlling the order of handler
     * processing when multiple handlers could match the same join request event.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     * @example A handler with priority -10 executes before one with priority 5
     */
    int priority() default 0;
}