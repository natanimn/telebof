package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * CloseGeneralForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#closeGeneralForumTopic
 */
public class CloseGeneralForumTopic extends AbstractBaseRequest<CloseGeneralForumTopic, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public CloseGeneralForumTopic(Object chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "closeGeneralForumTopic", Boolean.class);
    }

}
