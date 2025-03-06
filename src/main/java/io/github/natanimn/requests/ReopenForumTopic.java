package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class ReopenForumTopic extends AbstractBaseRequest<ReopenForumTopic, Boolean> {
    public ReopenForumTopic(Object chatId, int messageThreadId, RequestSender requestSender) {
        super(chatId, requestSender, "reopenForumTopic");
        add("message_thread_id", messageThreadId);
    }

}
