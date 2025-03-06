package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class DeleteChatPhoto extends AbstractBaseRequest<DeleteChatPhoto, Boolean> {
    public DeleteChatPhoto(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "deleteChatPhoto");
    }

}
