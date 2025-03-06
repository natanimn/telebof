package io.github.natanimn.types;

import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class BotName {
    public String name;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BotName botName = (BotName) object;
        return Objects.equals(name, botName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
