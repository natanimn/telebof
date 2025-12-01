package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to an animated GIF file. By default, this animated GIF file will be sent by the user with optional caption.
 * Alternatively, you can use {@link InlineQueryMediaResult#setInputMessageContent} to send a message with the specified content instead of the animation.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultGif extends InlineQueryMediaResult<InlineQueryResultGif> {
    @SerializedName("gif_url")
    private String gifUrl;
    @SerializedName("thumbnail_mime_type")
    private String thumbnailMimeType;
    @SerializedName("gif_width")
    private Integer gifWidth;
    @SerializedName("gif_height")
    private Integer gifHeight;
    @SerializedName("gif_duration")
    private Integer gifDuration;
    @SerializedName("show_caption_above_media")
    private Boolean showCaptionAboveMedia;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param gifUrl A valid URL for the GIF file
     * @param thumbnailUrl URL of the static (JPEG or GIF) or animated (MPEG4) thumbnail for the result
     */
    public InlineQueryResultGif(String id, String gifUrl, String thumbnailUrl) {
        super("gif", id);
        this.gifUrl = gifUrl;
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * Optional
     * @param gifWidth Width of the GIF
     * @return {@link InlineQueryResultGif}
     */
    public InlineQueryResultGif setGifWidth(Integer gifWidth) {
        this.gifWidth = gifWidth;
        return this;
    }

    /**
     * Optional
     * @param gifHeight Height of the GIF
     * @return {@link InlineQueryResultGif}
     */
    public InlineQueryResultGif setGifHeight(Integer gifHeight) {
        this.gifHeight = gifHeight;
        return this;
    }

    /**
     * Optional
     * @param gifDuration Duration of the GIF in seconds
     * @return {@link InlineQueryResultGif}
     */
    public InlineQueryResultGif setGifDuration(Integer gifDuration) {
        this.gifDuration = gifDuration;
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultGif}
     */
    public InlineQueryResultGif setShowCaptionAboveMedia(Boolean showCaptionAboveMedia) {
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        return this;
    }

    /**
     * Optional
     * @param thumbnailMimeType MIME type of the thumbnail, must be one of “image/jpeg”, “image/gif”, or “video/mp4”.
     *                            Defaults to “image/jpeg”
     * @return {@link InlineQueryResultGif}
     */
    public InlineQueryResultGif setThumbnailMimeType(String thumbnailMimeType) {
        this.thumbnailMimeType = thumbnailMimeType;
        return this;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultGif}
     */
    public InlineQueryResultGif setTitle(String title) {
        this.title = title;
        return this;
    }
}