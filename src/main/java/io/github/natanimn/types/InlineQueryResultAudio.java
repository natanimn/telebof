package io.github.natanimn.types;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InlineQueryResultAudio extends InlineQueryMediaResult<InlineQueryResultAudio> implements Serializable, InlineQueryResult {
    private String id, type, audio_url, performer;
    private Integer audio_duration;
    public InlineQueryResultAudio(String id, String audio_url) {
        super(id, "audio");
        this.audio_url = audio_url;
    }

    public InlineQueryResultAudio performer(String performer) {
        this.performer = performer;
        return this;
    }

    public InlineQueryResultAudio audioDuration(int audioDuration) {
        this.audio_duration = audioDuration;
        return this;
    }

}
