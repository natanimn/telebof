package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class DeleteForumTopic extends AbstractBaseRequest<DeleteForumTopic, Boolean> {
    public DeleteForumTopic(Object chatId, int messageThreadId, RequestSender requestSender) {
        super(chatId, requestSender, "deleteForumTopic");
        add("message_thread_id", messageThreadId);
    }
}
