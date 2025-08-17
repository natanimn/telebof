package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * ReopenForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#reopenForumTopic
 */
public class ReopenForumTopic extends AbstractBaseRequest<ReopenForumTopic, Boolean> {

    /**
     * Required
     * @param chat_id chat id
     * @param message_thread_id message thread id
     * @param api api
     */
    public ReopenForumTopic(Object chat_id, int message_thread_id, Api api) {
        super(chat_id, api, "reopenForumTopic", Boolean.class);
        add("message_thread_id", message_thread_id);
    }

}
