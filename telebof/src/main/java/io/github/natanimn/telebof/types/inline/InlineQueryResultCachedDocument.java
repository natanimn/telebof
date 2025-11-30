package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;

/**
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultCachedDocument extends InlineQueryMediaResult<InlineQueryResultCachedDocument> {
    private String title;
    @SerializedName("document_file_id")
    private String documentFileId;
    private String description;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param title Title for the result
     * @param documentFileId A valid file identifier for the file
     */
    public InlineQueryResultCachedDocument(String id, String title, String documentFileId) {
        super("document", id);
        this.title = title;
        this.documentFileId = documentFileId;
    }

    public InlineQueryResultCachedDocument setDescription(String description) {
        this.description = description;
        return this;
    }
}