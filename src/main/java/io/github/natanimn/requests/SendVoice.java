package io.github.natanimn.requests;

import io.github.natanimn.types.Message;
import io.github.natanimn.types.MessageEntity;
import java.io.File;
import java.util.List;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SendVoice extends DefaultParameters<SendVoice, Message> {
    public SendVoice(Object chatId, String voice, RequestSender requestSender) {
        super(chatId, requestSender, "sendVoice");
        add("voice", voice);
    }

    public SendVoice(Object chatId, File voice, RequestSender requestSender) {
        super(chatId, requestSender, "sendVoice");
        add("voice", voice);
        setContentType(MediaContentType.VOICE);
    }

    public SendVoice caption(String captions) {
        return add("caption", captions);
    }

    public SendVoice captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", List.of(captionEntities));
    }

}
