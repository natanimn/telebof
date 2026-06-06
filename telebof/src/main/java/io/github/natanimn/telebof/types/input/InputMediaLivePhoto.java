package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;
import java.io.File;

/**
 * Represents a live photo to be sent.
 * @author Natanim
 * @since 2.0,0
 * @version 2.0.0
 */
public class InputMediaLivePhoto extends InputMediaBuilder<InputMediaPhoto> implements InputPollMedia, InputPollOptionMedia {
    private final String photo;

    @SerializedName("has_spoiler")
    private Boolean hasSpoiler;

    @SerializedName("show_caption_above_media")
    private Boolean showCaptionAboveMedia;

    /**
     * Required
     * @param media Video of the live photo to send.
     * @param photo The static photo to send.
     */
    public InputMediaLivePhoto(File media, File photo){
        super("live_photo", media);
        this.photo = "attach://"+photo.getName();
        addFiles(photo);
    }

    /**
     * Required
     * @param media Video of the live photo to send. Pass a file_id to send a file that exists on the Telegram servers
     * @param photo The static photo to send.
     */
    public InputMediaLivePhoto(String media, File photo){
        super("live_photo", media);
        this.photo = "attach://"+photo.getName();
        addFiles(photo);
    }

    /**
     * Required
     * @param media Video of the live photo to send.
     * @param photo	The static photo to send. Pass a file_id to send a file that exists on the Telegram servers
     */
    public InputMediaLivePhoto(File media, String photo){
        super("live_photo", media);
        this.photo = photo;
    }

    /**
     * Required
     * @param media Video of the live photo to send. Pass a file_id to send a file that exists on the Telegram servers
     * @param photo The static photo to send. Pass a file_id to send a file that exists on the Telegram servers
     */
    public InputMediaLivePhoto(String media, String photo){
        super("live_photo", media);
        this.photo = photo;
    }

    /**
     * Optional.
     * @param hasSpoiler Pass True if the live photo needs to be covered with a spoiler animation
     */
    public InputMediaLivePhoto setHasSpoiler(Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Optional. Pass True, if the caption must be shown above the message media
     * @return {@link InputMediaLivePhoto}
     */
    public InputMediaLivePhoto setShowCaptionAboveMedia(Boolean showCaptionAboveMedia){
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        return this;
    }

}
