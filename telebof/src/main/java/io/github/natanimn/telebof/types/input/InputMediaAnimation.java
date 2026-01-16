package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an animation file (GIF or H.264/MPEG-4 AVC video without sound) to be sent.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputMediaAnimation extends InputMediaBuilder<InputMediaAnimation> {

    private String thumbnail;
    private Integer width;
    private Integer height;
    private Integer duration;

    @SerializedName("has_spoiler")
    private Boolean hasSpoiler;

    /**
     * Constructor for InputMediaAnimation with String media
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL for Telegram to get a file from the Internet
     */
    public InputMediaAnimation(String media) {
        super("animation", media);
        this.media = media;
    }

    /**
     * Constructor for InputMediaAnimation with File media
     * @param media File to send.
     */
    public InputMediaAnimation(File media) {
        super("animation", media);
    }

    /**
     * @param hasSpoiler Pass True if the animation needs to be covered with a spoiler animation
     * @return this
     */
    public InputMediaAnimation setHasSpoiler(Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
        return this;
    }

    /**
     * @param duration Animation duration in seconds
     * @return this
     */
    public InputMediaAnimation setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * @param height Animation height
     * @return this
     */
    public InputMediaAnimation setHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * @param width Animation width
     * @return this
     */
    public InputMediaAnimation setWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     * @return this
     */
    public InputMediaAnimation setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
}