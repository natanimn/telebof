package io.github.natanimn.types.inline;


/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound).
 * By default, this animated MPEG-4 file will be sent by the user with optional caption.
 * Alternatively, you can use {@link InlineQueryMediaResult#inputMessageContent} to send a message with the specified content instead of the animation.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultMpeg4Gif extends InlineQueryMediaResult<InlineQueryResultMpeg4Gif> {
    private String mpeg4_url;
    private String thumbnail_mime_type;
    private Integer mpeg4_width;
    private Integer mpeg4_height;
    private Integer mpeg4_duration;
    private Boolean show_caption_above_media;
    private String thumbnail_url;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param mpeg4_url A valid URL for the MPEG4 file
     * @param thumbnail_url URL of the static (JPEG or GIF) or animated (MPEG4) thumbnail for the result
     */
    public InlineQueryResultMpeg4Gif(String id, String mpeg4_url, String thumbnail_url) {
        super("mpeg4_url", id);
        this.mpeg4_url = mpeg4_url;
        this.thumbnail_url = thumbnail_url;
    }

    /**
     * Optional
     * @param mpeg4_width Video width
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif mpeg4Width(int mpeg4_width) {
        this.mpeg4_width = mpeg4_width;
        return this;
    }

    /**
     * Optional
     * @param mpeg4_height Video height
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif mpeg4Height(int mpeg4_height) {
        this.mpeg4_height = mpeg4_height;
        return this;
    }

    /**
     * Optional
     * @param mpeg4_duration Video duration in seconds
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif mpeg4Duration(int mpeg4_duration) {
        this.mpeg4_duration = mpeg4_duration;
        return this;
    }

    /**
     * Optional
     * @param thumbnail_mime_type MIME type of the thumbnail, must be one of “image/jpeg”, “image/gif”, or “video/mp4”. Defaults to “image/jpeg”
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif thumbnailMimeType(String thumbnail_mime_type) {
        this.thumbnail_mime_type = thumbnail_mime_type;
        return this;
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif title(String title){
        this.title = title;
        return this;
    }
}
