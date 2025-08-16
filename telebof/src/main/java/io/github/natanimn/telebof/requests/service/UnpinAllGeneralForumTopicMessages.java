package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * UnpinAllGeneralForumTopicMessages class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#unpinAllGeneralForumTopicMessages
 */
public class UnpinAllGeneralForumTopicMessages extends AbstractBaseRequest<UnpinAllGeneralForumTopicMessages, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public UnpinAllGeneralForumTopicMessages(Object chat_id, RequestSender requestSender){
        super(chat_id, requestSender, "unpinAllGeneralForumTopicMessages", Boolean.class);
    }

}
