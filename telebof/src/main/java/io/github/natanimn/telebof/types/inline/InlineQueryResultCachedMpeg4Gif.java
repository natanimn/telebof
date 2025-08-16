package io.github.natanimn.telebof.types.inline;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound) stored on the Telegram servers.
 * By default, this animated MPEG-4 file will be sent by the user with an optional caption.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with the specified content instead of the animation.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultCachedMpeg4Gif extends InlineQueryMediaResult<InlineQueryResultCachedMpeg4Gif> {
    private String mpeg4_file_id;
    private String title;
    private Boolean show_caption_above_media;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param mpeg4_file_id A valid file identifier for the MPEG4 file
     */
    public InlineQueryResultCachedMpeg4Gif(String id, String mpeg4_file_id) {
        super("mpeg4", id);
        this.mpeg4_file_id = mpeg4_file_id;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultCachedMpeg4Gif}
     */
    public InlineQueryResultCachedMpeg4Gif title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultCachedMpeg4Gif}
     */
    public InlineQueryResultCachedMpeg4Gif showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }

}
