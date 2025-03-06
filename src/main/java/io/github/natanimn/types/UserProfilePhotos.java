package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class UserProfilePhotos implements Serializable {
    public Integer total_count;
    public List<PhotoSize> photos;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserProfilePhotos that = (UserProfilePhotos) object;
        return Objects.equals(total_count, that.total_count) && Objects.equals(photos, that.photos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total_count, photos);
    }
}
