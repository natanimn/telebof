package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ApproveChatJoinRequest extends AbstractBaseRequest<ApproveChatJoinRequest, Boolean> {
    public ApproveChatJoinRequest(Object chatId, long userId, RequestSender requestSender) {
        super(chatId, requestSender, "approveChatJoinRequest");
        add("user_id", userId);
    }

}

