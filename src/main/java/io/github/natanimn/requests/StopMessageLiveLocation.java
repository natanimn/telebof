package io.github.natanimn.requests;

import io.github.natanimn.types.InlineKeyboardMarkup;
import io.github.natanimn.types.Message;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class StopMessageLiveLocation extends AbstractBaseRequest<StopMessageLiveLocation, Message> {
    public StopMessageLiveLocation(Object chatId, int messageId, RequestSender requestSender) {
        super(chatId, requestSender, "stopMessageLiveLocation", Message.class);
        add("message_id", messageId);
    }

    public StopMessageLiveLocation(String inlineMessageId, RequestSender requestSender) {
        super(requestSender, "stopMessageLiveLocation", Message.class);
        add("inline_message_id", inlineMessageId);
    }

    public StopMessageLiveLocation replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public StopMessageLiveLocation businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
}
