package io.github.natanimn.telebof.requests.pin_and_unpin;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * UnpinAllForumTopicMessages class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#unpinAllForumTopicMessages
 */
public class UnpinAllForumTopicMessages extends AbstractBaseRequest<UnpinAllForumTopicMessages, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param messageThreadId message thread id
     * @param api api
     */
    public UnpinAllForumTopicMessages(Object chatId, int messageThreadId, Api api) {
        super(chatId, api, "unpinAllForumTopicMessages", Boolean.class);
        add("message_thread_id", messageThreadId);
    }

}
