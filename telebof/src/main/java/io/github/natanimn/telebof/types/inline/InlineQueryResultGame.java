package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a <a href="https://core.telegram.org/bots/api#games">Game.</a>
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultGame implements InlineQueryResult {
    private String id;
    private String type;
    @SerializedName("game_short_name")
    private String gameShortName;
    @SerializedName("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param gameShortName Short name of the game
     */
    public InlineQueryResultGame(String id, String gameShortName) {
        this.type = "game";
        this.id = id;
        this.gameShortName = gameShortName;
    }

    /**
     * Optional
     * @param replyMarkup {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultGame}
     */
    public InlineQueryResultGame setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }
}