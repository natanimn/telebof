package io.github.natanimn.types.inline;

import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.types.input.InputTextMessageContent;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InlineQueryResultArticle implements Serializable, InlineQueryResult {
    private String id, type, url, description, thumbnail_url, title;
    private Integer thumbnail_width, thumbnail_height;
    private InputTextMessageContent input_message_content;
    private InlineKeyboardMarkup reply_markup;
    private Boolean hide_url;

    public InlineQueryResultArticle(String id) {
        this.type = "article";
        this.id = id;
    }

    public InlineQueryResultArticle title(String title) {
        this.title = title;
        return this;
    }

    public InlineQueryResultArticle inputMessageContent(InputTextMessageContent inputTextMessageContent) {
        this.input_message_content = inputTextMessageContent;
        return this;
    }

    public InlineQueryResultArticle replyMarkup(InlineKeyboardMarkup keyboard) {
        this.reply_markup = keyboard;
        return this;
    }

    public InlineQueryResultArticle url(String url) {
        this.url = url;
        return this;
    }

    public InlineQueryResultArticle hideUrl(boolean hideUrl) {
        this.hide_url = hideUrl;
        return this;
    }

    public InlineQueryResultArticle description(String description) {
        this.description = description;
        return this;
    }

    public InlineQueryResultArticle thumbnailUrl(String thumbnailUrl) {
        this.thumbnail_url = thumbnailUrl;
        return this;
    }

    public InlineQueryResultArticle thumbnailWidth(int thumbnailWidth) {
        this.thumbnail_width = thumbnailWidth;
        return this;
    }

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
                Objects.equals(reply_markup, article.reply_markup) &&
                Objects.equals(hide_url, article.hide_url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, url, description, thumbnail_url, title, thumbnail_width,
                thumbnail_height, input_message_content, reply_markup, hide_url);
    }
}
