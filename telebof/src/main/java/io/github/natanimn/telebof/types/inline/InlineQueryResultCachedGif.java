package io.github.natanimn.telebof.types.inline;

/**
 * Represents a link to an animated GIF file stored on the Telegram servers. By default, this animated GIF file will be sent by the user with an optional caption.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with specified content instead of the animation.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultCachedGif extends InlineQueryMediaResult<InlineQueryResultCachedGif> {
    private String gif_file_id;
    private String title;
    private Boolean show_caption_above_media;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param gif_file_id A valid file identifier for the GIF file
     */
    public InlineQueryResultCachedGif(String id, String gif_file_id) {
        super("gif", id);
        this.gif_file_id = gif_file_id;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultCachedGif}
     */
    public InlineQueryResultCachedGif title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultCachedGif}
     */
    public InlineQueryResultCachedGif showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }

}
