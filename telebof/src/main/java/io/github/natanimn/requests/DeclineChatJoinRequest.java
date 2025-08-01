package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class DeclineChatJoinRequest extends AbstractBaseRequest<DeclineChatJoinRequest, Boolean> {
    public DeclineChatJoinRequest(Object chatId, long userId, RequestSender requestSender) {
        super(chatId, requestSender, "declineChatJoinRequest");
        add("user_id", userId);
    }

}
