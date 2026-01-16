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
public class InputMediaAudio extends InputMediaBuilder<InputMediaAudio>{
    private String thumbnail;
    private String performer;
    private String title;
    private Integer duration;

    @SerializedName("has_spoiler")
    private Boolean hasSpoiler;

    private final List<File> files = new ArrayList<>();

    /**
     * Required
     * @param media  File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended). pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputMediaAudio(String media) {
        super("audio", media);
    }

    /**
     * Required
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public InputMediaAudio(File media) {
        super("audio", media);
    }

    /**
     * Optional.
     * @param thumbnail Thumbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     */
    public InputMediaAudio setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * Optional.
     * @param performer Performer of the audio
     */
    public InputMediaAudio setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    /**
     * Optional.
     * @param title  Title of the audio
     */
    public InputMediaAudio setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional.
     * @param duration Duration of the audio in seconds
     */
    public InputMediaAudio setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional.
     * @param hasSpoiler Pass True if the audio needs to be covered with a spoiler animation
     */
    public InputMediaAudio setHasSpoiler(Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
        return this;
    }
}