package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Represents a link to a voice recording in an .OGG container encoded with OPUS. By default, this voice recording will be sent by the user.
 * Alternatively, you can use {@link InlineQueryMediaResult#inputMessageContent} to send a message with the specified content instead of the voice message.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultVoice extends InlineQueryMediaResult<InlineQueryResultVoice> implements Serializable {
    @SerializedName("voice_url")
    private String voiceUrl;
    @SerializedName("voice_duration")
    private Integer voiceDuration;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param voiceUrl A valid URL for the voice recording
     * @param title Recording title
     */
    public InlineQueryResultVoice(String id, String voiceUrl, String title) {
        super("voice", id);
        this.voiceUrl = voiceUrl;
        this.title = title;
    }

    /**
     * Optional
     * @param voiceDuration Recording duration in seconds
     * @return {@link InlineQueryResultVoice}
     */
    public InlineQueryResultVoice setVoiceDuration(Integer voiceDuration) {
        this.voiceDuration = voiceDuration;
        return this;
    }
}