package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class HideGeneralForumTopic extends AbstractBaseRequest<HideGeneralForumTopic, Boolean> {
    public HideGeneralForumTopic(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "hideGeneralForumTopic");
    }

}
