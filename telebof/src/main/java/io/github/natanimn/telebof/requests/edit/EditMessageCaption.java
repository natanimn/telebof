package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

/**
 * EditMessageCaption class.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class EditMessageCaption extends AbstractBaseRequest<EditMessageCaption, Object> {
    /**
     * Required
     * @param chatId chat id
     * @param messageId message id
     * @param api api
     * @see BotContext#editMessageCaption(Object, int)
     */
    public EditMessageCaption(Object chatId, int messageId, Api api) {
        super(chatId, api, "editMessageCaption", Message.class);
        add("message_id", messageId);
    }

    /**
     * Required
     * @param inlineMessageId inline message id
     * @param api api
     */
    public EditMessageCaption(String inlineMessageId, Api api) {
        super(api, "editMessageCaption", Boolean.class);
        add("inline_message_id", inlineMessageId);
    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the message caption.
     * @return {@link EditMessageCaption}
     */
    public EditMessageCaption parseMode(ParseMode parseMode) {
        return add("parse_mode",  parseMode);
    }

    /**
     * Optional
     * @param captionEntities A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link EditMessageCaption}
     */
    public EditMessageCaption captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
    }

    /**
     * Optional
     * @param replyMarkup A JSON-serialized object for an inline keyboard.
     * @return {@link EditMessageCaption}
     */
    public EditMessageCaption replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media.
     *                                Supported only for animation, photo and video messages.
     * @return {@link EditMessageCaption}
     */
    public EditMessageCaption showCaptionAboveMedia(boolean showCaptionAboveMedia){
        return add("show_caption_above_media", showCaptionAboveMedia);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message to be edited was sent
     * @return {@link EditMessageCaption}
     */
    public EditMessageCaption businessConnectionId(String businessConnectionId){
        return add("business_connection_id", businessConnectionId);
    }
}
