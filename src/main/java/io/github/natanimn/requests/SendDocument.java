package io.github.natanimn.requests;

import io.github.natanimn.types.Message;
import io.github.natanimn.types.MessageEntity;
import java.io.File;import java.util.List;

/**
 * @author Natanim Negash
 * @version 1.1.2 1.1.0
 */

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SendDocument extends DefaultParameters<SendDocument, Message> {
    public SendDocument(Object chatId, String document, RequestSender requestSender) {
        super(chatId, requestSender, "sendDocument");
        add("document", document);
    }

    public SendDocument(Object chatId, File document, RequestSender requestSender) {
        super(chatId, requestSender, "sendDocument");
        add("document", document);
        setContentType(MediaContentType.DOCUMENT);

    }

    public SendDocument caption(String cap) {
        return add("caption", cap);
    }

    public SendDocument captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", List.of(captionEntities));
    }

    public SendDocument thumbnail(String thumbnail) {
        return add("thumbnail", thumbnail);
    }

    public SendDocument thumbnail(File thumbnail) {
        setContentType(MediaContentType.DEFAULT);
        return add("thumbnail", thumbnail);
    }

    public SendDocument disableContentTypeDetection(boolean disableContentTypeDetection) {
        return add("disable_content_type_detection", disableContentTypeDetection);
    }

}
