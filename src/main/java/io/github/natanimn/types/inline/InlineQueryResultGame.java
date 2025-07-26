package io.github.natanimn.types.inline;

import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;

import java.io.Serializable;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InlineQueryResultGame implements Serializable, InlineQueryResult {
    private String id, type, game_short_name;
    private InlineKeyboardMarkup reply_markup;
    public InlineQueryResultGame(String id, String game_short_name) {
        this.type = "game";
        this.id = id;
        this.game_short_name = game_short_name;
    }
    public InlineQueryResultGame replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return this;
    }
}
