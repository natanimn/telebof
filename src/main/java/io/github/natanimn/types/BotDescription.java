package io.github.natanimn.types;


import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class BotDescription {
    public String description;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BotDescription that = (BotDescription) object;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
