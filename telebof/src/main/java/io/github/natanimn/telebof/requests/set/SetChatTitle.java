package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * SetChatTitle class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setChatTitle
 */
public class SetChatTitle extends AbstractBaseRequest<SetChatTitle, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param title title
     * @param api api
     */
    public SetChatTitle(Object chatId, String title, Api api) {
        super(chatId, api, "setChatTitle", Boolean.class);
        add("title", title);
    }

}
