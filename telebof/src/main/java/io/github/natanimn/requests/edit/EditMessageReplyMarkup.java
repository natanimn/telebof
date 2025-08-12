package io.github.natanimn.requests.edit;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.types.updates.Message;

/**
 * EditMessageReplyMarkup class.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class EditMessageReplyMarkup extends AbstractBaseRequest<EditMessageReplyMarkup, Object> {
    /**
     * Required
     * @param chat_id chat id
     * @param message_id message id
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#editMessageReplyMarkup(Object, int)}
     */
    public EditMessageReplyMarkup(Object chat_id, int message_id, RequestSender requestSender) {
        super(chat_id, requestSender, "editMessageReplyMarkup", Message.class);
        add("message_id", message_id);
    }

    /**
     * Required
     * @param inline_message_id inline message id
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#editMessageReplyMarkup(String)}
     */
    public EditMessageReplyMarkup(String inline_message_id, RequestSender requestSender) {
        super(requestSender, "editMessageReplyMarkup", Boolean.class);
        add("inline_message_id", inline_message_id);
    }

    /**
     * Optional
     * @param reply_markup A JSON-serialized object for an inline keyboard.
     * @return {@link EditMessageReplyMarkup}
     */
    public EditMessageReplyMarkup replyMarkup(InlineKeyboardMarkup reply_markup) {
        return add("reply_markup", reply_markup);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message to be edited was sent
     * @return {@link EditMessageReplyMarkup}
     */
    public EditMessageReplyMarkup businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

}
