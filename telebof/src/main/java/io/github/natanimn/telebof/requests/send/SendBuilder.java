package io.github.natanimn.telebof.requests.send;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.keyboard.Markup;
import io.github.natanimn.telebof.types.ReplyParameters;
import io.github.natanimn.telebof.types.suggested.SuggestedPostParameters;
import io.github.natanimn.telebof.types.updates.Message;

import java.lang.reflect.Type;

/**
 * Common parameters builder for sendXyz methods
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
abstract public class SendBuilder<T, R> extends AbstractBaseRequest<T, R> {

    public SendBuilder(Object chatId, Api api, String methodName) {
        super(chatId, api, methodName, Message.class);
    }

    public SendBuilder(Object chatId, Api api, String methodName, Type type) {
        super(chatId, api, methodName, type);
    }

    /**
     * Optional
     * @param messageThreadId Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     * @return {@link T}
     */
    public T messageThreadId(int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the message text.
     * @return {@link T}
     */
    public T parseMode(ParseMode parseMode) {
        return add("parse_mode",  parseMode);
    }


    public T disableWebPagePreview(boolean disableWebPagePreview) {
        return add("disable_web_page_preview", disableWebPagePreview);
    }

    /**
     * Optional
     * @param disableNotification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link T}
     */
    public T disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    /**
     * Optional
     * @param protectContent Protects the contents of the sent message from forwarding and saving
     * @return {@link T}
     */
    public T protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    /**
     * Optional
     * @param replyParameters Description of the message to reply to
     * @return {@link T}
     */
    public T replyParameters(ReplyParameters replyParameters){
        return add("reply_parameters", replyParameters);
    }

    /**
     * Optional
     * @param replyMarkup Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     *                     instructions to remove a reply keyboard or to force a reply from the user
     * @return {@link T}
     */
    public T replyMarkup(Markup replyMarkup) {
        return add("reply_markup", replyMarkup);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the message will be sent
     * @return {@link T}
     */
    public T businessConnectionId(String businessConnectionId){
        return add("business_connection_id", businessConnectionId);
    }

    /**
     * Optional
     * @param messageEffectId Unique identifier of the message effect to be added to the message; for private chats only
     * @return {@link T}
     */
    public T messageEffectId(String messageEffectId){
        return add("message_effect_id", messageEffectId);
    }

    /**
     * Optional
     * @param allowPaidBroadcast Pass True to allow up to 1000 messages per second, ignoring broadcasting limits for a fee of 0.1 Telegram Stars per message.
     *                             The relevant Stars will be withdrawn from the bot's balance
     * @return {@link T}
     */
    public T allowPaidBroadcast(boolean allowPaidBroadcast){
        return add("allow_paid_broadcast", allowPaidBroadcast);
    }

    /***
     * Optional
     * @param directMessagesTopicId Identifier of the direct messages topic to which the message will be sent; required if the message is sent to a direct messages chat
     * @return {@link T}
     */
    public T directMessagesTopicId(int directMessagesTopicId){
        return add("direct_messages_topic_id", directMessagesTopicId);
    }

    /**
     * Optional
     * @param suggestedPostParameters A JSON-serialized object containing the parameters of the suggested post to send; for direct messages chats only.
     *                                  If the message is sent as a reply to another suggested post, then that suggested post is automatically declined.
     * @return {@link T}
     */
    public T suggestedPostParameters(SuggestedPostParameters suggestedPostParameters){
        return add("suggested_post_parameters", suggestedPostParameters);
    }
}
