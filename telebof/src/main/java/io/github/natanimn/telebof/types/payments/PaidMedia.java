package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.types.media_and_service.PhotoSize;
import io.github.natanimn.telebof.types.media_and_service.Video;
import java.util.List;

/**
 * This class describes paid media.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class PaidMedia {
    /**
     * Type of media
     */
    private String type;

    /**
     * Media width as defined by the sender
     */
    private Integer width;

    /**
     * Media height as defined by the sender
     */
    private Integer height;

    /**
     * Duration of the media in seconds as defined by the sender
     */
    private Integer duration;

    /**
     * The photo
     */
    private List<PhotoSize> photo;

    /**
     * The video
     */
    private Video video;

    public String getType() {
        return type;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getDuration() {
        return duration;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public Video getVideo() {
        return video;
    }
}