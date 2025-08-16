package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;
import java.io.Serializable;
import java.util.Objects;

/**
 * Represents a link to an article or web page.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultArticle implements Serializable, InlineQueryResult {
    private String id;
    private String type;
    private String url;
    private String description;
    private String thumbnail_url;
    private String title;
    private Integer thumbnail_width;
    private Integer thumbnail_height;
    private InputTextMessageContent input_message_content;
    private InlineKeyboardMarkup reply_markup;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 Bytes
     * @param title Title of the result
     * @param input_message_content Content of the message to be sent
     */
    public InlineQueryResultArticle(String id, String title, InputTextMessageContent input_message_content) {
        this.type = "article";
        this.id = id;
        this.title = title;
        this.input_message_content = input_message_content;
    }

    /**
     * Optional
     * @param keyboard {@link InlineKeyboardMarkup Inline keyboard} attached to the message
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return this;
    }

    /**
     * Optional
     * @param url URL of the result. Pass an empty string to hide
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Optional
     * @param description Short description of the result
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional
     * @param thumbnailUrl Url of the thumbnail for the result
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle thumbnailUrl(String thumbnailUrl) {
        this.thumbnail_url = thumbnailUrl;
        return this;
    }

    /**
     * Optional
     * @param thumbnailWidth Thumbnail width
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle thumbnailWidth(int thumbnailWidth) {
        this.thumbnail_width = thumbnailWidth;
        return this;
    }

    /**
     * Optional
     * @param thumbnailHeight Thumbnail heigh
     * @return {@link InlineQueryResultArticle}
     */
    public InlineQueryResultArticle thumbnailHeight(int thumbnailHeight) {
        this.thumbnail_height = thumbnailHeight;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InlineQueryResultArticle article = (InlineQueryResultArticle) object;
        return Objects.equals(id, article.id) &&
                Objects.equals(type, article.type) &&
                Objects.equals(url, article.url) &&
                Objects.equals(description, article.description) &&
                Objects.equals(thumbnail_url, article.thumbnail_url) &&
                Objects.equals(title, article.title) &&
                Objects.equals(thumbnail_width, article.thumbnail_width) &&
                Objects.equals(thumbnail_height, article.thumbnail_height) &&
                Objects.equals(input_message_content, article.input_message_content) &&
                Objects.equals(reply_markup, article.reply_markup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, url, description, thumbnail_url, title, thumbnail_width,
                thumbnail_height, input_message_content, reply_markup);
    }
}
