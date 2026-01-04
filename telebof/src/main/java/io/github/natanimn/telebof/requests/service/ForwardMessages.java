package io.github.natanimn.telebof.requests.service;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.media_and_service.MessageId;

import java.lang.reflect.Type;
import java.util.List;

/**
 * ForwardMessages class
 * On success, an array of {@link MessageId} of the sent messages is returned.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#forwardMessages
 */
public class ForwardMessages extends AbstractBaseRequest<ForwardMessages, List<MessageId>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, MessageId.class).getType();

    public ForwardMessages(Object chatId, Object fromChatId, Integer[] message_ids, Api api) {
        super(chatId, api, "forwardMessages", responseType);
        add("from_chat_id", fromChatId);
        add("message_id", message_ids);
    }

    /**
     * Optional
     * @param messageThreadId Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     * @return {@link ForwardMessages}
     */
    public ForwardMessages messageThreadId(int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    /**
     * Optional
     * @param disableNotification Sends the messages silently. Users will receive a notification with no sound.
     * @return {@link ForwardMessages}
     */
    public ForwardMessages disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    /**
     * Optional
     * @param protectContent Protects the contents of the forwarded messages from forwarding and saving
     * @return {@link ForwardMessages}
     */
    public ForwardMessages protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }

    /***
     * Optional
     * @param directMessagesTopicId Identifier of the direct messages topic to which the message will be sent; required if the message is sent to a direct messages chat
     * @return {@link ForwardMessages}
     */
    public ForwardMessages directMessagesTopicId(int directMessagesTopicId){
        return add("direct_messages_topic_id", directMessagesTopicId);
    }

}
