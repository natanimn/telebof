package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class UnHideGeneralForumTopic extends AbstractBaseRequest<UnHideGeneralForumTopic, Boolean> {
    public UnHideGeneralForumTopic(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "unHideGeneralForumTopic");
    }

}
