package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#deleteForumTopic
 */
public class DeleteForumTopic extends AbstractBaseRequest<DeleteForumTopic, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_thread_id message thread id
     * @param api api
     */
    public DeleteForumTopic(Object chat_id, int message_thread_id, Api api) {
        super(chat_id, api, "deleteForumTopic", Boolean.class);
        add("message_thread_id", message_thread_id);
    }
}
