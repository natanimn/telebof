package io.github.natanimn.telebof.requests.send;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.keyboard.Markup;
import io.github.natanimn.telebof.types.keyboard.ReplyParameters;
import io.github.natanimn.telebof.types.updates.Message;

import java.lang.reflect.Type;

/**
 * Common parameters builder for sendXyz methods
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
abstract public class SendBuilder<T, R> extends AbstractBaseRequest<T, R> {

    public SendBuilder(Object chatId, RequestSender requestSender, String methodName) {
        super(chatId, requestSender, methodName, Message.class);
    }

    public SendBuilder(Object chatId, RequestSender requestSender, String methodName, Type type) {
        super(chatId, requestSender, methodName, type);
    }

    /**
     * Optional
     * @param message_thread_id Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     * @return {@link T}
     */
    public T messageThreadId(int message_thread_id) {
        return add("message_thread_id", message_thread_id);
    }

    /**
     * Optional
     * @param parse_mode Mode for parsing entities in the message text.
     * @return
     */
    public T parseMode(ParseMode parse_mode) {
        return add("parse_mode",  parse_mode);
    }


    public T disableWebPagePreview(boolean disable_web_page_preview) {
        return add("disable_web_page_preview", disable_web_page_preview);
    }

    /**
     * Optional
     * @param disable_notification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link T}
     */
    public T disableNotification(boolean disable_notification) {
        return add("disable_notification", disable_notification);
    }

    /**
     * Optional
     * @param protect_content Protects the contents of the sent message from forwarding and saving
     * @return {@link T}
     */
    public T protectContent(boolean protect_content) {
        return add("protect_content", protect_content);
    }

    /**
     * Optional
     * @param reply_parameters Description of the message to reply to
     * @return {@link T}
     */
    public T replyParameters(ReplyParameters reply_parameters){
        return add("reply_parameters", reply_parameters);
    }

    /**
     * Optional
     * @param reply_markup Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     *                     instructions to remove a reply keyboard or to force a reply from the user
     * @return {@link T}
     */
    public T replyMarkup(Markup reply_markup) {
        return add("reply_markup", reply_markup);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message will be sent
     * @return {@link T}
     */
    public T businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

    /**
     * Optional
     * @param message_effect_id Unique identifier of the message effect to be added to the message; for private chats only
     * @return {@link T}
     */
    public T messageEffectId(String message_effect_id ){
        return add("message_effect_id ", message_effect_id);
    }

    /**
     * Optional
     * @param allow_paid_broadcast Pass True to allow up to 1000 messages per second, ignoring broadcasting limits for a fee of 0.1 Telegram Stars per message.
     *                             The relevant Stars will be withdrawn from the bot's balance
     * @return {@link T}
     */
    public T allowPaidBroadcast(boolean allow_paid_broadcast){
        return add("allow_paid_broadcast", allow_paid_broadcast);
    }

}
