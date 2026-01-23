package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Input media builder class that contains default parameters
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
@SuppressWarnings("unchecked")
abstract public class InputMediaBuilder<T> implements InputMedia{
    protected String type, caption, media;

    @SerializedName("parse_mode")
    protected ParseMode  parseMode;

    @SerializedName("caption_entities")
    protected List<MessageEntity> captionEntities;

    transient List<File> files = new ArrayList<>();
    transient Boolean hasFile;

    T thisT = (T)this;

    /**
     * Initializer
     * @param type type of media
     * @param media media
     */
    public InputMediaBuilder(String type, String media) {
        this.type = type;
        this.media = media;
        setHasFile(false);
    }

    /**
     * Initializer
     * @param type type
     * @param media media
     */
    public InputMediaBuilder(String type, File media) {
        this.type = type;
        this.media = "attach://"+media.getName();
        setHasFile(true);
        addFiles(media);
    }

    /**
     * Optional
     * @param caption Caption of the media to be sent, 0-1024 characters after entities parsing
     * @return {@link T}
     */
    public T caption(String caption) {
        this.caption = caption;
        return thisT;
    }

    /**
     * Optional
     * @param parseMode Mode for parsing entities in the media {@link #caption}
     * @return {@link T}
     */
    public T parseMode(ParseMode parseMode) {
        this.parseMode = parseMode;
        return thisT;
    }

    /**
     * Optional
     * @param captionEntities List of special entities that appear in the caption, which can be specified instead of parse_mode
     * @return {@link T}
     */
    public T captionEntities(MessageEntity[] captionEntities) {
        this.captionEntities = List.of(captionEntities);
        return thisT;
    }

    /**
     * For internal use only
     * @param hasFile has file
     */
    protected void setHasFile(boolean hasFile){
        this.hasFile = hasFile;
    }

    /**
     * For internal use only
     * @param file file
     */
    protected void addFiles(File file){
        files.add(file);
    }

    /**
     * For internal use only
     * @return List of File
     */
    @Override
    public List<File> getFiles() {
        return files;
    }

    /**
     * For internal use only
     * @return boolean
     */
    @Override
    public boolean hasFile() {
        return !files.isEmpty();
    }
}
