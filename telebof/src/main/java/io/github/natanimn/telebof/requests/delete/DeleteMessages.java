package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteMessages class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#deleteMessages(Object, int[])
 */
public class DeleteMessages extends AbstractBaseRequest<DeleteMessages, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_ids message ids
     * @param api api
     */
    public DeleteMessages(Object chat_id, int[] message_ids, Api api) {
        super(chat_id, api, "deleteMessages", Boolean.class);
        add("message_id", message_ids);
    }
}