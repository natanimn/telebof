package io.github.natanimn.telebof.requests.service;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.media_and_service.MessageId;

import java.lang.reflect.Type;
import java.util.List;

/**
 * CopyMessages class. Returns list of {@link MessageId} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#copyMessages(Object, Object, Integer[])
 */
public class CopyMessages extends AbstractBaseRequest<CopyMessages, List<MessageId>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, MessageId.class).getType();

    public CopyMessages(Object chatId, Object fromChatId, Integer[] messageIds, Api api) {
        super(chatId, api, "copyMessages", responseType);
        add("from_chat_id", fromChatId);
        add("message_id", messageIds);
    }

    /**
     * Optional
     * @param removeCaption Pass True to copy the messages without their captions
     * @return {@link CopyMessages}
     */
    public CopyMessages removeCaption(Boolean removeCaption) {
        return add("remove_caption", removeCaption);
    }

    /**
     * Optional
     * @param protectContent Protects the contents of the sent messages from forwarding and saving
     * @return {@link CopyMessages}
     */
    public CopyMessages protectContent(Boolean protectContent) {
        return add("protect_content", protectContent);
    }

    /**
     * Optional
     * @param disableNotification Sends the messages silently. Users will receive a notification with no sound.
     * @return {@link CopyMessages}
     */
    public CopyMessages disableNotification(Boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    /***
     * Optional
     * @param messageThreadId Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     * @return {@link CopyMessages}
     */
    public CopyMessages messageThreadId(Integer messageThreadId){
        return add("message_thread_id", messageThreadId);
    }

    /***
     * Optional
     * @param directMessagesTopicId Identifier of the direct messages topic to which the message will be sent; required if the message is sent to a direct messages chat
     * @return {@link CopyMessages}
     */
    public CopyMessages directMessagesTopicId(int directMessagesTopicId){
        return add("direct_messages_topic_id", directMessagesTopicId);
    }

}
