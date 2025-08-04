package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class UnpinAllChatMessages extends AbstractBaseRequest<UnpinAllChatMessages, Boolean> {
    public UnpinAllChatMessages(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "unpinAllChatMessages");
    }

}
