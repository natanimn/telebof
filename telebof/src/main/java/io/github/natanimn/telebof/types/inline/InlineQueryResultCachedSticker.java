package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;

/**
 * Represents a link to a sticker stored on the Telegram servers. By default, this sticker will be sent by the user.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with the specified content instead of the sticker.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultCachedSticker implements InlineQueryResult {
    private String sticker_file_id;
    private String type;
    private String id;
    private InputTextMessageContent input_message_content;
    private InlineKeyboardMarkup reply_markup;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param sticker_file_id A valid file identifier of the sticker
     */
    public InlineQueryResultCachedSticker(String id, String sticker_file_id) {
        this.type = "sticker";
        this.id = id;
        this.sticker_file_id = sticker_file_id;
    }

    /**
     * Optional
     * @param input_message_content Content of the message to be sent instead of the sticker
     * @return {@link InlineQueryResultCachedSticker}
     */
    public InlineQueryResultCachedSticker inputMessageContent(InputTextMessageContent input_message_content) {
        this.input_message_content = input_message_content;
        return this;
    }

    /**
     * Optional
     * @param keyboard {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultCachedSticker}
     */
    public InlineQueryResultCachedSticker replyMarkup(InlineKeyboardMarkup keyboard) {
       this.reply_markup = keyboard;
       return this;
    }

}
