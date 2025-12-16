package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#deleteForumTopic
 */
public class DeleteForumTopic extends AbstractBaseRequest<DeleteForumTopic, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param messageThreadId message thread id
     * @param api api
     */
    public DeleteForumTopic(Object chatId, int messageThreadId, Api api) {
        super(chatId, api, "deleteForumTopic", Boolean.class);
        add("message_thread_id", messageThreadId);
    }
}
