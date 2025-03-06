package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetChatDescription extends AbstractBaseRequest<SetChatDescription, Boolean> {
    public SetChatDescription(Object chatId, String title, RequestSender requestSender) {
        super(chatId, requestSender, "setChatDescription");
        add("description", title);
    }

}
