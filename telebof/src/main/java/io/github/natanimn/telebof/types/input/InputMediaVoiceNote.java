package io.github.natanimn.telebof.types.input;

import java.io.File;

/**
 * Represents a voice message file to be sent.
 * @author Natanim
 * @since 2.2
 */
public class InputMediaVoiceNote extends InputMediaBuilder<InputMediaVoiceNote>{

    private Integer duration;

    /**
     * Required
     * @param media  File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended). pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputMediaVoiceNote(String media) {
        super("voice_note", media);
    }

    /**
     * Required
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public InputMediaVoiceNote(File media) {
        super("voice_note", media);
    }

    /**
     * Optional
     * @param duration Duration of the voice message in seconds
     * @return {@link InputMediaVoiceNote}
     */
    public InputMediaVoiceNote setDuration(Integer duration){
        this.duration = duration;
        return this;
    }
}
