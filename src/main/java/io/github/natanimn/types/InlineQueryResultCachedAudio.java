package io.github.natanimn.types;

import io.github.natanimn.BotLog;

import java.io.Serializable;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InlineQueryResultCachedAudio extends InlineQueryMediaResult<InlineQueryResultCachedAudio> implements Serializable {
    private String audio_file_id, description;
    public InlineQueryResultCachedAudio(String id, String audioFileId) {
        super("audio", id);
        this.audio_file_id = audioFileId;
    }

    public InlineQueryResultCachedAudio description(String description) {
        this.description = description;
        return this;
    }

}
