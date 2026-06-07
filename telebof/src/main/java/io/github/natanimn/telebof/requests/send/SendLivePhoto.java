package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.requests.Api;

import java.io.File;

/**
 * SendLivePhoto class. Return {@link Message} on success.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class SendLivePhoto extends SendBuilder<SendLivePhoto, Message>{

    public SendLivePhoto(Object chatId, String livePhoto, String photo, Api api){
        super(chatId, api, "sendLivePhoto");
        add("live_photo", livePhoto);
        add("photo", photo);
    }

    public SendLivePhoto(Object chatId, String livePhoto, File photo, Api api){
        super(chatId, api, "sendLivePhoto");
        add("live_photo", livePhoto);
        add("photo", photo);
    }

    public SendLivePhoto(Object chatId, File livePhoto, String photo, Api api){
        super(chatId, api, "sendLivePhoto");
        add("live_photo", livePhoto);
        add("photo", photo);
    }

    public SendLivePhoto(Object chatId, File livePhoto, File photo, Api api){
        super(chatId, api, "sendLivePhoto");
        add("live_photo", livePhoto);
        add("photo", photo);
    }

    /**
     * Optional
     * @param caption Video caption (may also be used when resending videos by file_id), 0-1024 characters after entities parsing
     * @return {@link SendLivePhoto}
     */
    public SendLivePhoto caption(String caption) {
        return add("caption", caption);
    }

    /**
     * Optional
     * @param captionEntities A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendLivePhoto}
     */
    public SendLivePhoto captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
    }

    /**
     * Optional
     * @param hasSpoiler Pass True if the photo needs to be covered with a spoiler animation
     * @return {@link SendLivePhoto}
     */
    public SendLivePhoto hasSpoiler(boolean hasSpoiler) {
        add("has_spoiler", hasSpoiler);
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link SendLivePhoto}
     */
    public SendLivePhoto showCaptionAboveMedia(boolean showCaptionAboveMedia){
        return add("show_caption_above_media", showCaptionAboveMedia);
    }
}
