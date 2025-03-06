package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class UnHideGeneralForumTopic extends AbstractBaseRequest<UnHideGeneralForumTopic, Boolean> {
    public UnHideGeneralForumTopic(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "unHideGeneralForumTopic");
    }

}
