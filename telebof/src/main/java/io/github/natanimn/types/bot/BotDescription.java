package io.github.natanimn.types.bot;


import java.util.Objects;

/**
 * This object represents the bot's description.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class BotDescription {
    /**
     * The bot's description
     */
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
