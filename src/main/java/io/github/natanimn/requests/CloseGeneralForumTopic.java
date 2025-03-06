package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class CloseGeneralForumTopic extends AbstractBaseRequest<CloseGeneralForumTopic, Boolean> {
    public CloseGeneralForumTopic(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "closeGeneralForumTopic");
    }

}
