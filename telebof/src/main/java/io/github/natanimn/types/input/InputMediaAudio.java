package io.github.natanimn.types.input;

import io.github.natanimn.requests.MediaContentType;

import java.io.File;
import java.io.Serializable;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InputMediaAudio extends InputMediaBuilder<InputMediaAudio> implements Serializable {
    private String thumbnail, performer, title;
    private Integer duration;
    private Boolean has_spoiler;

    public InputMediaAudio(String media) {
        super("audio", media);
    }

    public InputMediaAudio(File media) {
        super("audio", media, MediaContentType.AUDIO);
    }

    public InputMediaAudio thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public InputMediaAudio thumbnail(File thumbnail) {
        this.thumbnail = "attach://"+thumbnail.getName();
        setThumbnailFile(thumbnail);
        return this;
    }
    public InputMediaAudio performer(String performer) {
        this.performer = performer;
        return this;
    }

    public InputMediaAudio title(String title) {
        this.title = title;
        return this;
    }

    public InputMediaAudio duration(int duration) {
        this.duration = duration;
        return this;
    }

    public InputMediaAudio hasSpoiler(boolean hasSpoiler) {
        this.has_spoiler = hasSpoiler;
        return this;
    }
}
