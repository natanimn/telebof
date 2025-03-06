package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ReopenGeneralForumTopic extends AbstractBaseRequest<ReopenGeneralForumTopic, Boolean> {
    public ReopenGeneralForumTopic(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "reopenGeneralForumTopic");
    }

}
