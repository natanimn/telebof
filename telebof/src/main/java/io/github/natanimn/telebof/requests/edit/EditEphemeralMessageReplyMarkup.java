package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;

/**
 * EditEphemeralMessageReplyMarkup class.
 * @author Natanim
 * @since 2.2
 * @see BotContext#editEphemeralMessageReplyMarkup
 */
public class EditEphemeralMessageReplyMarkup extends AbstractBaseRequest<EditEphemeralMessageReplyMarkup, Boolean> {

    public EditEphemeralMessageReplyMarkup(Object chatId, long receiverUserId, int ephemeralMessageId, Api api) {
        super(chatId, api, "editEphemeralMessageReplyMarkup");
        add("receiver_user_id", receiverUserId);
        add("ephemeral_message_id", ephemeralMessageId);
    }

    /**
     * Optional
     * @param replyMarkup A JSON-serialized object for an inline keyboard.
     * @return {@link EditEphemeralMessageReplyMarkup}
     */
    public EditEphemeralMessageReplyMarkup replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

}
