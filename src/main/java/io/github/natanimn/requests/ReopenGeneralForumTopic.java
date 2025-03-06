package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class ReopenGeneralForumTopic extends AbstractBaseRequest<ReopenGeneralForumTopic, Boolean> {
    public ReopenGeneralForumTopic(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "reopenGeneralForumTopic");
    }

}
