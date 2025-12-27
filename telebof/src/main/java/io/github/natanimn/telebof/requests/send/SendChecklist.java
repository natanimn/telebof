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
 * @version 1.3.0
 * @see BotContext#sendChecklist
 */
public class SendChecklist extends AbstractBaseRequest<SendChecklist, Message> {

    /**
     * Required
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message will be sent
     * @param chatId Unique identifier for the target chat
     * @param checklist A JSON-serialized object for the checklist to send
     * @param api api
     */
    public SendChecklist(String businessConnectionId, Object chatId, InputChecklist checklist, Api api) {
        super(chatId, api, "sendChecklist", Message.class);
        add("business_connection_id", businessConnectionId);
        add("checklist", checklist);
    }

    /**
     * Optional
     * @param disableNotification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link SendChecklist}
     */
    public SendChecklist disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    /**
     * Optional
     * @param protectContent Protects the contents of the sent message from forwarding and saving
     * @return {@link SendChecklist}
     */
    public SendChecklist protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    /**
     * Optional
     * @param messageEffectId Unique identifier of the message effect to be added to the message
     * @return {@link SendChecklist}
     */
    public SendChecklist messageEffectId(String messageEffectId) {
        return add("message_effect_id", messageEffectId);
    }

    /**
     * Optional
     * @param replyParameters Description of the message to reply to
     * @return {@link SendChecklist}
     */
    public SendChecklist replyParameters(ReplyParameters replyParameters) {
        return add("reply_parameters", replyParameters);
    }

    /**
     * Optional
     * @param replyMarkup Additional interface options. A JSON-serialized object for an inline keyboard
     * @return {@link SendChecklist}
     */
    public SendChecklist replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }
}