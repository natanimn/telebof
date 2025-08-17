package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * ReopenGeneralForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#reopenGeneralForumTopic
 */
public class ReopenGeneralForumTopic extends AbstractBaseRequest<ReopenGeneralForumTopic, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param api api
     */
    public ReopenGeneralForumTopic(Object chat_id, Api api) {
        super(chat_id, api, "reopenGeneralForumTopic", Boolean.class);
    }

}
