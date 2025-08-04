package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class Audio implements Serializable {
    public String file_id, file_unique_id, performer, title, file_name, mime_type;
    public Integer duration;
    public Integer file_size;
    public PhotoSize thumbnail;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Audio audio = (Audio) object;
        return Objects.equals(file_id, audio.file_id) &&
                Objects.equals(file_unique_id, audio.file_unique_id) &&
                Objects.equals(performer, audio.performer) &&
                Objects.equals(title, audio.title) &&
                Objects.equals(file_name, audio.file_name) &&
                Objects.equals(mime_type, audio.mime_type) &&
                Objects.equals(duration, audio.duration) &&
                Objects.equals(file_size, audio.file_size) &&
                Objects.equals(thumbnail, audio.thumbnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, performer, title, file_name, mime_type, duration, file_size, thumbnail);
    }
}
