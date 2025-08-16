package io.github.natanimn.telebof.types.inline;

/**
 * Represents a link to an MP3 audio file stored on the Telegram servers. By default, this audio file will be sent by the user.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with the specified content instead of the audio.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultCachedAudio extends InlineQueryMediaResult<InlineQueryResultCachedAudio>{
    private String audio_file_id;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param audio_file_id A valid file identifier for the audio file
     */
    public InlineQueryResultCachedAudio(String id, String audio_file_id) {
        super("audio", id);
        this.audio_file_id = audio_file_id ;
    }
}
