package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a voice message stored on the Telegram servers. By default, this voice message will be sent by the user.
 * Alternatively, you can use {@link #setInputMessageContent} to send a message with the specified content instead of the voice message.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultCachedVoice extends InlineQueryMediaResult<InlineQueryResultCachedVoice> {
    @SerializedName("voice_file_id")
    private String voiceFileId;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param voiceFileId A valid file identifier for the voice message
     * @param title Voice message title
     */
    public InlineQueryResultCachedVoice(String id, String voiceFileId, String title) {
        super("voice", id);
        this.voiceFileId = voiceFileId;
        this.title = title;
    }
}