package io.github.natanimn.types;

import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class Video{
    public String file_id, file_unique_id, file_name, mime_type;
    public Integer width, height, duration;
    public Integer file_size;
    public PhotoSize thumbnail;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Video video = (Video) object;
        return Objects.equals(file_id, video.file_id) && Objects.equals(file_unique_id, video.file_unique_id) &&
                Objects.equals(file_name, video.file_name) && Objects.equals(mime_type, video.mime_type) &&
                Objects.equals(width, video.width) && Objects.equals(height, video.height) &&
                Objects.equals(duration, video.duration) && Objects.equals(file_size, video.file_size) &&
                Objects.equals(thumbnail, video.thumbnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, file_name, mime_type, width, height, duration, file_size, thumbnail);
    }
}
