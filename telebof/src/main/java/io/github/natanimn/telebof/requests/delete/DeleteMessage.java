package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteMessage class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#deleteMessage
 */
public class DeleteMessage extends AbstractBaseRequest<DeleteMessage, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_id message id
     * @param api api
     */
    public DeleteMessage(Object chat_id, int message_id, Api api) {
        super(chat_id, api, "deleteMessage", Boolean.class);
        add("message_id", message_id);
    }

}
