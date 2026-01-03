package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * CloseForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#closeForumTopic(Object, int)
 */
public class CloseForumTopic extends AbstractBaseRequest<Close, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param messageThreadId message thread id
     * @param api api
     */
    public CloseForumTopic(Object chatId, int messageThreadId, Api api) {
        super(chatId, api, "closeForumTopic", Boolean.class);
        add("message_thread_id", messageThreadId);
    }
}
