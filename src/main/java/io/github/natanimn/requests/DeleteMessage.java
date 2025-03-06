package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class DeleteMessage extends AbstractBaseRequest<DeleteMessage, Boolean> {
    public DeleteMessage(Object chatId, int messageId, RequestSender requestSender) {
        super(chatId, requestSender, "deleteMessage");
        add("message_id", messageId);
    }

}
