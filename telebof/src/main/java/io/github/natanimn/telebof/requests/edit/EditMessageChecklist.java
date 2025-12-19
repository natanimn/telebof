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
 * @version 1.3.0
 * @see BotContext#editMessageChecklist
 */
public class EditMessageChecklist extends AbstractBaseRequest<EditMessageChecklist, Message> {

    /**
     * Required
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message will be sent
     * @param chatId Unique identifier for the target chat
     * @param messageId Unique identifier for the target message
     * @param checklist A JSON-serialized object for the new checklist
     * @param api api
     */
    public EditMessageChecklist(String businessConnectionId, Object chatId, Integer messageId, InputChecklist checklist, Api api) {
        super(chatId, api, "editMessageChecklist", Message.class);
        add("business_connection_id", businessConnectionId);
        add("message_id", messageId);
        add("checklist", checklist);
    }

    /**
     * Optional
     * @param replyMarkup A JSON-serialized object for the new inline keyboard for the message
     * @return {@link EditMessageChecklist}
     */
    public EditMessageChecklist replyMarkup(InlineKeyboardMarkup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }
}