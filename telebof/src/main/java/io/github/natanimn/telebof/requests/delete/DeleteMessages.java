package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteMessages class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#deleteMessages(Object, Integer[])
 */
public class DeleteMessages extends AbstractBaseRequest<DeleteMessages, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param messageIds message ids
     * @param api api
     */
    public DeleteMessages(Object chatId, Integer[] messageIds, Api api) {
        super(chatId, api, "deleteMessages", Boolean.class);
        add("message_id", messageIds);
    }
}