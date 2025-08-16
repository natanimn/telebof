package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

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
     * @param requestSender request sender
     */
    public DeleteForumTopic(Object chat_id, int message_thread_id, RequestSender requestSender) {
        super(chat_id, requestSender, "deleteForumTopic", Boolean.class);
        add("message_thread_id", message_thread_id);
    }
}
