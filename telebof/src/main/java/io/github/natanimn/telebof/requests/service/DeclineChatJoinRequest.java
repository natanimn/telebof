package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * DeclineChatJoinRequest class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#declineChatJoinRequest
 */
public class DeclineChatJoinRequest extends AbstractBaseRequest<DeclineChatJoinRequest, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param userId user id
     * @param api api
     */
    public DeclineChatJoinRequest(Object chatId, long userId, Api api) {
        super(chatId, api, "declineChatJoinRequest", Boolean.class);
        add("user_id", userId);
    }

}
