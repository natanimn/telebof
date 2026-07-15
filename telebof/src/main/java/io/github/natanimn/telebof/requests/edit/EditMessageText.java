package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.input.InputRichMessage;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.media_and_service.LinkPreviewOptions;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

import java.util.List;

/**
 * EditMessageText class.
 * @author Natanim
 * @since 3 March 2025
 * @see BotContext#editMessageText
 */
public class EditMessageText extends AbstractBaseRequest<EditMessageText, Object> {

    public EditMessageText(Object chatId, String text, int messageId, Api api) {
        super(chatId, api, "editMessageText", Message.class);
        add("text", text);
        add("message_id", messageId);
    }

    public EditMessageText(Object chatId, InputRichMessage richMessage, int messageId, Api api) {
        super(chatId, api, "editMessageText", Message.class);
        add("rich_message", richMessage);
        add("message_id", messageId);
    }

    public EditMessageText(String inlineMessageId, String text, Api api) {
        super(api, "editMessageText", Boolean.class);
        add("text", text);
        add("inline_message_id", inlineMessageId);
    }

    public EditMessageText(String inlineMessageId, InputRichMessage richMessage, Api api) {
        super(api, "editMessageText", Boolean.class);
        add("rich_message", richMessage);
        add("inline_message_id", inlineMessageId);
    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the message text.
     * @return {@link EditMessageText}
     *
     */
    public EditMessageText parseMode(ParseMode parseMode) {
        return add("parse_mode",  parseMode);
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
     * @param linkPreviewOption Link preview generation options for the message
     * @return {@link EditMessageText}
     */
    public EditMessageText linkPreviewOption(LinkPreviewOptions linkPreviewOption) {
        return add("disable_web_page_preview", linkPreviewOption);
    }

    /**
     * Optional
     * @param replyMarkup A JSON-serialized object for an inline keyboard.
     * @return {@link EditMessageText}
     */
    public EditMessageText replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    public EditMessageText businessConnectionId(String businessConnectionId){
        return add("business_connection_id", businessConnectionId);
    }
}
