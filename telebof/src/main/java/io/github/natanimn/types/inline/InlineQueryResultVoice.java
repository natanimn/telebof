package io.github.natanimn.types.inline;

import io.github.natanimn.types.input.InputTextMessageContent;

import java.io.Serializable;

/**
 * Represents a link to a voice recording in an .OGG container encoded with OPUS. By default, this voice recording will be sent by the user.
 * Alternatively, you can use {@link InlineQueryMediaResult#inputMessageContent} to send a message with the specified content instead of the the voice message.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultVoice extends InlineQueryMediaResult<InlineQueryResultVoice> implements Serializable {
    private String voice_url;
    private Integer voice_duration;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param voice_url A valid URL for the voice recording
     * @param title Recording title
     */
    public InlineQueryResultVoice(String id, String voice_url, String title) {
        super("voice", id);
        this.voice_url = voice_url;
        this.title = title;
    }

    /**
     * Optional
     * @param voice_duration Recording duration in seconds
     * @return {@link InlineQueryResultVoice}
     */
    public InlineQueryResultVoice voiceDuration(int voice_duration) {
        this.voice_duration = voice_duration;
        return this;
    }

}
