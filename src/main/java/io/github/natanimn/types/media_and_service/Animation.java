package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 /**
 * Natanim Negash
 *  3 March 2025
 */
public class Animation implements Serializable {
    public String file_id, file_unique_id, file_name, mime_type;
    public Integer width, height, duration;
    public Integer file_size;
    public PhotoSize thumbnail;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Animation animation = (Animation) object;
        return Objects.equals(file_id, animation.file_id) && Objects.equals(file_unique_id, animation.file_unique_id) &&
                Objects.equals(file_name, animation.file_name) && Objects.equals(mime_type, animation.mime_type) &&
                Objects.equals(width, animation.width) && Objects.equals(height, animation.height) &&
                Objects.equals(duration, animation.duration) && Objects.equals(file_size, animation.file_size) &&
                Objects.equals(thumbnail, animation.thumbnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, file_name, mime_type, width, height, duration, file_size, thumbnail);
    }
}

