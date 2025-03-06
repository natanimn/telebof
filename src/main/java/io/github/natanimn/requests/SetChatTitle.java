package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetChatTitle extends AbstractBaseRequest<SetChatTitle, Boolean> {
    public SetChatTitle(Object chatId, String title, RequestSender requestSender) {
        super(chatId, requestSender, "setChatTitle");
        add("title", title);
    }

}
