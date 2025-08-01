package io.github.natanimn.types.inline;

import io.github.natanimn.enums.MimeType;

/**
 * Represents a link to a file. By default, this file will be sent by the user with an optional caption.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with the specified content instead of the file. Currently, only .PDF and .ZIP files can be sent using this method.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultDocument extends InlineQueryMediaResult<InlineQueryResultDocument> {
    private String document_url;
    private String document;
    private String description;
    private MimeType mime_type;
    private String thumbnail_url;
    private Integer thumbnail_width;
    private Integer thumbnail_height;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param document_url A valid URL for the file
     * @param title Title for the result
     * @param mime_type MIME type of the content of the file, either {@link MimeType#PDF} or {@link MimeType#ZIP}
     */
    public InlineQueryResultDocument(String id, String document_url, String title, MimeType mime_type) {
        super("document", id);
        this.document_url = document_url;
        this.title = title;
        this.mime_type = mime_type;
    }

    /**
     * Optional
     * @param thumbnail_url URL of the thumbnail (JPEG only) for the file
     * @return {@link InlineQueryResultDocument}
     */
    public InlineQueryResultDocument thumbnailUrl(String thumbnail_url){
        this.thumbnail_url = thumbnail_url;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_width Thumbnail Width
     * @return {@link InlineQueryResultDocument}
     */
    public InlineQueryResultDocument thumbnailWidth(int thumbnail_width) {
        this.thumbnail_width = thumbnail_width;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_height Thumbnail height
     * @return {@link InlineQueryResultDocument}
     */
    public InlineQueryResultDocument thumbnailHeight(int thumbnail_height) {
        this.thumbnail_height = thumbnail_height;
        return this;
    }

    /**
     * Optional
     * @param description hort description of the result
     * @return {@link InlineQueryResultDocument}
     */
    public InlineQueryResultDocument description(String description) {
        this.description = description;
        return this;
    }

}
