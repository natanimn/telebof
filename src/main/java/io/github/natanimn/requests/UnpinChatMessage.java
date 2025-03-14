package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class UnpinChatMessage extends AbstractBaseRequest<UnpinChatMessage, Boolean> {
    public UnpinChatMessage(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "unpinChatMessage");
    }

    public UnpinChatMessage messageId(int messageId) {
        return add("message_id", messageId);
    }

    public UnpinChatMessage businessConnectionId(String business_connection_id) {
        return add("business_connection_id", business_connection_id);
    }
}
