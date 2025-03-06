package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class UnpinAllGeneralForumTopicMessages extends AbstractBaseRequest<UnpinAllGeneralForumTopicMessages, Boolean>{
    public UnpinAllGeneralForumTopicMessages(Object chat_id, RequestSender requestSender){
        super(chat_id, requestSender, "unpinAllGeneralForumTopicMessages");
    }

}
