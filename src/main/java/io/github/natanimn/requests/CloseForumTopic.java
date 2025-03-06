package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class CloseForumTopic extends AbstractBaseRequest<Close, Boolean> {
    public CloseForumTopic(Object chatId, int messageThreadId, RequestSender requestSender) {
        super(chatId, requestSender, "closeForumTopic");
        add("message_thread_id", messageThreadId);
    }
}
