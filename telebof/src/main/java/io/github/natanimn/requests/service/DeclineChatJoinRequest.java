package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * DeclineChatJoinRequest class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#declineChatJoinRequest}
 */
public class DeclineChatJoinRequest extends AbstractBaseRequest<DeclineChatJoinRequest, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param requestSender request sender
     */
    public DeclineChatJoinRequest(Object chat_id, long user_id, RequestSender requestSender) {
        super(chat_id, requestSender, "declineChatJoinRequest", Boolean.class);
        add("user_id", user_id);
    }

}
