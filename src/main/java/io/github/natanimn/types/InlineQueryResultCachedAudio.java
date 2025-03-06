package io.github.natanimn.types;

import io.github.natanimn.BotLog;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
