package io.github.natanimn.types.inline;


/**
 * Represents a link to an MP3 audio file. By default, this audio file will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the audio.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultAudio extends InlineQueryMediaResult<InlineQueryResultAudio> {
    private String id;
    private String title;
    private String audio_url;
    private String performer;
    private Integer audio_duration;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 Bytes
     * @param audio_url A valid URL for the audio file
     * @param title Title
     */
    public InlineQueryResultAudio(String id, String audio_url, String title) {
        super(id, "audio");
        this.audio_url = audio_url;
        this.title = title;
    }

    /**
     * Optional
     * @param performer Performer
     * @return {@link InlineQueryResultAudio}
     */
    public InlineQueryResultAudio performer(String performer) {
        this.performer = performer;
        return this;
    }

    /**
     * Optional
     * @param audio_duration Audio duration in seconds
     * @return {@link InlineQueryResultAudio}
     */
    public InlineQueryResultAudio audioDuration(int audio_duration) {
        this.audio_duration = audio_duration;
        return this;
    }

}
