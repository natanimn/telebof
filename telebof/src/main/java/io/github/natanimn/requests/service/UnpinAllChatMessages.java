package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * UnpinAllChatMessages class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#unpinAllChatMessages}
 */
public class UnpinAllChatMessages extends AbstractBaseRequest<UnpinAllChatMessages, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public UnpinAllChatMessages(Object chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "unpinAllChatMessages", Boolean.class);
    }

}
