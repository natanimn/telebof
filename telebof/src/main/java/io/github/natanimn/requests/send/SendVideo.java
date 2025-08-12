package io.github.natanimn.requests.send;

import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.updates.Message;
import io.github.natanimn.types.media_and_service.MessageEntity;
import java.io.File;
import java.util.List;

/**
 * SendMessage class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class SendVideo extends SendBuilder<SendVideo, Message> {

    /**
     * Required
     * @param chat_id chat id
     * @param video file id or url
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#sendVideo(Object, String)}
     */
    public SendVideo(Object chat_id, String video, RequestSender requestSender) {
        super(chat_id, requestSender, "sendVideo");
        add("video", video);
    }

    /**
     * Required
     * @param chat_id chat id
     * @param video file id or url
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#sendVideo(Object, File)}
     */
    public SendVideo(Object chat_id, File video, RequestSender requestSender) {
        super(chat_id, requestSender, "sendVideo");
        add("video", video);
    }

    /**
     * Optional
     * @param caption Video caption (may also be used when resending videos by file_id), 0-1024 characters after entities parsing
     * @return {@link SendVideo}
     */
    public SendVideo caption(String caption) {
        return add("caption", caption);
    }

    /**
     * Optional
     * @param caption_entities A list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendVideo}
     */
    public SendVideo captionEntities(MessageEntity[] caption_entities) {
        return add("caption_entities", List.of(caption_entities));
    }

    /**
     * Optional
     * @param has_spoiler Pass True if the video needs to be covered with a spoiler animation
     * @return {@link SendVideo}
     */
    public SendVideo hasSpoiler(boolean has_spoiler) {
        return add("has_spoiler", has_spoiler);
    }

    /**
     * Optional
     * @param supports_streaming Pass True if the uploaded video is suitable for streaming
     * @return {@link SendVideo}
     */
    public SendVideo supportsStreaming(boolean supports_streaming) {
        return add("supports_streaming", supports_streaming);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320.
     *                  Thumbnails can't be reused and can be only uploaded as a new file.
     * @return {@link SendVideo}
     */
    public SendVideo thumbnail(String thumbnail) {
        return add("thumbnail", thumbnail);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320.
     *                  Thumbnails can't be reused and can be only uploaded as a new file.
     * @return {@link SendVideo}
     */
    public SendVideo thumbnail(File thumbnail) {
        return add("thumbnail", thumbnail);
    }

    /**
     * Optional
     * @param width Video width
     * @return {@link SendVideo}
     */
    public SendVideo width(int width) {
        return add("width", width);
    }

    /**
     * Optional
     * @param height Video height
     * @return {@link SendVideo}
     */
    public SendVideo height(int height) {
        return add("height", height);
    }

    /**
     * Optional
     * @param duration Duration of sent video in seconds
     * @return {@link SendVideo}
     */
    public SendVideo duration(int duration) {
        return add("duration", duration);
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return {@link SendVideo}
     */
    public SendVideo showCaptionAboveMedia(boolean show_caption_above_media){
        return add("show_caption_above_media", show_caption_above_media);
    }

    /**
     * Optional
     * @param cover Cover for the video in the message.
     * @return {@link SendVideo}
     */
    public SendVideo cover(String cover){
        return add("cover", cover);
    }

    /**
     * Optional
     * @param cover Cover for the video in the message.
     * @return {@link SendVideo}
     */
    public SendVideo cover(File cover){
        return add("cover", cover);
    }

    /**
     * Optional
     * @param start_timestamp Start timestamp for the video in the message
     * @return {@link SendVideo}
     */
    public SendVideo startTimestamp(int start_timestamp){
        return add("start_timestamp", start_timestamp);
    }

}
