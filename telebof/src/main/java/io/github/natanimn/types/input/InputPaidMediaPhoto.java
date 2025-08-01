package io.github.natanimn.types.input;

import io.github.natanimn.requests.MediaContentType;
import io.github.natanimn.types.media_and_service.InputFile;

import java.io.File;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
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
