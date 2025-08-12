package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * ReopenGeneralForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#reopenGeneralForumTopic}
 */
public class ReopenGeneralForumTopic extends AbstractBaseRequest<ReopenGeneralForumTopic, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public ReopenGeneralForumTopic(Object chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "reopenGeneralForumTopic", Boolean.class);
    }

}
