package io.github.natanimn.telebof.requests.pin_and_unpin;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;

/**
 * UnpinAllChatMessages class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#unpinAllChatMessages
 */
public class UnpinAllChatMessages extends AbstractBaseRequest<UnpinAllChatMessages, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param api api
     */
    public UnpinAllChatMessages(Object chat_id, Api api) {
        super(chat_id, api, "unpinAllChatMessages", Boolean.class);
    }

}
