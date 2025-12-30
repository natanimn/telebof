package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import java.io.File;

/**
 * SendPhoto class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SendPhoto extends SendBuilder<SendPhoto, Message> {

    /**
     * Required
     * @param chatId Chat id
     * @param photo file id or url
     * @param api api
     * @see BotContext#sendPhoto(Object, String)
     */
    public SendPhoto(Object chatId, String photo, Api api) {
        super(chatId, api, "sendPhoto");
        add("photo", photo);
    }

    /**
     * Required
     * @param chatId Chat id
     * @param photo file id or url
     * @param api api
     * @see BotContext#sendPhoto(Object, File)
     */
    public SendPhoto(Object chatId, File photo, Api api) {
        super(chatId, api, "sendPhoto");
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
     * @param captionEntities A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendPhoto}
     */
    public SendPhoto captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
    }

    /**
     * Optional
     * @param hasSpoiler Pass True if the photo needs to be covered with a spoiler animation
     * @return {@link SendPhoto}
     */
    public SendPhoto hasSpoiler(boolean hasSpoiler) {
        add("has_spoiler", hasSpoiler);
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link SendPhoto}
     */
    public SendPhoto showCaptionAboveMedia(boolean showCaptionAboveMedia){
        return add("show_caption_above_media", showCaptionAboveMedia);
    }

}
