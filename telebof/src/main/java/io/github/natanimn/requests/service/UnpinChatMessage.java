package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * UnpinChatMessage class. Returns true on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#unpinChatMessage}
 */
public class UnpinChatMessage extends AbstractBaseRequest<UnpinChatMessage, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public UnpinChatMessage(Object chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "unpinChatMessage", Boolean.class);
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
