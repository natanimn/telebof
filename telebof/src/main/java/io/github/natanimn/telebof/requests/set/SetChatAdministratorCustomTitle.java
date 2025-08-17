package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetChatAdministratorCustomTitle class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setChatAdministratorCustomTitle
 */
public class SetChatAdministratorCustomTitle extends AbstractBaseRequest<SetChatAdministratorCustomTitle, Boolean> {

    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param custom_title custom title
     * @param api api
     */
    public SetChatAdministratorCustomTitle(Object chat_id, long user_id, String custom_title, Api api) {
        super(chat_id, api, "setChatAdministratorCustomTitle", Boolean.class);
        add("user_id", user_id);
        add("custom_title", custom_title);
    }

}
