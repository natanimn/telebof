package io.github.natanimn.telebof.requests.pin_and_unpin;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * UnpinChatMessage class. Returns true on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#unpinChatMessage
 */
public class UnpinChatMessage extends AbstractBaseRequest<UnpinChatMessage, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param api api
     */
    public UnpinChatMessage(Object chatId, Api api) {
        super(chatId, api, "unpinChatMessage", Boolean.class);
    }

    /**
     * Optional
     * @param messageId Identifier of the message to pin_and_unpin. Required if {@link #businessConnectionId} is specified.
     *                   If not specified, the most recent pinned message (by sending date) will be unpinned.
     * @return {@link UnpinChatMessage}
     */
    public UnpinChatMessage messageId(int messageId) {
        return add("message_id", messageId);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message will be unpinned
     * @return {@link UnpinChatMessage}
     */
    public UnpinChatMessage businessConnectionId(String businessConnectionId) {
        return add("business_connection_id", businessConnectionId);
    }
}
