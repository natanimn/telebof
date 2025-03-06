package io.github.natanimn.types;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.requests.MediaContentType;

import java.io.File;
import java.util.List;

@SuppressWarnings("unchecked")
abstract /**
 * Natanim Negash
 *  3 March 2025
 */
public class InputMediaBuilder<T> implements InputMedia {
    protected String type, caption, parse_mode, media;
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

    public T parseMode(ParseMode parseMode) {
        this.parse_mode = parseMode != null? parseMode.name().toLowerCase() : null;
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

    @Override
    public boolean isFile() {
        return isFile;
    }

    @Override
    public InputFile getInputFile() {
        return inputFile;
    }

    @Override
    public boolean hasThumbnailFile() {
        return thumbnailIsFile;
    }

    @Override
    public InputFile getThumbnailFile() {
        return thumbnailFile;
    }
}
