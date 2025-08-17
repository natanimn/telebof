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
 * @version 0.9
 * @see BotContext#forwardMessages
 */
public class ForwardMessages extends AbstractBaseRequest<ForwardMessages, List<MessageId>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, MessageId.class).getType();

    public ForwardMessages(Object chatId, Object fromChatId, int[] message_ids, Api api) {
        super(chatId, api, "forwardMessages", responseType);
        add("from_chat_id", fromChatId);
        add("message_id", message_ids);
    }

    /**
     * Optional
     * @param message_thread_id Unique identifier for the target message thread (topic) of the forum; for forum supergroups only
     * @return {@link ForwardMessages}
     */
    public ForwardMessages messageThreadId(int message_thread_id) {
        return add("message_thread_id", message_thread_id);
    }

    /**
     * Optional
     * @param disable_notification Sends the messages silently. Users will receive a notification with no sound.
     * @return {@link ForwardMessages}
     */
    public ForwardMessages disableNotification(boolean disable_notification) {
        return add("disable_notification", disable_notification);
    }

    /**
     * Optional
     * @param protect_content Protects the contents of the forwarded messages from forwarding and saving
     * @return {@link ForwardMessages}
     */
    public ForwardMessages protectContent(boolean protect_content) {
        return add("protect_content", protect_content);
    }

}
