package io.github.natanimn.types;

import io.github.natanimn.enums.MimeType;
import io.github.natanimn.requests.MediaContentType;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InlineQueryResultDocument extends InlineQueryMediaResult<InlineQueryResultDocument> implements Serializable {
    private String document_url,  document, description, mime_type;
    private Integer thumbnail_width, thumbnail_height;

    public InlineQueryResultDocument(String id, String document_url, MimeType mimeType) {
        super("document", id);
        this.document_url = document_url;
        this.mime_type = String.format("application/%s", mimeType.name().toLowerCase());
    }

    public InlineQueryResultDocument documentUrl(String documentUrl) {
        this.document_url = documentUrl;
        return this;
    }

    public InlineQueryResultDocument thumbnailWidth(int thumbnailWidth) {
        this.thumbnail_width = thumbnailWidth;
        return this;
    }

    public InlineQueryResultDocument thumbnailHeight(int thumbnailHeight) {
        this.thumbnail_height = thumbnailHeight;
        return this;
    }

    public InlineQueryResultDocument description(String description) {
        this.description = description;
        return this;
    }

}
