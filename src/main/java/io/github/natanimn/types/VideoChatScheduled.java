package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class VideoChatScheduled implements Serializable {
    public Integer start_date;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        VideoChatScheduled that = (VideoChatScheduled) object;
        return Objects.equals(start_date, that.start_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start_date);
    }
}
