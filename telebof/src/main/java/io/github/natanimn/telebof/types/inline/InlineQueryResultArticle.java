package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Represents a link to an article or web page.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultArticle implements Serializable, InlineQueryResult {
    private String id;
    private String type;
    private String url;
    private String description;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    private String title;
    @SerializedName("thumbnail_width")
    private Integer thumbnailWidth;
    @SerializedName("thumbnail_height")
    private Integer thumbnailHeight;
    @SerializedName("input_message_content")
    private InputTextMessageContent inputMessageContent;
    @SerializedName("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 Bytes
     * @param title Title of the result
     * @param inputMessageContent Content of the message to be sent
     */
    public InlineQueryResultArticle(String id, String title, InputTextMessageContent inputMessageContent) {
        this.type = "article";
        this.id = id;
        this.title = title;
        this.inputMessageContent = inputMessageContent;
    }

    /**
     * Optional
     * @param replyMarkup {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional
     * @param url URL of the result. Pass an empty string to hide
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Optional
     * @param description Short description of the result
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional
     * @param thumbnailUrl Url of the thumbnail for the result
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * Optional
     * @param thumbnailWidth Thumbnail width
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    /**
     * Optional
     * @param thumbnailHeight Thumbnail height
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }
}