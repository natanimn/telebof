package io.github.natanimn.types.inline;


/**
 * Represents a link to an animated GIF file. By default, this animated GIF file will be sent by the user with optional caption.
 * Alternatively, you can use {@link InlineQueryMediaResult#inputMessageContent} to send a message with the specified content instead of the animation.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultGif extends InlineQueryMediaResult<InlineQueryResultGif> {
    private String gif_url;
    private String thumbnail_mime_type;
    private Integer gif_width;
    private Integer gif_height;
    private Integer gif_duration;
    private Boolean show_caption_above_media;
    private String thumbnail_url;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param gif_url A valid URL for the GIF file
     * @param thumbnail_url URL of the static (JPEG or GIF) or animated (MPEG4) thumbnail for the result
     */
    public InlineQueryResultGif(String id, String gif_url, String thumbnail_url) {
        super("gif", id);
        this.gif_url = gif_url;
        this.thumbnail_url = thumbnail_url;
    }

    /**
     * Optional
     * @param gif_width Width of the GIF
     * @return {@link InlineQueryResultGif}
     */
    public InlineQueryResultGif gifWidth(int gif_width) {
        this.gif_width = gif_width;
        return this;
    }

    /**
     * Optional
     * @param gif_height Height of the GIF
     * @return {@link InlineQueryResultGif}
     */
    public InlineQueryResultGif gifHeight(int gif_height) {
        this.gif_height = gif_height;
        return this;
    }

    /**
     * Optional
     * @param gif_duration Duration of the GIF in seconds
     * @return {@link InlineQueryResultGif}
     */
    public InlineQueryResultGif gifDuration(int gif_duration) {
        this.gif_duration = gif_duration;
        return this;
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return @link InlineQueryResultGif}
     */
    public InlineQueryResultGif showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_mime_type MIME type of the thumbnail, must be one of “image/jpeg”, “image/gif”, or “video/mp4”.
     *                            Defaults to “image/jpeg”
     * @return {@link InlineQueryResultGif}
     */
    public InlineQueryResultGif thumbnailMimeType(String thumbnail_mime_type) {
        this.thumbnail_mime_type = thumbnail_mime_type;
        return this;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultGif}
     */
    public InlineQueryResultGif title(String title){
        this.title = title;
        return this;
    }
}
