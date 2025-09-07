package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.keyboard.Markup;
import io.github.natanimn.telebof.types.suggested.SuggestedPostParameters;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.ReplyParameters;

/**
 * SendPoll class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#sendDice
 */
public class SendDice extends AbstractBaseRequest<SendDice, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param api api
     */
    public SendDice(Object chat_id, Api api) {
        super(chat_id, api, "sendDice", Message.class);
    }

    /**
     * Optional
     * @param emoji Emoji on which the dice throw animation is based.
     *              Currently, must be one of “🎲”, “🎯”, “🏀”, “⚽”, “🎳”, or “🎰”. Dice can have values 1-6 for “🎲”, “🎯” and “🎳”,
     *              values 1-5 for “🏀” and “⚽”, and values 1-64 for “🎰”. Defaults to “🎲”
     * @return {@link SendDice}
     */
    public SendDice emoji(String emoji) {
        return add("emoji", emoji);
    }

    /**
     * Optional
     * @param disable_notification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link SendDice}
     */
    public SendDice disableNotification(boolean disable_notification) {
        return add("disable_notification", disable_notification);
    }

    /**
     * Optional
     * @param protect_content Protects the contents of the sent message from forwarding
     * @return {@link SendDice}
     */
    public SendDice protectContent(boolean protect_content) {
        return add("protect_content", protect_content);
    }

    /**
     * Optional
     * @param reply_parameters Description of the message to reply to
     * @return {@link SendDice}
     */
    public SendDice replyParameters(ReplyParameters reply_parameters){
        return add("reply_parameters", reply_parameters);
    }

    /**
     * Optional
     * @param reply_markup Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     *                     instructions to remove a reply keyboard or to force a reply from the user
     * @return {@link SendDice}
     */
    public SendDice replyMarkup(Markup reply_markup) {
        return add("reply_markup", reply_markup);
    }


    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the message will be sent
     * @return {@link SendDice}
     */
    public SendDice businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

    /**
     * Optional
     * @param message_effect_id Unique identifier of the message effect to be added to the message; for private chats only
     * @return {@link SendDice}
     */
    public SendDice messageEffectId(String message_effect_id){
        return add("message_effect_id ", message_effect_id);
    }


    /***
     * Optional
     * @param direct_messages_topic_id Identifier of the direct messages topic to which the message will be sent; required if the message is sent to a direct messages chat
     * @return {@link SendDice}
     */
    public SendDice directMessagesTopicId(int direct_messages_topic_id){
        return add("direct_messages_topic_id", direct_messages_topic_id);
    }

    /**
     * Optional
     * @param suggested_post_parameters A JSON-serialized object containing the parameters of the suggested post to send; for direct messages chats only.
     *                                  If the message is sent as a reply to another suggested post, then that suggested post is automatically declined.
     * @return {@link SendDice}
     */
    public SendDice suggestedPostParameters(SuggestedPostParameters suggested_post_parameters){
        return add("suggested_post_parameters", suggested_post_parameters);
    }

}
