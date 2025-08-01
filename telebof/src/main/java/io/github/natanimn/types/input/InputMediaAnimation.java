package io.github.natanimn.types.input;

import io.github.natanimn.requests.MediaContentType;

import java.io.File;
import java.io.Serializable;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InputMediaAnimation extends InputMediaBuilder<InputMediaAnimation> implements InputMedia {
    private String thumbnail;
    private Integer width, height, duration;
    private Boolean has_spoiler;


    public InputMediaAnimation(String media) {
        super("animation", media);
    }

    public InputMediaAnimation(File media) {
        super("animation", media, MediaContentType.GIF);
    }

    public InputMediaAnimation thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public InputMediaAnimation thumbnail(File thumbnail) {
        this.thumbnail = "attach://"+thumbnail.getName();
        setThumbnailFile(thumbnail);
        return this;
    }

    public InputMediaAnimation width(int width) {
        this.width = width;
        return this;
    }

    public InputMediaAnimation height(int height){
        this.height = height;
        return this;
    }

    public InputMediaAnimation duration(int duration) {
        this.duration = duration;
        return this;
    }

    public InputMediaAnimation hasSpoiler(boolean hasSpoiler){
        this.has_spoiler = hasSpoiler;
        return this;
    }

}
