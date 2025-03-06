package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class LeaveChat extends AbstractBaseRequest<LeaveChat, Boolean> {
    public LeaveChat(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "leaveChat");
    }

}
