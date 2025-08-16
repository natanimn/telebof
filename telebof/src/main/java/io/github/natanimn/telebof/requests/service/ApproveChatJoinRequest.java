package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * ApproveChatJoinRequest class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#approveChatJoinRequest
 */
public class ApproveChatJoinRequest extends AbstractBaseRequest<ApproveChatJoinRequest, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param requestSender request sender
     */
    public ApproveChatJoinRequest(Object chat_id, long user_id, RequestSender requestSender) {
        super(chat_id, requestSender, "approveChatJoinRequest", Boolean.class);
        add("user_id", user_id);
    }

}

