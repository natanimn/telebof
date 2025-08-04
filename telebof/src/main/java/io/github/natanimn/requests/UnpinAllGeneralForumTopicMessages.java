package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class UnpinAllGeneralForumTopicMessages extends AbstractBaseRequest<UnpinAllGeneralForumTopicMessages, Boolean>{
    public UnpinAllGeneralForumTopicMessages(Object chat_id, RequestSender requestSender){
        super(chat_id, requestSender, "unpinAllGeneralForumTopicMessages");
    }

}
