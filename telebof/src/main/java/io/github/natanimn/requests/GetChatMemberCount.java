package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class GetChatMemberCount extends AbstractBaseRequest<GetChatMemberCount, Integer> {
    public GetChatMemberCount(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "getChatMemberCount", Integer.class);
    }

}
