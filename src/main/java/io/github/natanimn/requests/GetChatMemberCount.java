package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetChatMemberCount extends AbstractBaseRequest<GetChatMemberCount, Integer> {
    public GetChatMemberCount(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "getChatMemberCount", Integer.class);
    }

}
