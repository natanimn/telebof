package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * StopMessageLiveLocation class.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class StopMessageLiveLocation extends AbstractBaseRequest<StopMessageLiveLocation, Object> {
    /**
     * Required
     * @param chatId chat id
     * @param messageId message id
     * @param api api
     * @see BotContext#stopMessageLiveLocation(Object, int)
     */
    public StopMessageLiveLocation(Object chatId, int messageId, Api api) {
        super(chatId, api, "stopMessageLiveLocation", Message.class);
        add("message_id", messageId);
    }

    /**
     * Required
     * @param inlineMessageId inline message id
     * @param api api
     */
    public StopMessageLiveLocation(String inlineMessageId, Api api) {
        super(api, "stopMessageLiveLocation", Boolean.class);
        add("inline_message_id", inlineMessageId);
    }

    /**
     * Optional
     * @param replyMarkup A JSON-serialized object for a new inline keyboard.
     * @return {@link StopMessageLiveLocation}
     */
    public StopMessageLiveLocation replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message to be edited was sent
     * @return {@link StopMessageLiveLocation}
     */
    public StopMessageLiveLocation businessConnectionId(String businessConnectionId){
        return add("business_connection_id", businessConnectionId);
    }
}
