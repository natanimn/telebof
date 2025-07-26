package io.github.natanimn.types.inline;

import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.types.input.InputTextMessageContent;

import java.io.Serializable;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InlineQueryResultContact implements Serializable, InlineQueryResult {
    private String type, id, phone_number, first_name, last_name, vcard, thumbnail_url;
    private Integer thumbnail_width, thumbnail_height;
    private InlineKeyboardMarkup reply_markup;
    private InputTextMessageContent input_message_content;
    public InlineQueryResultContact(String id, String phone_number, String first_name) {
        this.type = "contact";
        this.id = id;
        this.phone_number = phone_number;
        this.first_name = first_name;
    }
    public InlineQueryResultContact lastName(String lastName) {
        this.last_name = lastName;
        return this;
    }

    public InlineQueryResultContact vcard(String vcard) {
        this.vcard = vcard;
        return this;
    }

    public InlineQueryResultContact inputMessageContent(InputTextMessageContent inputTextMessageContent) {
        this.input_message_content = inputTextMessageContent;
        return this;
    }

    public InlineQueryResultContact replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return this;
    }

    public InlineQueryResultContact thumbnailUrl(String thumbnailUrl) {
        this.thumbnail_url = thumbnailUrl;
        return this;
    }

    public InlineQueryResultContact thumbnailWidth(int thumbnailWidth) {
        this.thumbnail_width = thumbnailWidth;
        return this;
    }

    public InlineQueryResultContact thumbnailHeight(int thumbnailHeight) {
        this.thumbnail_height = thumbnailHeight;
        return this;
    }

}
