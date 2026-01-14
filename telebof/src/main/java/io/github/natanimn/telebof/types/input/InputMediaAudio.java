package io.github.natanimn.telebof.types.input;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an audio file to be treated as music to be sent.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputMediaAudio implements InputMediaInt{
    private final String type = "audio";
    private String media;
    private String thumbnail;
    private String performer;
    private String title;
    private Integer duration;

    @SerializedName("has_spoiler")
    private Boolean hasSpoiler;

    private String caption;

    @SerializedName("parse_mode")
    private ParseMode parseMode;

    @SerializedName("caption_entities")
    private List<MessageEntity> captionEntities;

    private final List<File> files = new ArrayList<>();

    /**
     * Required
     * @param media  File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended). pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputMediaAudio(String media) {
        this.media = media;
    }

    /**
     * Required
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public InputMediaAudio(File media) {
        this.media = "attach://" + media.getName();
        this.files.add(media);
    }

    /**
     * Optional.
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * Optional.
     * @param performer Performer of the audio
     */
    public void setPerformer(String performer) {
        this.performer = performer;
    }

    /**
     * Optional.
     * @param title  Title of the audio
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Optional.
     * @param duration Duration of the audio in seconds
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Optional.
     * @param hasSpoiler Pass True if the audio needs to be covered with a spoiler animation
     */
    public void setHasSpoiler(Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
    }

    /**
     * Optional.
     * @param caption Caption of the audio to be sent, 0-1024 characters after entities parsing
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * Optional.
     * @param parseMode Mode for parsing entities in the audio caption
     */
    public void setParseMode(ParseMode parseMode) {
        this.parseMode = parseMode;
    }

    /**
     * Optional.
     * @param captionEntities List of special entities that appear in the caption
     */
    public void setCaptionEntities(MessageEntity[] captionEntities) {
        this.captionEntities = List.of(captionEntities);
    }

    @Override
    public boolean hasFile() {
        return !files.isEmpty();
    }

    @Override
    public List<File> getFiles() {
        return files;
    }
}