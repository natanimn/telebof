package io.github.natanimn.requests;

import io.github.natanimn.types.updates.Message;
import io.github.natanimn.types.media_and_service.MessageEntity;
import java.io.File;
import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SendVideo extends DefaultParameters<SendVideo, Message> {
    public SendVideo(Object chatId, String video, RequestSender requestSender) {
        super(chatId, requestSender, "sendVideo");
        add("video", video);
    }

    public SendVideo(Object chatId, File video, RequestSender requestSender) {
        super(chatId, requestSender, "sendVideo");
        add("video", video);
        setContentType(MediaContentType.VIDEO);
    }

    public SendVideo caption(String cap) {
        return add("caption", cap);
    }

    public SendVideo captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", List.of(captionEntities));
    }

    public SendVideo hasSpoiler(boolean hasSpoiler) {
        return add("has_spoiler", hasSpoiler);
    }

    public SendVideo supportsStreaming(boolean supportsStreaming) {
        return add("supports_streaming", supportsStreaming);
    }

    public SendVideo thumbnail(String thumbnail) {
        return add("thumbnail", thumbnail);
    }

    public SendVideo thumbnail(File thumbnail) {
        setContentType(MediaContentType.DEFAULT);
        return add("thumbnail", thumbnail);
    }

    public SendVideo width(int width) {
        return add("width", width);
    }

    public SendVideo height(int height) {
        return add("height", height);
    }

    public SendVideo duration(int duration) {
        return add("duration", duration);
    }

    public SendVideo showCaptionAboveMedia(boolean show_caption_above_media){
        return add("show_caption_above_media", show_caption_above_media);
    }

}
