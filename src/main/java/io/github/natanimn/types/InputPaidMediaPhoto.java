package io.github.natanimn.types;

import io.github.natanimn.requests.MediaContentType;

import java.io.File;
import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InputPaidMediaPhoto implements InputPaidMedia {
    private String type;
    private String media;
    private transient boolean isFile;
    private transient InputFile inputFile;

    public InputPaidMediaPhoto(String media){
        this.type = "photo";
        this.media = media;
        this.isFile = false;
    }

    public InputPaidMediaPhoto(File media){
        this.type = "photo";
        this.media = "attach://" + media.getName();
        this.isFile = true;
        this.inputFile = new InputFile(media, MediaContentType.PHOTO);
    }

    @Override
    public boolean hasThumbnailFile() {
        return false;
    }

    @Override
    public boolean isFile() {
        return isFile;
    }

    @Override
    public InputFile getInputFile() {
        return inputFile;
    }

    @Override
    public InputFile getThumbnailFile() {
        return null;
    }
}
