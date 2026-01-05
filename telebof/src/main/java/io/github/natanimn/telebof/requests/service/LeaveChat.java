package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;

/**
 * LeaveChat class. Returns True on success
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#leaveChat
 */
public class LeaveChat extends AbstractBaseRequest<LeaveChat, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param api api
     */
    public LeaveChat(Object chatId, Api api) {
        super(chatId, api, "leaveChat", Boolean.class);
    }

}
