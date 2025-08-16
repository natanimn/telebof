package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;

/**
 * Represents a contact with a phone number. By default, this contact will be sent by the user.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with the specified content instead of the contact
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultContact implements InlineQueryResult {
    private String type;
    private String id;
    private String phone_number;
    private String first_name;
    private String last_name;
    private String vcard;
    private String thumbnail_url;
    private Integer thumbnail_width;
    private Integer thumbnail_height;
    private InlineKeyboardMarkup reply_markup;
    private InputTextMessageContent input_message_content;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 Bytes
     * @param phone_number Contact's phone number
     * @param first_name Contact's first name
     */
    public InlineQueryResultContact(String id, String phone_number, String first_name) {
        this.type = "contact";
        this.id = id;
        this.phone_number = phone_number;
        this.first_name = first_name;
    }

    /**
     * Optional
     * @param last_name Contact's last name
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact lastName(String last_name) {
        this.last_name = last_name;
        return this;
    }

    /**
     * Optional
     * @param vcard Additional data about the contact in the form of a <a href="https://en.wikipedia.org/wiki/VCard">vCard</a>, 0-2048 bytes
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact vcard(String vcard) {
        this.vcard = vcard;
        return this;
    }

    /**
     * Optional
     * @param input_message_content Content of the message to be sent instead of the contact
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact inputMessageContent(InputTextMessageContent input_message_content) {
        this.input_message_content = input_message_content;
        return this;
    }

    /**
     * Optional
     * @param keyboard {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_url Url of the thumbnail for the result
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact thumbnailUrl(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_width Thumbnail width
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact thumbnailWidth(int thumbnail_width) {
        this.thumbnail_width = thumbnail_width;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_height Thumbnail height
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact thumbnailHeight(int thumbnail_height) {
        this.thumbnail_height = thumbnail_height;
        return this;
    }

}
