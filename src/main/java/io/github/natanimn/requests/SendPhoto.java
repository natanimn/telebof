package io.github.natanimn.requests;

import io.github.natanimn.types.Message;
import io.github.natanimn.types.MessageEntity;
import java.io.File;


/**
 * Natanim Negash
 *  3 March 2025
 */
public class SendPhoto extends DefaultParameters<SendPhoto, Message>{

    public SendPhoto(Object chatId, String photo, RequestSender requestSender) {
        super(chatId, requestSender, "sendPhoto");
        add("photo", photo);
    }

    public SendPhoto(Object chatId, File photo, RequestSender requestSender) {
        super(chatId, requestSender, "sendPhoto");
        add("photo", photo);
        setContentType(MediaContentType.PHOTO);
    }

    public SendPhoto caption(String caption) {
        return add("caption", caption);
    }

    public SendPhoto captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
    }

    public SendPhoto hasSpoiler(boolean hasSpoiler) {
        add("has_spoiler", hasSpoiler);
        return this;
    }

    public SendPhoto showCaptionAboveMedia(boolean show_caption_above_media){
        return add("show_caption_above_media", show_caption_above_media);
    }

}
