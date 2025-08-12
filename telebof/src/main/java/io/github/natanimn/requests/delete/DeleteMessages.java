package io.github.natanimn.requests.delete;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * DeleteMessages class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#deleteMessages(Object, int[])}
 */
public class DeleteMessages extends AbstractBaseRequest<DeleteMessages, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_ids message ids
     * @param requestSender request sender
     */
    public DeleteMessages(Object chat_id, int[] message_ids, RequestSender requestSender) {
        super(chat_id, requestSender, "deleteMessages", Boolean.class);
        add("message_id", message_ids);
    }
}