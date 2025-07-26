package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class File implements Serializable {
    public String file_id, file_unique_id, file_path;
    public Integer file_size;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        File file = (File) object;
        return Objects.equals(file_id, file.file_id) && Objects.equals(file_unique_id, file.file_unique_id) &&
                Objects.equals(file_path, file.file_path) && Objects.equals(file_size, file.file_size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, file_path, file_size);
    }
}
