package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.types.media_and_service.MessageEntity;
import io.github.natanimn.types.media_and_service.MessageId;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class CopyMessages extends AbstractBaseRequest<CopyMessages, List<MessageId>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, MessageId.class).getType();

    public CopyMessages(Object chatId, Object fromChatId, List<Integer> messageIds, RequestSender requestSender) {
        super(chatId, requestSender, "copyMessages", responseType);
        add("from_chat_id", fromChatId);
        add("message_id", messageIds);
    }

    public CopyMessages caption(String cap) {
        return add("caption", cap);
    }

    public CopyMessages captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", List.of(captionEntities));
    }

}
