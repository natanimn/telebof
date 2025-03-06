package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class DeclineChatJoinRequest extends AbstractBaseRequest<DeclineChatJoinRequest, Boolean> {
    public DeclineChatJoinRequest(Object chatId, long userId, RequestSender requestSender) {
        super(chatId, requestSender, "declineChatJoinRequest");
        add("user_id", userId);
    }

}
