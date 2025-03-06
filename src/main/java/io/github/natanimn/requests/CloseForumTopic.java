package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class CloseForumTopic extends AbstractBaseRequest<Close, Boolean> {
    public CloseForumTopic(Object chatId, int messageThreadId, RequestSender requestSender) {
        super(chatId, requestSender, "closeForumTopic");
        add("message_thread_id", messageThreadId);
    }
}
