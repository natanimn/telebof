package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to an MP3 audio file. By default, this audio file will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the audio.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultAudio extends InlineQueryMediaResult<InlineQueryResultAudio> {
    private String title;
    @SerializedName("audio_url")
    private String audioUrl;
    private String performer;
    @SerializedName("audio_duration")
    private Integer audioDuration;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 Bytes
     * @param audioUrl A valid URL for the audio file
     * @param title Title
     */
    public InlineQueryResultAudio(String id, String audioUrl, String title) {
        super("audio", id);
        this.audioUrl = audioUrl;
        this.title = title;
    }

    /**
     * Optional
     * @param performer Performer
     * @return {@link InlineQueryResultAudio}
     */
    public InlineQueryResultAudio setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    /**
     * Optional
     * @param audioDuration Audio duration in seconds
     * @return {@link InlineQueryResultAudio}
     */
    public InlineQueryResultAudio setAudioDuration(Integer audioDuration) {
        this.audioDuration = audioDuration;
        return this;
    }
}