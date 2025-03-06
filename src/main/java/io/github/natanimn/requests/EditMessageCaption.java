package io.github.natanimn.requests;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.types.InlineKeyboardMarkup;
import io.github.natanimn.types.Message;
import io.github.natanimn.types.MessageEntity;

import java.util.List;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class EditMessageCaption extends AbstractBaseRequest<EditMessageCaption, Message> {
    public EditMessageCaption(Object chatId, int messageId, RequestSender requestSender) {
        super(chatId, requestSender, "editMessageCaption", Message.class);
        add("message_id", messageId);
    }

    public EditMessageCaption(String inlineMessageId, RequestSender requestSender) {
        super(requestSender, "editMessageCaption", Message.class);
        add("inline_message_id", inlineMessageId);
    }

    public EditMessageCaption parseMode(ParseMode parseMode) {
        return add("parse_mode",  parseMode != null?parseMode.name():null);
    }

    public EditMessageCaption entities(MessageEntity[] captionEntities) {
        return add("caption_entities", List.of(captionEntities));
    }

    public EditMessageCaption replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public EditMessageCaption showCaptionAboveMedia(boolean show_caption_above_media){
        return add("show_caption_above_media", show_caption_above_media);
    }

    public EditMessageCaption businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
}
