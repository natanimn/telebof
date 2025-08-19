package io.github.natanimn.telebof.requests.pin_and_unpin;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * PinChatMessage class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#pinChatMessage
 */
public class PinChatMessage extends AbstractBaseRequest<PinChatMessage, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_id message id
     * @param api api
     */
    public PinChatMessage(Object chat_id, int message_id, Api api) {
        super(chat_id, api, "pinChatMessage", Boolean.class);
        add("message_id", message_id);
    }

    /**
     * Optional
     * @param disable_notification Pass True if it is not necessary to send a notification to all chat members about the new pinned message.
     *                             Notifications are always disabled in channels and private chats.
     * @return {@link PinChatMessage}
     */
    public PinChatMessage disableNotification(boolean disable_notification) {
        return add("disable_notification", disable_notification);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message will be pinned
     * @return {@link PinChatMessage}
     */
    public PinChatMessage businessConnectionId(String business_connection_id) {
        return add("business_connection_id", business_connection_id);
    }

}
