package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class DeleteMessages extends AbstractBaseRequest<DeleteMessages, Boolean> {

    public DeleteMessages(Object chatId, Integer[] messageIds, RequestSender requestSender) {
        super(chatId, requestSender, "deleteMessages");
        add("message_id", messageIds);
    }

}