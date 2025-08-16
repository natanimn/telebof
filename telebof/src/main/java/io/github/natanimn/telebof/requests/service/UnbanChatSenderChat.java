package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * UnbanChatSenderChat class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#unbanChatSenderChat(Object, long)
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
