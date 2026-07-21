package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.input.InputMedia;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;

/**
 * EditEphemeralMessageMedia class.
 * @author Natanim
 * @since 2.2
 * @see BotContext#editEphemeralMessageMedia
 */
public class EditEphemeralMessageMedia extends AbstractBaseRequest<EditEphemeralMessageMedia, Boolean> {

    public EditEphemeralMessageMedia(Object chatId, long receiverUserId, InputMedia media, int ephemeralMessageId, Api api) {
        super(chatId, api, "editEphemeralMessageMedia");
        add("media", media);
        add("receiver_user_id", receiverUserId);
        add("ephemeral_message_id", ephemeralMessageId);
    }

    /**
     * Optional
     * @param replyMarkup A JSON-serialized object for an inline keyboard.
     * @return {@link EditEphemeralMessageMedia}
     */
    public EditEphemeralMessageMedia replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }
}
