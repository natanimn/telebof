package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.media_and_service.LinkPreviewOptions;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

import java.util.List;

/**
 * EditEphemeralMessageText class.
 * @author Natanim
 * @since 2.2
 * @see BotContext#editEphemeralMessageText
 */
public class EditEphemeralMessageText extends AbstractBaseRequest<EditEphemeralMessageText, Boolean> {

    public EditEphemeralMessageText(Object chatId, long receiverUserId, String text, int ephemeralMessageId, Api api) {
        super(chatId, api, "editEphemeralMessageText");
        add("text", text);
        add("receiver_user_id", receiverUserId);
        add("ephemeral_message_id", ephemeralMessageId);
    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the message text.
     * @return {@link EditEphemeralMessageText}
     *
     */
    public EditEphemeralMessageText parseMode(ParseMode parseMode) {
        return add("parse_mode",  parseMode);
    }

    /**
     * Optional
     * @param entities A JSON-serialized list of special entities that appear in message text, which can be specified instead of parse_mode
     * @return {@link EditEphemeralMessageText}
     */
    public EditEphemeralMessageText entities(MessageEntity[] entities) {
        return add("entities", List.of(entities));
    }

    /**
     * Optional
     * @param linkPreviewOption Link preview generation options for the message
     * @return {@link EditEphemeralMessageText}
     */
    public EditEphemeralMessageText linkPreviewOption(LinkPreviewOptions linkPreviewOption) {
        return add("disable_web_page_preview", linkPreviewOption);
    }

    /**
     * Optional
     * @param replyMarkup A JSON-serialized object for an inline keyboard.
     * @return {@link EditEphemeralMessageText}
     */
    public EditEphemeralMessageText replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

}
