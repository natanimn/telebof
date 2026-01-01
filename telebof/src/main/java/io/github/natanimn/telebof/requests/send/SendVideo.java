package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import java.io.File;

/**
 * SendMessage class. Returns {@link Message} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SendVideo extends SendBuilder<SendVideo, Message> {

    /**
     * Required
     * @param chatId chat id
     * @param video file id or url
     * @param api api
     * @see BotContext#sendVideo(Object, String)
     */
    public SendVideo(Object chatId, String video, Api api) {
        super(chatId, api, "sendVideo");
        add("video", video);
    }

    /**
     * Required
     * @param chatId chat id
     * @param video file id or url
     * @param api api
     * @see BotContext#sendVideo(Object, File)
     */
    public SendVideo(Object chatId, File video, Api api) {
        super(chatId, api, "sendVideo");
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
     * @param captionEntities A list of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link SendVideo}
     */
    public SendVideo captionEntities(MessageEntity[] captionEntities) {
        return add("caption_entities", captionEntities);
    }

    /**
     * Optional
     * @param hasSpoiler Pass True if the video needs to be covered with a spoiler animation
     * @return {@link SendVideo}
     */
    public SendVideo hasSpoiler(boolean hasSpoiler) {
        return add("has_spoiler", hasSpoiler);
    }

    /**
     * Optional
     * @param supportsStreaming Pass True if the uploaded video is suitable for streaming
     * @return {@link SendVideo}
     */
    public SendVideo supportsStreaming(boolean supportsStreaming) {
        return add("supports_streaming", supportsStreaming);
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
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link SendVideo}
     */
    public SendVideo showCaptionAboveMedia(boolean showCaptionAboveMedia){
        return add("show_caption_above_media", showCaptionAboveMedia);
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
     * @param startTimestamp Start timestamp for the video in the message
     * @return {@link SendVideo}
     */
    public SendVideo startTimestamp(int startTimestamp){
        return add("start_timestamp", startTimestamp);
    }

}
