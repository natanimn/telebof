package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

import java.io.File;
import java.util.List;

/**
 * SendDocument class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SendDocument extends SendBuilder<SendDocument, Message> {

    /**
     * Required
     * @param chatId chat id
     * @param document file id or url
     * @param api api
     * @see BotContext#sendDocument(Object, String)
     */
    public SendDocument(Object chatId, String document, Api api) {
        super(chatId, api, "sendDocument");
        add("document", document);
    }

    /**
     * Required
     * @param chatId chat id
     * @param document file id or url
     * @param api api
     * @see BotContext#sendDocument(Object, File)
     */
    public SendDocument(Object chatId, File document, Api api) {
        super(chatId, api, "sendDocument");
        add("document", document);

    }

    /**
     * Optional
     * @param caption Document caption (may also be used when resending documents by file_id), 0-1024 characters after entities parsing
     * @return {@link SendDocument}
     */
    public SendDocument caption(String caption) {
        return add("caption", caption);
    }

    /**
     * Optional
     * @param captionEntities A list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendDocument}
     */
    public SendDocument captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320.
     * @return {@link SendDocument}
     */
    public SendDocument thumbnail(String thumbnail) {
        return add("thumbnail", thumbnail);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320.
     * @return {@link SendDocument}
     */
    public SendDocument thumbnail(File thumbnail) {
        return add("thumbnail", thumbnail);
    }

    /**
     * Optional
     * @param disableContentTypeDetection Disables automatic server-side content type detection for files uploaded using multipart/form-data
     * @return {@link SendDocument}
     */
    public SendDocument disableContentTypeDetection(boolean disableContentTypeDetection) {
        return add("disable_content_type_detection", disableContentTypeDetection);
    }

}
