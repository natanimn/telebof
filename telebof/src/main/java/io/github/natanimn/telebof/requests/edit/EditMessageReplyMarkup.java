package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * EditMessageReplyMarkup class.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class EditMessageReplyMarkup extends AbstractBaseRequest<EditMessageReplyMarkup, Object> {
    /**
     * Required
     * @param chatId chat id
     * @param messageId message id
     * @param api api
     * @see BotContext#editMessageReplyMarkup(Object, int)
     */
    public EditMessageReplyMarkup(Object chatId, int messageId, Api api) {
        super(chatId, api, "editMessageReplyMarkup", Message.class);
        add("message_id", messageId);
    }

    /**
     * Required
     * @param inlineMessageId inline message id
     * @param api api
     * @see BotContext#editMessageReplyMarkup(String)
     */
    public EditMessageReplyMarkup(String inlineMessageId, Api api) {
        super(api, "editMessageReplyMarkup", Boolean.class);
        add("inline_message_id", inlineMessageId);
    }

    /**
     * Optional
     * @param replyMarkup A JSON-serialized object for an inline keyboard.
     * @return {@link EditMessageReplyMarkup}
     */
    public EditMessageReplyMarkup replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message to be edited was sent
     * @return {@link EditMessageReplyMarkup}
     */
    public EditMessageReplyMarkup businessConnectionId(String businessConnectionId){
        return add("business_connection_id", businessConnectionId);
    }

}
