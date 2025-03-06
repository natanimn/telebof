package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class DeleteMessage extends AbstractBaseRequest<DeleteMessage, Boolean> {
    public DeleteMessage(Object chatId, int messageId, RequestSender requestSender) {
        super(chatId, requestSender, "deleteMessage");
        add("message_id", messageId);
    }

}
