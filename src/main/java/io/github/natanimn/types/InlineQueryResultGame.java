package io.github.natanimn.types;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
