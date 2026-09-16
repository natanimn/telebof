package io.github.natanimn.telebof.types.bot;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object represents the bot's short description.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class BotShortDescription {
    /**
     * The bot's short description
     */
    @SerializedName("short_description")
    private String shortDescription;

}