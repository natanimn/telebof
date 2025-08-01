package io.github.natanimn.types.bot;

import java.util.Objects;

/**
 * This object represents the bot's short description.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class BotShortDescription {
    /**
     * The bot's short description
     */
    public String short_description;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BotShortDescription that = (BotShortDescription) object;
        return Objects.equals(short_description, that.short_description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(short_description);
    }
}
