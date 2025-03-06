package io.github.natanimn.types;

import io.github.natanimn.requests.MediaContentType;

import java.io.File;
import java.io.Serializable;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InputMediaDocument extends InputMediaBuilder<InputMediaDocument> implements Serializable {
    private String thumbnail;
    private Boolean disable_content_type_detection;

    public InputMediaDocument(String media) {
        super("document", media);
    }

    public InputMediaDocument(File media) {
        super("document", media, MediaContentType.DEFAULT);
    }

    public InputMediaDocument thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public InputMediaDocument thumbnail(File thumbnail) {
        this.thumbnail = "attach://"+thumbnail.getName();
        setThumbnailFile(thumbnail);
        return this;
    }

    public InputMediaDocument disableContentTypeDetection(boolean disableContentTypeDetection) {
        this.disable_content_type_detection = disableContentTypeDetection;
        return this;
    }

}
