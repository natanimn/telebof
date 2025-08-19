package io.github.natanimn.telebof.requests.pin_and_unpin;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * UnpinAllForumTopicMessages class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#unpinAllForumTopicMessages
 */
public class UnpinAllForumTopicMessages extends AbstractBaseRequest<UnpinAllForumTopicMessages, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_thread_id message thread id
     * @param api api
     */
    public UnpinAllForumTopicMessages(Object chat_id, int message_thread_id, Api api) {
        super(chat_id, api, "unpinAllForumTopicMessages", Boolean.class);
        add("message_thread_id", message_thread_id);
    }

}
