package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetChatAdministratorCustomTitle extends AbstractBaseRequest<SetChatAdministratorCustomTitle, Boolean> {
    public SetChatAdministratorCustomTitle(Object chatId, long userId, String customTitle, RequestSender requestSender) {
        super(chatId, requestSender, "setChatAdministratorCustomTitle");
        add("user_id", userId);
        add("custom_title", customTitle);
    }

}
