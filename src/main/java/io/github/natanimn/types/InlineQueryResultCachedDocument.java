package io.github.natanimn.types;

import io.github.natanimn.BotLog;
import io.github.natanimn.errors.TelegramError;

import java.io.Serializable;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InlineQueryResultCachedDocument extends InlineQueryMediaResult<InlineQueryResultCachedDocument> implements Serializable {
    private String document_file_id, description;
    public InlineQueryResultCachedDocument(String id, String document_file_id) {
        super("document", id);
        this.document_file_id = document_file_id;
    }

    public InlineQueryResultCachedDocument description(String description) {
        this.description = description;
        return this;
    }
}
