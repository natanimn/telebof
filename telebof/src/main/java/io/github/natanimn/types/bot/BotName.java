package io.github.natanimn.types.bot;

import java.util.Objects;

/**
 * This object represents the bot's name.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class BotName {
    /**
     * The bot's name
     */
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
