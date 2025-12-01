package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a contact with a phone number. By default, this contact will be sent by the user.
 * Alternatively, you can use {@link #setInputMessageContent} to send a message with the specified content instead of the contact
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultContact implements InlineQueryResult {
    private String type;
    private String id;
    @SerializedName("phone_number")
    private String phoneNumber;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    private String vcard;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    @SerializedName("thumbnail_width")
    private Integer thumbnailWidth;
    @SerializedName("thumbnail_height")
    private Integer thumbnailHeight;
    @SerializedName("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
    @SerializedName("input_message_content")
    private InputTextMessageContent inputMessageContent;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 Bytes
     * @param phoneNumber Contact's phone number
     * @param firstName Contact's first name
     */
    public InlineQueryResultContact(String id, String phoneNumber, String firstName) {
        this.type = "contact";
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
    }

    /**
     * Optional
     * @param lastName Contact's last name
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Optional
     * @param vcard Additional data about the contact in the form of a <a href="https://en.wikipedia.org/wiki/VCard">vCard</a>, 0-2048 bytes
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact setVcard(String vcard) {
        this.vcard = vcard;
        return this;
    }

    /**
     * Optional
     * @param inputMessageContent Content of the message to be sent instead of the contact
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact setInputMessageContent(InputTextMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    /**
     * Optional
     * @param replyMarkup {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional
     * @param thumbnailUrl Url of the thumbnail for the result
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * Optional
     * @param thumbnailWidth Thumbnail width
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    /**
     * Optional
     * @param thumbnailHeight Thumbnail height
     * @return {@link InlineQueryResultContact}
     */
    public InlineQueryResultContact setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }
}