package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class LeaveChat extends AbstractBaseRequest<LeaveChat, Boolean> {
    public LeaveChat(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "leaveChat");
    }

}
