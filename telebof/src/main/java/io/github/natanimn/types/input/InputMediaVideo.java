package io.github.natanimn.types.input;

import io.github.natanimn.requests.MediaContentType;

import java.io.File;
import java.io.Serializable;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InputMediaVideo extends InputMediaBuilder<InputMediaVideo> implements  Serializable {
    private String thumbnail;
    private Integer duration, width, height;
    private Boolean has_spoiler, supports_streaming;

    public InputMediaVideo(String media) {
        super("video", media);
    }

    public InputMediaVideo(File media) {
        super("video", media, MediaContentType.VIDEO);
    }

    public InputMediaVideo thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public InputMediaVideo thumbnail(File thumbnail) {
        this.thumbnail = "attach://"+thumbnail.getName();
        setThumbnailFile(thumbnail);
        return this;
    }

    public InputMediaVideo width(int width) {
        this.width = width;
        return this;
    }

    public InputMediaVideo height(int height) {
        this.height = height;
        return this;
    }

    public InputMediaVideo duration(int duration) {
        this.duration = duration;
        return this;
    }

    public InputMediaVideo supportsStreaming(boolean supportsStreaming) {
        this.supports_streaming = supportsStreaming;
        return this;
    }

    public InputMediaVideo hasSpoiler(boolean hasSpoiler) {
        this.has_spoiler = hasSpoiler;
        return this;
    }

}
