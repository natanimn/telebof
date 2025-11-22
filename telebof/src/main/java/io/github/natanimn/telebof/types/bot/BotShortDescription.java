package io.github.natanimn.telebof.types.bot;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents the bot's short description.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BotShortDescription {
    /**
     * The bot's short description
     */
    @SerializedName("short_description")
    private String shortDescription;

    public String getShortDescription() {
        return shortDescription;
    }
}