package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.input.InputChecklist;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * EditMessageChecklist class. Returns {@link Message} on success.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.1.0
 * @see BotContext#editMessageChecklist
 */
public class EditMessageChecklist extends AbstractBaseRequest<EditMessageChecklist, Message> {

    /**
     * Required
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message will be sent
     * @param chat_id Unique identifier for the target chat
     * @param message_id Unique identifier for the target message
     * @param checklist A JSON-serialized object for the new checklist
     * @param api api
     */
    public EditMessageChecklist(String business_connection_id, Object chat_id, Integer message_id, InputChecklist checklist, Api api) {
        super(chat_id, api, "editMessageChecklist", Message.class);
        add("business_connection_id", business_connection_id);
        add("message_id", message_id);
        add("checklist", checklist);
    }

    /**
     * Optional
     * @param reply_markup A JSON-serialized object for the new inline keyboard for the message
     * @return {@link EditMessageChecklist}
     */
    public EditMessageChecklist replyMarkup(InlineKeyboardMarkup reply_markup) {
        return add("reply_markup", reply_markup);
    }
}