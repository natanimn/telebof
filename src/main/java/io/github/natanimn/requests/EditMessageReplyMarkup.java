package io.github.natanimn.requests;

import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.types.updates.Message;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class EditMessageReplyMarkup extends AbstractBaseRequest<EditMessageReplyMarkup, Message> {
    public EditMessageReplyMarkup(Object chatId, int messageId, RequestSender requestSender) {
        super(chatId, requestSender, "editMessageReplyMarkup", Message.class);
        add("message_id", messageId);
    }

    public EditMessageReplyMarkup(String inlineMessageId, RequestSender requestSender) {
        super(requestSender, "editMessageReplyMarkup", Message.class);
        add("inline_message_id", inlineMessageId);
    }

    public EditMessageReplyMarkup replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public EditMessageReplyMarkup businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

}
