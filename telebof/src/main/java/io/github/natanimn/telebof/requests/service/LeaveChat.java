package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * LeaveChat class. Returns True on success
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#leaveChat
 */
public class LeaveChat extends AbstractBaseRequest<LeaveChat, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public LeaveChat(Object chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "leaveChat", Boolean.class);
    }

}
