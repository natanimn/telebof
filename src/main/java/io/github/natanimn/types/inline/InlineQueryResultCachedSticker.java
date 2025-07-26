package io.github.natanimn.types.inline;

import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.types.input.InputTextMessageContent;

import java.io.Serializable;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InlineQueryResultCachedSticker implements Serializable, InlineQueryResult {
    private String sticker_file_id, type, id;
    private InputTextMessageContent input_message_content;
    private InlineKeyboardMarkup reply_markup;

    public InlineQueryResultCachedSticker(String id, String sticker_file_id) {
        this.type = "sticker";
        this.id = id;
        this.sticker_file_id = sticker_file_id;
    }
    public InlineQueryResultCachedSticker inputMessageContent(InputTextMessageContent inputTextMessageContent) {
        this.input_message_content = inputTextMessageContent;
        return this;
    }

    public InlineQueryResultCachedSticker replyMarkup(InlineKeyboardMarkup keyboard) {
       this.reply_markup = keyboard;
       return this;
    }

}
