package io.github.natanimn.types.chat_and_user.bot;

import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
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
