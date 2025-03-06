package io.github.natanimn.requests;

import io.github.natanimn.types.InlineKeyboardMarkup;
import io.github.natanimn.types.Message;

import java.io.File;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class EditMessageMedia extends AbstractBaseRequest<EditMessageMedia, Message> {
    public EditMessageMedia(File media, Object chatId, int messageId, RequestSender requestSender) {
        super(chatId, requestSender, "editMessageMedia", Message.class);
        add("media", media);
        add("message_id", messageId);
    }

    public EditMessageMedia(File media, String inlineMessageId, RequestSender requestSender) {
        super(requestSender, "editMessageMedia", Message.class);
        add("media", media);
        add("inline_message_id", inlineMessageId);
    }

    public EditMessageMedia replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public EditMessageMedia businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
}
