package io.github.natanimn.types.input;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.requests.MediaContentType;
import io.github.natanimn.types.media_and_service.InputFile;
import io.github.natanimn.types.media_and_service.MessageEntity;

import java.io.File;
import java.util.List;

/**
 * Input media builder class
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
@SuppressWarnings("unchecked")
abstract public class InputMediaBuilder<T>{
    protected String type, caption, media;
    protected ParseMode  parse_mode;
    protected List<MessageEntity> caption_entities;
    transient private InputFile inputFile, thumbnailFile;
    transient private boolean isFile, thumbnailIsFile;
    T thisT = (T)this;

    public InputMediaBuilder(String type, String media) {
        this.type = type;
        this.media = media;
        setFile(false);
    }

    public InputMediaBuilder(String type, File media, String contentType) {
        this.inputFile = new InputFile(media, contentType);
        this.type = type;
        this.media = ("attach://" + media.getName());
        setFile(true);
    }

    public T caption(String caption) {
        this.caption = caption;
        return thisT;
    }

    public T parseMode(ParseMode parse_mode) {
        this.parse_mode = parse_mode;
        return thisT;
    }

    public T captionEntities(MessageEntity[] captionEntities) {
        this.caption_entities = List.of(captionEntities);
        return thisT;
    }

    protected void setThumbnailFile(File file){
        thumbnailFile = new InputFile(file, MediaContentType.PHOTO);
        thumbnailIsFile = true;
    }

    public void setFile(boolean file) {
        isFile = file;
    }

    public boolean isFile() {
        return isFile;
    }

    public InputFile getInputFile() {
        return inputFile;
    }

    public boolean hasThumbnailFile() {
        return thumbnailIsFile;
    }

    public InputFile getThumbnailFile() {
        return thumbnailFile;
    }
}
