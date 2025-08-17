package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * BanChatSenderChat class. Return True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#banChatSenderChat
 */
public class BanChatSenderChat extends AbstractBaseRequest<BanChatSenderChat, Boolean> {
    /**
     * Required
     * @param chat_id chat is
     * @param sender_chat_id sender chat id
     * @param api api
     */
    public BanChatSenderChat(Object chat_id, long sender_chat_id, Api api) {
        super(chat_id, api, "banChatSenderChat", Boolean.class);
        add("sender_chat_id", sender_chat_id);
    }

}
