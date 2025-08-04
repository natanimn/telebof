package io.github.natanimn.types.inline;

import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;

/**
 * Represents a <a href="https://core.telegram.org/bots/api#games">Game.</a>
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultGame implements InlineQueryResult {
    private String id;
    private String type;
    private String game_short_name;
    private InlineKeyboardMarkup reply_markup;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param game_short_name Short name of the game
     */
    public InlineQueryResultGame(String id, String game_short_name) {
        this.type = "game";
        this.id = id;
        this.game_short_name = game_short_name;
    }

    /**
     * Optional
     * @param keyboard {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultGame}
     */
    public InlineQueryResultGame replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return this;
    }
}
