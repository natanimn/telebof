package io.github.natanimn.types.input;

import io.github.natanimn.requests.service.MediaContentType;

import java.io.File;

/**
 * Represents an animation file (GIF or H.264/MPEG-4 AVC video without sound) to be sent.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class InputMediaAnimation extends InputMediaBuilder<InputMediaAnimation> {
    private String thumbnail;
    private Integer width, height, duration;
    private Boolean has_spoiler;

    /**
     * Required
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL for Telegram to get a file from the Internet
     */
    public InputMediaAnimation(String media) {
        super("animation", media);
    }

    /**
     * Required
     * @param media File to send.
     */
    public InputMediaAnimation(File media) {
        super("animation", media, MediaContentType.GIF);
    }

    /**
     * Optional
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size. A thumbnail's width and height should not exceed 320. Ignored if the file is not uploaded using multipart/form-data.
     *                  Thumbnails can't be reused and can be only uploaded as a new file
     * @return {@link InputMediaAnimation}
     */
    public InputMediaAnimation thumbnail(File thumbnail) {
        this.thumbnail = "attach://"+thumbnail.getName();
        setHasFile(true);
        addFiles(thumbnail);
        return this;
    }

    /**
     * Optional
     * @param width Animation width
     * @return {@link InputMediaAnimation}
     */
    public InputMediaAnimation width(int width) {
        this.width = width;
        return this;
    }

    /**
     * Optional
     * @param height  Animation height
     * @return {@link InputMediaAnimation}
     */
    public InputMediaAnimation height(int height){
        this.height = height;
        return this;
    }

    /**
     * Optional
     * @param duration Animation duration in seconds
     * @return {@link InputMediaAnimation}
     */
    public InputMediaAnimation duration(int duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional
     * @param has_spoiler Pass True if the animation needs to be covered with a spoiler animation
     * @return {@link InputMediaAnimation}
     */
    public InputMediaAnimation hasSpoiler(boolean has_spoiler){
        this.has_spoiler = has_spoiler;
        return this;
    }

}
