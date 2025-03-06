package io.github.natanimn.types;

import io.github.natanimn.requests.MediaContentType;

import java.io.File;
import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InputMediaPhoto extends InputMediaBuilder<InputMediaPhoto> implements Serializable {
    private Boolean has_spoiler;

    public InputMediaPhoto(String media) {
        super("photo", media);
    }

    public InputMediaPhoto(File media) {
        super("photo", media, MediaContentType.PHOTO);
    }

    public InputMediaPhoto hasSpoiler(boolean hasSpoiler) {
        this.has_spoiler = hasSpoiler;
        return this;
    }
}
