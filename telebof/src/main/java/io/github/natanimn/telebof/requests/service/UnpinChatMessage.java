package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * UnpinChatMessage class. Returns true on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#unpinChatMessage
 */
public class UnpinChatMessage extends AbstractBaseRequest<UnpinChatMessage, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param api api
     */
    public UnpinChatMessage(Object chat_id, Api api) {
        super(chat_id, api, "unpinChatMessage", Boolean.class);
    }

    /**
     * Optional
     * @param message_id Identifier of the message to unpin. Required if {@link #businessConnectionId} is specified.
     *                   If not specified, the most recent pinned message (by sending date) will be unpinned.
     * @return {@link UnpinChatMessage}
     */
    public UnpinChatMessage messageId(int message_id) {
        return add("message_id", message_id);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message will be unpinned
     * @return {@link UnpinChatMessage}
     */
    public UnpinChatMessage businessConnectionId(String business_connection_id) {
        return add("business_connection_id", business_connection_id);
    }
}
