package io.github.natanimn.telebof.requests.pin_and_unpin;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * PinChatMessage class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#pinChatMessage
 */
public class PinChatMessage extends AbstractBaseRequest<PinChatMessage, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param messageId message id
     * @param api api
     */
    public PinChatMessage(Object chatId, int messageId, Api api) {
        super(chatId, api, "pinChatMessage", Boolean.class);
        add("message_id", messageId);
    }

    /**
     * Optional
     * @param disableNotification Pass True if it is not necessary to send a notification to all chat members about the new pinned message.
     *                             Notifications are always disabled in channels and private chats.
     * @return {@link PinChatMessage}
     */
    public PinChatMessage disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message will be pinned
     * @return {@link PinChatMessage}
     */
    public PinChatMessage businessConnectionId(String businessConnectionId) {
        return add("business_connection_id", businessConnectionId);
    }

}
