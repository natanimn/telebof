package io.github.natanimn.telebof.types.input;


import java.io.File;

/**
 * Pass True if the photo needs to be covered with a spoiler animation
 * @author Natanim
 * @since 3 March 2025
 * @version 0.94
 */
public class InputMediaPhoto extends InputMediaBuilder<InputMediaPhoto> {
    private Boolean has_spoiler;

    /**
     * Required
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or
     *             pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputMediaPhoto(String media) {
        super("photo", media);
    }

    /**
     * Required
     * @param media File to send. Pass an object of {@link File} to upload from your local machine.
     */
    public InputMediaPhoto(File media) {
        super("photo", media);
    }

    /**
     * Optional
     * @param has_spoiler Pass True if the photo needs to be covered with a spoiler animation
     * @return {@link InputMediaPhoto}
     */
    public InputMediaPhoto hasSpoiler(boolean has_spoiler) {
        this.has_spoiler = has_spoiler;
        return this;
    }
}
