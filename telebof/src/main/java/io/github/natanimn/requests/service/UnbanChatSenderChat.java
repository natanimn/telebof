package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * UnbanChatSenderChat class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#unbanChatSenderChat(Object, long)}
 */
public class UnbanChatSenderChat extends AbstractBaseRequest<UnbanChatSenderChat, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param sender_chat_id sender chat id
     * @param requestSender request sender
     */
    public UnbanChatSenderChat(Object chat_id, long sender_chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "unbanChatSenderChat", Boolean.class);
        add("sender_chat_id", sender_chat_id);
    }

}
