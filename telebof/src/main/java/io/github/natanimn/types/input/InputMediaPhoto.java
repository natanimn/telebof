package io.github.natanimn.types.input;

import io.github.natanimn.requests.service.MediaContentType;

import java.io.File;
import java.io.Serializable;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class InputMediaPhoto extends InputMediaBuilder<InputMediaPhoto> {
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
