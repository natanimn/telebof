package io.github.natanimn.types.media_and_service;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
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
