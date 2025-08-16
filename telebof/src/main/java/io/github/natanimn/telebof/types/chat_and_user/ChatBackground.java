package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.BackgroundType;

import java.util.Objects;

/**
 * This class represents a chat background.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class ChatBackground {
    /**
     * Type of the background
     */
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
