package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class UnpinAllForumTopicMessages extends AbstractBaseRequest<UnpinAllForumTopicMessages, Boolean> {
    public UnpinAllForumTopicMessages(Object chatId, int messageThreadId, RequestSender requestSender) {
        super(chatId, requestSender, "unpinAllForumTopicMessages");
        add("message_thread_id", messageThreadId);
    }

}
