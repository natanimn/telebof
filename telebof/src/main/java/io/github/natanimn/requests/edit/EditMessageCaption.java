package io.github.natanimn.requests.edit;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.types.updates.Message;
import io.github.natanimn.types.media_and_service.MessageEntity;

import java.util.List;

/**
 * EditMessageCaption class.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class EditMessageCaption extends AbstractBaseRequest<EditMessageCaption, Object> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_id message id
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#editMessageCaption(Object, int)}
     */
    public EditMessageCaption(Object chat_id, int message_id, RequestSender requestSender) {
        super(chat_id, requestSender, "editMessageCaption", Message.class);
        add("message_id", message_id);
    }

    /**
     * Required
     * @param inline_message_id inline message id
     * @param requestSender request sender
     */
    public EditMessageCaption(String inline_message_id, RequestSender requestSender) {
        super(requestSender, "editMessageCaption", Boolean.class);
        add("inline_message_id", inline_message_id);
    }

    /**
     * Optional
     * @param parse_mode Mode for parsing entities in the message caption.
     * @return {@link EditMessageCaption}
     */
    public EditMessageCaption parseMode(ParseMode parse_mode) {
        return add("parse_mode",  parse_mode);
    }

    /**
     * Optional
     * @param caption_entities A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link EditMessageCaption}
     */
    public EditMessageCaption entities(MessageEntity[] caption_entities) {
        return add("caption_entities", List.of(caption_entities));
    }

    /**
     * Optional
     * @param reply_markup A JSON-serialized object for an inline keyboard.
     * @return {@link EditMessageCaption}
     */
    public EditMessageCaption replyMarkup(InlineKeyboardMarkup reply_markup) {
        return add("reply_markup", reply_markup);
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media.
     *                                Supported only for animation, photo and video messages.
     * @return {@link EditMessageCaption}
     */
    public EditMessageCaption showCaptionAboveMedia(boolean show_caption_above_media){
        return add("show_caption_above_media", show_caption_above_media);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message to be edited was sent
     * @return {@link EditMessageCaption}
     */
    public EditMessageCaption businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
}
