package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.Poll;

/**
 * StopPoll class. Returns the stopped {@link Poll} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#stopPoll
 */
public class StopPoll extends AbstractBaseRequest<StopPoll, Poll> {
    /**
     * Required
     * @param chatId chat id
     * @param messageId message id
     * @param api api
     */
    public StopPoll(Object chatId, int messageId, Api api) {
        super(chatId, api, "stopPoll", Poll.class);
        add("message_id", messageId);
    }

    /**
     * Optional
     * @param replyMarkup A JSON-serialized object for a new message inline keyboard.
     * @return {@link StopPoll}
     */
    public StopPoll replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message to be edited was sent
     * @return {@link StopPoll}
     */
    public StopPoll businessConnectionId(String businessConnectionId){
        return add("business_connection_id", businessConnectionId);
    }
}
