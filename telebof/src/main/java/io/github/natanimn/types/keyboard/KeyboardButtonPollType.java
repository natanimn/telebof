package io.github.natanimn.types.keyboard;

import io.github.natanimn.enums.PollType;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class KeyboardButtonPollType implements Serializable {

    private String type;
    public KeyboardButtonPollType(@NotNull PollType type) {
        this.type = type.name().toLowerCase();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        KeyboardButtonPollType that = (KeyboardButtonPollType) object;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
