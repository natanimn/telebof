package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class CloseGeneralForumTopic extends AbstractBaseRequest<CloseGeneralForumTopic, Boolean> {
    public CloseGeneralForumTopic(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "closeGeneralForumTopic");
    }

}
