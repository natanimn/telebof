package io.github.natanimn.types;

import io.github.natanimn.BotLog;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InlineQueryResultCachedVoice extends InlineQueryMediaResult<InlineQueryResultCachedVoice> implements Serializable {
    private String voice_file_id, description;

    public InlineQueryResultCachedVoice(String id, String voiceFileId) {
        super("voice", id);
        this.voice_file_id = voiceFileId;
    }

    public InlineQueryResultCachedVoice description(String description) {
        this.description = description;
        return this;
    }
}
