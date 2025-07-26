package io.github.natanimn.types.payments;

import io.github.natanimn.types.media_and_service.PhotoSize;
import io.github.natanimn.types.media_and_service.Video;

import java.util.List;
import java.util.Objects;

/**
 * This class describes paid media.
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 0.7
 */
public class PaidMedia {
    /**
     * Type of media
     */
    public String type;

    /**
     * Media width as defined by the sender
     */
    public Integer width;

    /**
     * Media height as defined by the sender
     */
    public Integer height;

    /**
     * Duration of the media in seconds as defined by the sender
     */
    public Integer duration;

    /**
     * The photo
     */
    public List<PhotoSize> photo;

    /**
     * The video
     */
    public Video video;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PaidMedia paidMedia = (PaidMedia) object;
        return Objects.equals(type, paidMedia.type) &&
                Objects.equals(width, paidMedia.width) &&
                Objects.equals(height, paidMedia.height) &&
                Objects.equals(duration, paidMedia.duration) &&
                Objects.equals(photo, paidMedia.photo) &&
                Objects.equals(video, paidMedia.video);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, width, height, duration, photo, video);
    }
}
