package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import java.io.File;

/**
 * SendPhoto class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class SendPhoto extends SendBuilder<SendPhoto, Message> {

    /**
     * Required
     * @param chat_id Chat id
     * @param photo file id or url
     * @param requestSender request sender
     * @see BotContext#sendPhoto(Object, String)
     */
    public SendPhoto(Object chat_id, String photo, RequestSender requestSender) {
        super(chat_id, requestSender, "sendPhoto");
        add("photo", photo);
    }

    /**
     * Required
     * @param chat_id Chat id
     * @param photo file id or url
     * @param requestSender request sender
     * @see BotContext#sendPhoto(Object, File)
     */
    public SendPhoto(Object chat_id, File photo, RequestSender requestSender) {
        super(chat_id, requestSender, "sendPhoto");
        add("photo", photo);
    }

    /**
     * Optional
     * @param caption Photo caption (may also be used when resending photos by file_id), 0-1024 characters after entities parsing
     * @return {@link SendPhoto}
     */
    public SendPhoto caption(String caption) {
        return add("caption", caption);
    }

    /**
     * Optional
     * @param caption_entities A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendPhoto}
     */
    public SendPhoto captionEntities(MessageEntity[] caption_entities) {
        return add("caption_entities", caption_entities);
    }

    /**
     * Optional
     * @param has_spoiler Pass True if the photo needs to be covered with a spoiler animation
     * @return {@link SendPhoto}
     */
    public SendPhoto hasSpoiler(boolean has_spoiler) {
        add("has_spoiler", has_spoiler);
        return this;
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return {@link SendPhoto}
     */
    public SendPhoto showCaptionAboveMedia(boolean show_caption_above_media){
        return add("show_caption_above_media", show_caption_above_media);
    }

}
