package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;

/**
 * ApproveChatJoinRequest class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#approveChatJoinRequest
 */
public class ApproveChatJoinRequest extends AbstractBaseRequest<ApproveChatJoinRequest, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param userId user id
     * @param api api
     */
    public ApproveChatJoinRequest(Object chatId, long userId, Api api) {
        super(chatId, api, "approveChatJoinRequest", Boolean.class);
        add("user_id", userId);
    }

}

