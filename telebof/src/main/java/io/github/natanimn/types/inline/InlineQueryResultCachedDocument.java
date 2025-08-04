package io.github.natanimn.types.inline;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultCachedDocument extends InlineQueryMediaResult<InlineQueryResultCachedDocument> {
    private String title;
    private String document_file_id;
    private String description;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param title Title for the result
     * @param document_file_id A valid file identifier for the file
     */
    public InlineQueryResultCachedDocument(String id, String title, String document_file_id) {
        super("document", id);
        this.title = title;
        this.document_file_id = document_file_id;
    }


    public InlineQueryResultCachedDocument description(String description) {
        this.description = description;
        return this;
    }
}
