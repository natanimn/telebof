package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.enums.MimeType;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a file. By default, this file will be sent by the user with an optional caption.
 * Alternatively, you can use {@link #setInputMessageContent} to send a message with the specified content instead of the file. Currently, only .PDF and .ZIP files can be sent using this method.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultDocument extends InlineQueryMediaResult<InlineQueryResultDocument> {
    @SerializedName("document_url")
    private String documentUrl;
    private String description;
    @SerializedName("mime_type")
    private MimeType mimeType;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    @SerializedName("thumbnail_width")
    private Integer thumbnailWidth;
    @SerializedName("thumbnail_height")
    private Integer thumbnailHeight;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param documentUrl A valid URL for the file
     * @param title Title for the result
     * @param mimeType MIME type of the content of the file, either {@link MimeType#PDF} or {@link MimeType#ZIP}
     */
    public InlineQueryResultDocument(String id, String documentUrl, String title, MimeType mimeType) {
        super("document", id);
        this.documentUrl = documentUrl;
        this.title = title;
        this.mimeType = mimeType;
    }

    /**
     * Optional
     * @param thumbnailUrl URL of the thumbnail (JPEG only) for the file
     * @return {@link InlineQueryResultDocument}
     */
    public InlineQueryResultDocument setThumbnailUrl(String thumbnailUrl){
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * Optional
     * @param thumbnailWidth Thumbnail Width
     * @return {@link InlineQueryResultDocument}
     */
    public InlineQueryResultDocument setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
        return this;
    }

    /**
     * Optional
     * @param thumbnailHeight Thumbnail height
     * @return {@link InlineQueryResultDocument}
     */
    public InlineQueryResultDocument setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
        return this;
    }

    /**
     * Optional
     * @param description Short description of the result
     * @return {@link InlineQueryResultDocument}
     */
    public InlineQueryResultDocument setDescription(String description) {
        this.description = description;
        return this;
    }
}