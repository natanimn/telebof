package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class PhotoSize implements Serializable {
    public String file_id, file_unique_id;
    public Integer width, height;
    public Integer file_size;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PhotoSize photoSize = (PhotoSize) object;
        return Objects.equals(file_id, photoSize.file_id) && Objects.equals(file_unique_id, photoSize.file_unique_id) &&
                Objects.equals(width, photoSize.width) && Objects.equals(height, photoSize.height) &&
                Objects.equals(file_size, photoSize.file_size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, width, height, file_size);
    }

    @Override
    public String toString() {
        return "PhotoSize{" +
                "file_id='" + file_id + '\'' +
                ", file_unique_id='" + file_unique_id + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", file_size=" + file_size +
                '}';
    }
}
