package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to an MP3 audio file stored on the Telegram servers. By default, this audio file will be sent by the user.
 * Alternatively, you can use {@link io.github.natanimn.telebof.types.input.InputMessageContent} to send a message with the specified content instead of the audio.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultCachedAudio extends InlineQueryMediaResult<InlineQueryResultCachedAudio>{
    @SerializedName("audio_file_id")
    private String audioFileId;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param audioFileId A valid file identifier for the audio file
     */
    public InlineQueryResultCachedAudio(String id, String audioFileId) {
        super("audio", id);
        this.audioFileId = audioFileId ;
    }
}
