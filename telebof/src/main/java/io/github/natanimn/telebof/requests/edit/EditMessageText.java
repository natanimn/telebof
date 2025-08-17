package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.media_and_service.LinkPreviewOptions;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

import java.util.List;

/**
 * EditMessageText class.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#editMessageText
 */
public class EditMessageText extends AbstractBaseRequest<EditMessageText, Object> {
    /**
     * Required
     * @param text test
     * @param chat_id chat id
     * @param message_id message id
     * @param api api
     * @see BotContext#editMessageText(String, Object, int)
     */
    public EditMessageText(String text, Object chat_id, int message_id, Api api) {
        super(chat_id, api, "editMessageText", Message.class);
        add("text", text);
        add("message_id", message_id);
    }

    /**
     * Required
     * @param text test
     * @param inline_message_id inline message id
     * @param api api
     * @see BotContext#editMessageText(String, String)
     */
    public EditMessageText(String text, String inline_message_id, Api api) {
        super(api, "editMessageText", Boolean.class);
        add("text", text);
        add("inline_message_id", inline_message_id);
    }

    /**
     * Optional
     * @param parse_mode Mode for parsing entities in the message text.
     * @return {@link EditMessageText}
     *
     */
    public EditMessageText parseMode(ParseMode parse_mode) {
        return add("parse_mode",  parse_mode);
    }

    /**
     * Optional
     * @param entities A JSON-serialized list of special entities that appear in message text, which can be specified instead of parse_mode
     * @return {@link EditMessageText}
     */
    public EditMessageText entities(MessageEntity[] entities) {
        return add("entities", List.of(entities));
    }

    /**
     * Optional
     * @param link_preview_options Link preview generation options for the message
     * @return {@link EditMessageText}
     */
    public EditMessageText linkPreviewOption(LinkPreviewOptions link_preview_options) {
        return add("disable_web_page_preview", link_preview_options);
    }

    /**
     * Optional
     * @param reply_markup A JSON-serialized object for an inline keyboard.
     * @return {@link EditMessageText}
     */
    public EditMessageText replyMarkup(InlineKeyboardMarkup reply_markup) {
        return add("reply_markup", reply_markup);
    }

    public EditMessageText businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }
}
