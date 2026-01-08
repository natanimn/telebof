package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * UnbanChatSenderChat class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#unbanChatSenderChat(Object, long)
 */
public class UnbanChatSenderChat extends AbstractBaseRequest<UnbanChatSenderChat, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param senderChatId sender chat id
     * @param api api
     */
    public UnbanChatSenderChat(Object chatId, long senderChatId, Api api) {
        super(chatId, api, "unbanChatSenderChat", Boolean.class);
        add("sender_chat_id", senderChatId);
    }

}
