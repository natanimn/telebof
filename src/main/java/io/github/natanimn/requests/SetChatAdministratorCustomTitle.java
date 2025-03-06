package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SetChatAdministratorCustomTitle extends AbstractBaseRequest<SetChatAdministratorCustomTitle, Boolean> {
    public SetChatAdministratorCustomTitle(Object chatId, long userId, String customTitle, RequestSender requestSender) {
        super(chatId, requestSender, "setChatAdministratorCustomTitle");
        add("user_id", userId);
        add("custom_title", customTitle);
    }

}
