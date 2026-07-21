package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

/**
 * EditEphemeralMessageCaption class.
 * @author Natanim
 * @since 2.2
 * @see BotContext#editEphemeralMessageCaption
 */
public class EditEphemeralMessageCaption extends AbstractBaseRequest<EditEphemeralMessageCaption, Boolean> {

    public EditEphemeralMessageCaption(Object chatId, long receiverUserId, int ephemeralMessageId, Api api) {
        super(chatId, api, "editEphemeralMessageCaption");
        add("receiver_user_id", receiverUserId);
        add("ephemeral_message_id", ephemeralMessageId);
    }

    /**
     * Optional
     * @param caption New caption of the message, 0-1024 characters after entities parsing
     * @return {@link EditEphemeralMessageCaption}
     *
     */
    public EditEphemeralMessageCaption caption(String caption) {
        return add("caption",  caption);
    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the message text.
     * @return {@link EditEphemeralMessageCaption}
     *
     */
    public EditEphemeralMessageCaption parseMode(ParseMode parseMode) {
        return add("parse_mode",  parseMode);
    }

    /**
     * Optional
     * @param captionEntities A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link EditEphemeralMessageCaption}
     */
    public EditEphemeralMessageCaption captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
    }

    /**
     * Optional
     * @param replyMarkup A JSON-serialized object for an inline keyboard.
     * @return {@link EditEphemeralMessageCaption}
     */
    public EditEphemeralMessageCaption replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

}
