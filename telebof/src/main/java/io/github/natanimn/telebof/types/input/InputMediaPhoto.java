package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import java.io.File;

/**
 * Represents a photo to be sent.
 * @author Natanim
 * @since 3 March 2025
 * @version 2.0.0
 */
public class InputMediaPhoto extends InputMediaBuilder<InputMediaPhoto> implements InputPollMedia, InputPollOptionMedia{
    @SerializedName("has_spoiler")
    private Boolean hasSpoiler;

    @SerializedName("show_caption_above_media")
    private Boolean showCaptionAboveMedia;

    /**
     * Required
     * @param media File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), or pass an HTTP URL for Telegram to get a file from the Internet.
     */
    public InputMediaPhoto(String media) {
        super("photo", media);
    }

    /**
     * Required
     * @param media File to send. Pass an object of File to upload from your local machine.
     */
    public InputMediaPhoto(File media) {
        super("photo", media);
    }

    /**
     * Optional.
     * @param hasSpoiler Pass True if the photo needs to be covered with a spoiler animation
     */
    public InputMediaPhoto setHasSpoiler(Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Optional. Pass True, if the caption must be shown above the message media
     * @return {@link InputMediaPhoto}
     */
    public InputMediaPhoto setShowCaptionAboveMedia(Boolean showCaptionAboveMedia){
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        return this;
    }
}