package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.Util;
import io.github.natanimn.types.ChatMember;
import io.github.natanimn.types.Message;
import io.github.natanimn.types.MessageId;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
