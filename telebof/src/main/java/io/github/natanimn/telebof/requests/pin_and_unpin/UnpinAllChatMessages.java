package io.github.natanimn.telebof.requests.pin_and_unpin;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;

/**
 * UnpinAllChatMessages class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#unpinAllChatMessages
 */
public class UnpinAllChatMessages extends AbstractBaseRequest<UnpinAllChatMessages, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param api api
     */
    public UnpinAllChatMessages(Object chatId, Api api) {
        super(chatId, api, "unpinAllChatMessages", Boolean.class);
    }

}
