package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class UnpinAllChatMessages extends AbstractBaseRequest<UnpinAllChatMessages, Boolean> {
    public UnpinAllChatMessages(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "unpinAllChatMessages");
    }

}
