package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.updates.Message;

/**
 * ForwardMessage class.
 * Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#forward}
 */
public class ForwardMessage extends AbstractBaseRequest<ForwardMessage, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param from_chat_id from chat id
     * @param message_id message id
     * @param requestSender request sender
     */
    public ForwardMessage(Object chat_id, Object from_chat_id, int message_id, RequestSender requestSender) {
        super(chat_id, requestSender, "forwardMessage", Message.class);
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

}

