package io.github.natanimn.types;

import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class PaidMedia {
    public String type;
    public Integer width, height, duration;
    public List<PhotoSize> photo;
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
