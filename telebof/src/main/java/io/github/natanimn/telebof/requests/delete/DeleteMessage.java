package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteMessage class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#deleteMessage
 */
public class DeleteMessage extends AbstractBaseRequest<DeleteMessage, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param messageId message id
     * @param api api
     */
    public DeleteMessage(Object chatId, int messageId, Api api) {
        super(chatId, api, "deleteMessage", Boolean.class);
        add("message_id", messageId);
    }

}
