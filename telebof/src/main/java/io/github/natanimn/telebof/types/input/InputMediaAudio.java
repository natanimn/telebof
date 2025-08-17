package io.github.natanimn.telebof.types.input;

import java.io.File;
import java.io.Serializable;

/**
 * Represents an audio file to be treated as music to be sent.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InputMediaAudio extends InputMediaBuilder<InputMediaAudio> implements Serializable {
    private String thumbnail, performer, title;
    private Integer duration;
    private Boolean has_spoiler;

    /**
     * Required
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or
     *              pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputMediaAudio(String media) {
        super("audio", media);
    }

    /**
     * Required
     * @param media File to send. Pass an object of {@link File} to upload from your local machine.
     */
    public InputMediaAudio(File media) {
        super("audio", media);
    }

    /**
     * Optional
     * @param thumbnail humbnail of the file sent; can be ignored if thumbnail generation for the file is supported server-side.
     *                  The thumbnail should be in JPEG format and less than 200 kB in size.
     *                  A thumbnail's width and height should not exceed 320.
     * @return {@link InputMediaAudio}
     */
    public InputMediaAudio thumbnail(File thumbnail) {
        this.thumbnail = "attach://"+thumbnail.getName();
        setHasFile(true);
        addFiles(thumbnail);
        return this;
    }

    /**
     * Optional
     * @param performer Performer of the audio
     * @return {@link InputMediaAudio}
     */
    public InputMediaAudio performer(String performer) {
        this.performer = performer;
        return this;
    }

    /**
     * Optional
     * @param title Title of the audio
     * @return {@link InputMediaAudio}
     */
    public InputMediaAudio title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional
     * @param duration Duration of the audio in seconds
     * @return {@link InputMediaAudio}
     */
    public InputMediaAudio duration(int duration) {
        this.duration = duration;
        return this;
    }
}
