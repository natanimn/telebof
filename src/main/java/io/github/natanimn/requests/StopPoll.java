package io.github.natanimn.requests;

import io.github.natanimn.types.InlineKeyboardMarkup;
import io.github.natanimn.types.Poll;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class StopPoll extends AbstractBaseRequest<StopPoll, Poll> {
    public StopPoll(Object chatId, int messageId, RequestSender requestSender) {
        super(chatId, requestSender, "stopPoll", Poll.class);
        add("message_id", messageId);
    }

    public StopPoll replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public StopPoll businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
}
