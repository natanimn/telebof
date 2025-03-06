package io.github.natanimn.types;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
