package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.UpdateHandler;
import io.github.natanimn.telebof.annotations.container.ChatMemberHandlers;
import io.github.natanimn.telebof.enums.ChatMemberStatus;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.FilterExecutor;

import java.lang.annotation.*;

/**
 * Annotation for handling chat member status updates in a declarative manner.
 * Designed specifically for handling events when a chat member's status changes,
 * such as when users join, leave, get promoted, demoted, or have their permissions changed.
 *
 * <p><b>Basic member status handler example:</b>
 * <pre>{@code
 * @ChatMemberHandler(status = ChatMemberStatus.MEMBER)
 * void handleNewMember(BotContext context, ChatMemberUpdated update) {
 *     // Handle member demotion
 * }
 * }</pre>
 *
 * <p><b>Multiple status handler example:</b>
 * <pre>{@code
 * @ChatMemberHandler(status = {ChatMemberStatus.ADMINISTRATOR, ChatMemberStatus.CREATOR})
 * void handleAdminPromotion(BotContext context, ChatMemberUpdated update) {
 *     // Handle when a user becomes an admin or creator
 *     context.sendMessage(update.chat.id, "New admin privileges granted!");
 * }
 * }</pre>
 * Equivalent with using {@link io.github.natanimn.telebof.BotClient#onChatMember(FilterExecutor, UpdateHandler)} 
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ChatMemberHandlers.class)
public @interface ChatMemberHandler {

    /**
     * Specifies the chat member status changes to match.
     * Multiple status values are combined using OR logic - the handler will trigger
     * if the member's new status matches any of the specified status values.
     *
     * @return array of {@link ChatMemberStatus} enum values to filter by
     * @implNote Empty array matches all status changes
     * @example {ChatMemberStatus.MEMBER, ChatMemberStatus.ADMINISTRATOR}
     */
    ChatMemberStatus[] status() default {};

    /**
     * Custom filter class for advanced filtering of chat member update events.
     * Use this to implement custom logic for determining which member status changes
     * should trigger this handler, such as filtering by user roles, permission changes,
     * chat-specific rules, or other application-specific criteria.
     *
     * @return class implementing {@link CustomFilter} interface
     * @implNote Defaults to {@link DefaultCustomFilter} which applies to all member update events
     * @example Filter to only handle admin promotions in specific chats
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Priority order for handler registration and execution.
     * Handlers with lower priority numbers are registered and executed before
     * those with higher numbers. This allows controlling the order of handler
     * processing when multiple handlers could match the same member status change event.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     * @example A handler with priority -10 executes before one with priority 5
     */
    int priority() default 0;
}