package io.github.natanimn.requests.delete;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * DeleteMessage class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#deleteMessage}
 */
public class DeleteMessage extends AbstractBaseRequest<DeleteMessage, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_id message id
     * @param requestSender request sender
     */
    public DeleteMessage(Object chat_id, int message_id, RequestSender requestSender) {
        super(chat_id, requestSender, "deleteMessage", Boolean.class);
        add("message_id", message_id);
    }

}
