package io.github.natanimn.types;

import io.github.natanimn.enums.PollType;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
