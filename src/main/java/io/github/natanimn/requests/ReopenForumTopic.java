package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ReopenForumTopic extends AbstractBaseRequest<ReopenForumTopic, Boolean> {
    public ReopenForumTopic(Object chatId, int messageThreadId, RequestSender requestSender) {
        super(chatId, requestSender, "reopenForumTopic");
        add("message_thread_id", messageThreadId);
    }

}
