package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class DeleteForumTopic extends AbstractBaseRequest<DeleteForumTopic, Boolean> {
    public DeleteForumTopic(Object chatId, int messageThreadId, RequestSender requestSender) {
        super(chatId, requestSender, "deleteForumTopic");
        add("message_thread_id", messageThreadId);
    }
}
