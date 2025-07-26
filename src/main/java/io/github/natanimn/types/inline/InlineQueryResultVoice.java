package io.github.natanimn.types.inline;

import java.io.Serializable;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class InlineQueryResultVoice extends InlineQueryMediaResult<InlineQueryResultVoice> implements Serializable {
    private String voice_url;
    private Integer voice_duration;

    public InlineQueryResultVoice(String id, String voice_url) {
        super("voice", id);
        this.voice_url = voice_url;
    }
    public InlineQueryResultVoice voiceDuration(int voiceDuration) {
        this.voice_duration = voiceDuration;
        return this;
    }

}
