package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.types.media_and_service.MessageId;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class ForwardMessages extends AbstractBaseRequest<ForwardMessages, List<MessageId>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, MessageId.class).getType();

    public ForwardMessages(Object chatId, Object fromChatId, List<Integer> messageIds, RequestSender requestSender) {
        super(chatId, requestSender, "forwardMessages", responseType);
        add("from_chat_id", fromChatId);
        add("message_id", messageIds);
    }

    public ForwardMessages messageThreadId(int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    public ForwardMessages disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }

    public ForwardMessages protectContent(boolean protectContent) {
        return add("protect_content", protectContent);
    }


}
