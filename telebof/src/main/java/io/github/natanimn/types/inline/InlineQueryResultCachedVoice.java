package io.github.natanimn.types.inline;

/**
 * Represents a link to a voice message stored on the Telegram servers. By default, this voice message will be sent by the user.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with the specified content instead of the voice message.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultCachedVoice extends InlineQueryMediaResult<InlineQueryResultCachedVoice> {
    private String voice_file_id;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param voice_file_id A valid file identifier for the voice message
     * @param title Voice message title
     */
    public InlineQueryResultCachedVoice(String id, String voice_file_id, String title) {
        super("voice", id);
        this.voice_file_id = voice_file_id;
        this.title = title;
    }

}
