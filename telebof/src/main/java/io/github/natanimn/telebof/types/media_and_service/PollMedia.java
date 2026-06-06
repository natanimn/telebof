package io.github.natanimn.telebof.types.media_and_service;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
 * At most one of the optional fields can be present in any given object.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class PollMedia {
    /**
     * Optional. Media is an animation, information about the animation
     */
    private Animation animation;

    /**
     * Optional. Media is an audio file, information about the file; currently, can't be received in a poll option
     */
    private Audio audio;

    /**
     * Optional. Media is a general file, information about the file; currently, can't be received in a poll option
     */
    private Document document;

    @SerializedName("live_photo")
    private LivePhoto livePhoto;

    /**
     * Optional. Media is a shared location, information about the location
     */
    private Location location;

    /**
     * Optional. Media is a photo, available sizes of the photo
     */
    private List<PhotoSize> photo;

    /**
     * Optional. Media is a sticker, information about the sticker; currently, for poll options only
     */
    private Sticker sticker;

    /**
     * Optional. Media is a venue, information about the venue
     */
    private Venue venue;

    /**
     * Optional. Media is a video, information about the video
     */
    private Video video;


    public Animation getAnimation() {
        return animation;
    }

    public Audio getAudio() {
        return audio;
    }

    public Document getDocument() {
        return document;
    }

    public LivePhoto getLivePhoto() {
        return livePhoto;
    }

    public Location getLocation() {
        return location;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Venue getVenue() {
        return venue;
    }

    public Video getVideo() {
        return video;
    }
}
