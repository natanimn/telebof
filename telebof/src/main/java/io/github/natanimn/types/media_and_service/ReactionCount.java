package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class ReactionCount implements Serializable {
    public ReactionType type;
    public int total_count;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ReactionCount that = (ReactionCount) object;
        return total_count == that.total_count && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, total_count);
    }
}
