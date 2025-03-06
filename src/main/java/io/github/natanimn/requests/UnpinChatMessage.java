package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class UnpinChatMessage extends AbstractBaseRequest<UnpinChatMessage, Boolean> {
    public UnpinChatMessage(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "unpinChatMessage");
    }

    public UnpinChatMessage messageId(int messageId) {
        return add("message_id", messageId);
    }

}
