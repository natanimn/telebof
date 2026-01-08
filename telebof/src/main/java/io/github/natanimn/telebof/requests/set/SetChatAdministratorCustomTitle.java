package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetChatAdministratorCustomTitle class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setChatAdministratorCustomTitle
 */
public class SetChatAdministratorCustomTitle extends AbstractBaseRequest<SetChatAdministratorCustomTitle, Boolean> {

    /**
     * Required
     * @param chatId chat id
     * @param userId user id
     * @param customTitle custom title
     * @param api api
     */
    public SetChatAdministratorCustomTitle(Object chatId, long userId, String customTitle, Api api) {
        super(chatId, api, "setChatAdministratorCustomTitle", Boolean.class);
        add("user_id", userId);
        add("custom_title", customTitle);
    }

}
