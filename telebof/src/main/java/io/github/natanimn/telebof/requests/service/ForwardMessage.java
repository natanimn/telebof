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
 * @version 0.9
 * @see BotContext#forward
 */
public class ForwardMessage extends AbstractBaseRequest<ForwardMessage, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param from_chat_id from chat id
     * @param message_id message id
     * @param api api
     */
    public ForwardMessage(Object chat_id, Object from_chat_id, int message_id, Api api) {
        super(chat_id, api, "forwardMessage", Message.class);
        add("from_chat_id", from_chat_id);
        add("message_id", message_id);
    }

    /**
     * Optional
     * @param message_thread_id Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     * @return {@link ForwardMessage}
     */
    public ForwardMessage messageThreadId(int message_thread_id) {
        return add("message_thread_id", message_thread_id);
    }

    /**
     * Optional
     * @param disable_notification Sends the message silently. Users will receive a notification with no sound.
     * @return {@link ForwardMessage}
     */
    public ForwardMessage disableNotification(boolean disable_notification) {
        return add("disable_notification", disable_notification);
    }

    /**
     * Optional
     * @param protect_content Protects the contents of the forwarded message from forwarding and saving
     * @return {@link ForwardMessage}
     */
    public ForwardMessage protectContent(boolean protect_content) {
        return add("protect_content", protect_content);
    }

    /**
     * Optional
     * @param video_start_timestamp New start timestamp for the forwarded video in the message
     * @return {@link ForwardMessage}
     */
    public ForwardMessage videoStartTimestamp(int video_start_timestamp){
        return add("video_start_timestamp", video_start_timestamp);
    }

    /***
     * Optional
     * @param direct_messages_topic_id Identifier of the direct messages topic to which the message will be sent; required if the message is sent to a direct messages chat
     * @return {@link ForwardMessage}
     */
    public ForwardMessage directMessagesTopicId(int direct_messages_topic_id){
        return add("direct_messages_topic_id", direct_messages_topic_id);
    }

    /**
     * Optional
     * @param suggested_post_parameters A JSON-serialized object containing the parameters of the suggested post to send; for direct messages chats only.
     *                                  If the message is sent as a reply to another suggested post, then that suggested post is automatically declined.
     * @return {@link ForwardMessage}
     */
    public ForwardMessage suggestedPostParameters(SuggestedPostParameters suggested_post_parameters){
        return add("suggested_post_parameters", suggested_post_parameters);
    }
}

