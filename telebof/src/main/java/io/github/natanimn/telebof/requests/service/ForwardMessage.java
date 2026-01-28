package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.suggested.SuggestedPostParameters;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * ForwardMessage class.
 * Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#forward
 */
public class ForwardMessage extends AbstractBaseRequest<ForwardMessage, Message> {

    /**
     * Required
     * @param chatId chat id
     * @param fromChatId from chat id
     * @param messageId message id
     * @param api api
     */
    public ForwardMessage(Object chatId, Object fromChatId, int messageId, Api api) {
        super(chatId, api, "forwardMessage", Message.class);
        add("from_chat_id", fromChatId);
        add("message_id", messageId);
    }

    /**
     * Optional
     * @param messageThreadId Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     * @return {@link ForwardMessage}
     */
    public ForwardMessage messageThreadId(int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    /**
     * Optional
     * @param disableNotification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link ForwardMessage}
     */
    public ForwardMessage disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    /**
     * Optional
     * @param protectContent Protects the contents of the forwarded message from forwarding and saving
     * @return {@link ForwardMessage}
     */
    public ForwardMessage protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    /**
     * Optional
     * @param videoStartTimestamp New start timestamp for the forwarded video in the message
     * @return {@link ForwardMessage}
     */
    public ForwardMessage videoStartTimestamp(int videoStartTimestamp){
        return add("video_start_timestamp", videoStartTimestamp);
    }

    /***
     * Optional
     * @param directMessagesTopicId Identifier of the direct messages topic to which the message will be sent; required if the message is sent to a direct messages chat
     * @return {@link ForwardMessage}
     */
    public ForwardMessage directMessagesTopicId(int directMessagesTopicId){
        return add("direct_messages_topic_id", directMessagesTopicId);
    }

    /**
     * Optional
     * @param suggestedPostParameters A JSON-serialized object containing the parameters of the suggested post to send; for direct messages chats only.
     *                                  If the message is sent as a reply to another suggested post, then that suggested post is automatically declined.
     * @return {@link ForwardMessage}
     */
    public ForwardMessage suggestedPostParameters(SuggestedPostParameters suggestedPostParameters){
        return add("suggested_post_parameters", suggestedPostParameters);
    }

    /**
     * Optional
     * @param messageEffectId Unique identifier for the target message thread (topic) of a forum; for forum supergroups and private chats of bots with forum topic mode enabled only
     * @return {@link ForwardMessage}
     */
    public ForwardMessage messageEffectId(String messageEffectId){
        return add("message_effect_id", messageEffectId);
    }

}

