package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class SetChatDescription extends AbstractBaseRequest<SetChatDescription, Boolean> {
    public SetChatDescription(Object chatId, String title, RequestSender requestSender) {
        super(chatId, requestSender, "setChatDescription");
        add("description", title);
    }

}
