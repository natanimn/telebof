package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.Poll;

/**
 * StopPoll class. Returns the stoped {@link Poll} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#stopPoll
 */
public class StopPoll extends AbstractBaseRequest<StopPoll, Poll> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_id message id
     * @param requestSender request sender
     */
    public StopPoll(Object chat_id, int message_id, RequestSender requestSender) {
        super(chat_id, requestSender, "stopPoll", Poll.class);
        add("message_id", message_id);
    }

    /**
     * Optional
     * @param reply_markup A JSON-serialized object for a new message inline keyboard.
     * @return {@link StopPoll}
     */
    public StopPoll replyMarkup(InlineKeyboardMarkup reply_markup) {
        return add("reply_markup", reply_markup);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message to be edited was sent
     * @return {@link StopPoll}
     */
    public StopPoll businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
}
