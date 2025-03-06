package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class PassportFile  implements Serializable {
    public String file_id, file_unique_id;
    public Integer file_size, file_date;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PassportFile that = (PassportFile) object;
        return Objects.equals(file_id, that.file_id) && Objects.equals(file_unique_id, that.file_unique_id) &&
                Objects.equals(file_size, that.file_size) && Objects.equals(file_date, that.file_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file_id, file_unique_id, file_size, file_date);
    }
}
