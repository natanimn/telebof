package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetChatDescription class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setChatDescription
 */
public class SetChatDescription extends AbstractBaseRequest<SetChatDescription, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param title title
     * @param api api
     */
    public SetChatDescription(Object chatId, String title, Api api) {
        super(chatId, api, "setChatDescription", Boolean.class);
        add("description", title);
    }

}
