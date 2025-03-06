package io.github.natanimn.types;

import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class ChatBackground {
    public BackgroundType type;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatBackground that = (ChatBackground) object;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
