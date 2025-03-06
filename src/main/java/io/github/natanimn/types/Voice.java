package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class Voice implements Serializable {
    public String file_id, file_unique_id, mime_type;
    public Integer duration;
    public Integer file_size;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Voice voice = (Voice) object;
        return Objects.equals(file_id, voice.file_id) && Objects.equals(file_unique_id, voice.file_unique_id) &&
                Objects.equals(mime_type, voice.mime_type) && Objects.equals(duration, voice.duration) &&
                Objects.equals(file_size, voice.file_size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, mime_type, duration, file_size);
    }
}
