package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SetChatTitle extends AbstractBaseRequest<SetChatTitle, Boolean> {
    public SetChatTitle(Object chatId, String title, RequestSender requestSender) {
        super(chatId, requestSender, "setChatTitle");
        add("title", title);
    }

}
