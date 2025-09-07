package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.input.InputChecklist;
import io.github.natanimn.telebof.types.keyboard.Markup;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.ReplyParameters;

/**
 * SendChecklist class. Returns {@link Message} on success.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.1.0
 * @see BotContext#sendChecklist
 */
public class SendChecklist extends AbstractBaseRequest<SendChecklist, Message> {

    /**
     * Required
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message will be sent
     * @param chat_id Unique identifier for the target chat
     * @param checklist A JSON-serialized object for the checklist to send
     * @param api api
     */
    public SendChecklist(String business_connection_id, Object chat_id, InputChecklist checklist, Api api) {
        super(chat_id, api, "sendChecklist", Message.class);
        add("business_connection_id", business_connection_id);
        add("checklist", checklist);
    }

    /**
     * Optional
     * @param disable_notification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link SendChecklist}
     */
    public SendChecklist disableNotification(boolean disable_notification) {
        return add("disable_notification", disable_notification);
    }

    /**
     * Optional
     * @param protect_content Protects the contents of the sent message from forwarding and saving
     * @return {@link SendChecklist}
     */
    public SendChecklist protectContent(boolean protect_content) {
        return add("protect_content", protect_content);
    }

    /**
     * Optional
     * @param message_effect_id Unique identifier of the message effect to be added to the message
     * @return {@link SendChecklist}
     */
    public SendChecklist messageEffectId(String message_effect_id) {
        return add("message_effect_id", message_effect_id);
    }

    /**
     * Optional
     * @param reply_parameters Description of the message to reply to
     * @return {@link SendChecklist}
     */
    public SendChecklist replyParameters(ReplyParameters reply_parameters) {
        return add("reply_parameters", reply_parameters);
    }

    /**
     * Optional
     * @param reply_markup Additional interface options. A JSON-serialized object for an inline keyboard
     * @return {@link SendChecklist}
     */
    public SendChecklist replyMarkup(Markup reply_markup) {
        return add("reply_markup", reply_markup);
    }
}