package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class Dice implements Serializable {
    public String emoji;
    public Integer value;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Dice dice = (Dice) object;
        return Objects.equals(emoji, dice.emoji) && Objects.equals(value, dice.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emoji, value);
    }
}
