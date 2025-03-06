package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class DeleteChatPhoto extends AbstractBaseRequest<DeleteChatPhoto, Boolean> {
    public DeleteChatPhoto(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "deleteChatPhoto");
    }

}
