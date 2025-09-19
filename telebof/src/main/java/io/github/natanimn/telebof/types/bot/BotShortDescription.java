package io.github.natanimn.telebof.types.bot;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents the bot's short description.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 * @param shortDescription The bot's short description
 */
public record BotShortDescription(
    @SerializedName("short_description")
    String shortDescription
){}
