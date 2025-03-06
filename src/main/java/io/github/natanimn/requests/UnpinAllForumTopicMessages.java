package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class UnpinAllForumTopicMessages extends AbstractBaseRequest<UnpinAllForumTopicMessages, Boolean> {
    public UnpinAllForumTopicMessages(Object chatId, int messageThreadId, RequestSender requestSender) {
        super(chatId, requestSender, "unpinAllForumTopicMessages");
        add("message_thread_id", messageThreadId);
    }

}
