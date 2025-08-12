package io.github.natanimn.types.input;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.requests.service.MediaContentType;
import io.github.natanimn.types.media_and_service.InputFile;
import io.github.natanimn.types.media_and_service.MessageEntity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Input media builder class
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
@SuppressWarnings("unchecked")
abstract public class InputMediaBuilder<T> implements InputMedia{
    protected String type, caption, media;
    protected ParseMode  parse_mode;
    protected List<MessageEntity> caption_entities;
    transient List<File> files = new ArrayList<>();
    transient Boolean hasFile;

    T thisT = (T)this;

    public InputMediaBuilder(String type, String media) {
        this.type = type;
        this.media = media;
        setHasFile(false);
    }

    public InputMediaBuilder(String type, File media, String contentType) {
        this.type = type;
        this.media = "attach://"+media.getName();
        setHasFile(true);
        addFiles(media);
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

    protected void setHasFile(boolean hasFile){
        this.hasFile = hasFile;
    }

    protected void addFiles(File file){
        files.add(file);
    }

    @Override
    public List<File> getFiles() {
        return files;
    }

    @Override
    public boolean hasFile() {
        return hasFile;
    }
}
