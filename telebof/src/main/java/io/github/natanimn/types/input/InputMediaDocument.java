package io.github.natanimn.types.input;

import io.github.natanimn.requests.MediaContentType;

import java.io.File;
import java.io.Serializable;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
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
