package io.github.natanimn.types.input;

import io.github.natanimn.requests.service.MediaContentType;

import java.io.File;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class InputMediaVideo extends InputMediaBuilder<InputMediaVideo> {
    private String thumbnail;
    private Integer duration;
    private Integer width;
    private Integer height;
    private Boolean has_spoiler;
    private Boolean supports_streaming;
    private String cover;
    private Integer start_timestamp;

    /**
     * Required
     * @param media File to send.
     */
    public InputMediaVideo(String media) {
        super("video", media);
    }

    /**
     * Required
     * @param media File to send
     */
    public InputMediaVideo(File media) {
        super("video", media, MediaContentType.VIDEO);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320
     * @return {@link InputMediaVideo}
     */
    public InputMediaVideo thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320
     * @return {@link InputMediaVideo}
     */
    public InputMediaVideo thumbnail(File thumbnail) {
        this.thumbnail = "attach://"+thumbnail.getName();
        setHasFile(true);
        addFiles(thumbnail);
        return this;
    }

    /**
     * Optional
     * @param width video width
     * @return {@link InputMediaVideo}
     */
    public InputMediaVideo width(int width) {
        this.width = width;
        return this;
    }

    /**
     * Optional
     * @param height Video height
     * @return {@link InputMediaVideo}
     */
    public InputMediaVideo height(int height) {
        this.height = height;
        return this;
    }

    /**
     * Optional
     * @param duration Video duration in seconds
     * @return {@link InputMediaVideo}
     */
    public InputMediaVideo duration(int duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional
     * @param supports_streaming  Pass True if the uploaded video is suitable for streaming
     * @return {@link InputMediaVideo}
     */
    public InputMediaVideo supportsStreaming(boolean supports_streaming) {
        this.supports_streaming = supports_streaming;
        return this;
    }

    /**
     * Optional
     * @param hasSpoiler Pass True if the video needs to be covered with a spoiler animation
     * @return {@link InputMediaVideo}
     */
    public InputMediaVideo hasSpoiler(boolean hasSpoiler) {
        this.has_spoiler = hasSpoiler;
        return this;
    }

    /**
     * Optional
     * @param cover Cover for the video in the message.
     *              Pass a file_id to send a file that exists on the Telegram servers (recommended)
     * @return {@link InputMediaVideo}
     */
    public InputMediaVideo cover(String cover){
        this.cover = cover;
        return this;
    }

    /**
     * Optional
     * @param cover Cover for the video in the message.
     * @return {@link InputMediaVideo}
     */
    public InputMediaVideo cover(File cover){
        this.cover = "attach://"+cover.getName();
        setHasFile(true);
        addFiles(cover);
        return this;
    }

    /**
     * Optional
     * @param start_timestamp Start timestamp for the video in the message
     * @return {@link  InputMediaVideo}
     */
    public InputMediaVideo starTimestamp(int start_timestamp){
        this.start_timestamp = start_timestamp;
        return this;
    }
}
