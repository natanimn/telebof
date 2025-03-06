package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class VideoNote implements Serializable {
    public String file_id, file_unique_id;
    public Integer length, duration;
    public Integer file_size;
    public PhotoSize thumbnail;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        VideoNote videoNote = (VideoNote) object;
        return Objects.equals(file_id, videoNote.file_id) && Objects.equals(file_unique_id, videoNote.file_unique_id) &&
                Objects.equals(length, videoNote.length) && Objects.equals(duration, videoNote.duration) &&
                Objects.equals(file_size, videoNote.file_size) && Objects.equals(thumbnail, videoNote.thumbnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, length, duration, file_size, thumbnail);
    }
}