package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * ReopenForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#reopenForumTopic
 */
public class ReopenForumTopic extends AbstractBaseRequest<ReopenForumTopic, Boolean> {

    /**
     * Required
     * @param chatId chat id
     * @param messageThreadId message thread id
     * @param api api
     */
    public ReopenForumTopic(Object chatId, int messageThreadId, Api api) {
        super(chatId, api, "reopenForumTopic", Boolean.class);
        add("message_thread_id", messageThreadId);
    }

}
