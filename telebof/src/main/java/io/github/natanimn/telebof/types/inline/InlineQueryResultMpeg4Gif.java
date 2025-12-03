package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound).
 * By default, this animated MPEG-4 file will be sent by the user with optional caption.
 * Alternatively, you can use {@link InlineQueryMediaResult#setInputMessageContent} to send a message with the specified content instead of the animation.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultMpeg4Gif extends InlineQueryMediaResult<InlineQueryResultMpeg4Gif> {
    @SerializedName("mpeg4_url")
    private String mpeg4Url;
    @SerializedName("thumbnail_mime_type")
    private String thumbnailMimeType;
    @SerializedName("mpeg4_width")
    private Integer mpeg4Width;
    @SerializedName("mpeg4_height")
    private Integer mpeg4Height;
    @SerializedName("mpeg4_duration")
    private Integer mpeg4Duration;
    @SerializedName("show_caption_above_media")
    private Boolean showCaptionAboveMedia;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param mpeg4Url A valid URL for the MPEG4 file
     * @param thumbnailUrl URL of the static (JPEG or GIF) or animated (MPEG4) thumbnail for the result
     */
    public InlineQueryResultMpeg4Gif(String id, String mpeg4Url, String thumbnailUrl) {
        super("mpeg4_gif", id);
        this.mpeg4Url = mpeg4Url;
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * Optional
     * @param mpeg4Width Video width
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif setMpeg4Width(Integer mpeg4Width) {
        this.mpeg4Width = mpeg4Width;
        return this;
    }

    /**
     * Optional
     * @param mpeg4Height Video height
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif setMpeg4Height(Integer mpeg4Height) {
        this.mpeg4Height = mpeg4Height;
        return this;
    }

    /**
     * Optional
     * @param mpeg4Duration Video duration in seconds
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif setMpeg4Duration(Integer mpeg4Duration) {
        this.mpeg4Duration = mpeg4Duration;
        return this;
    }

    /**
     * Optional
     * @param thumbnailMimeType MIME type of the thumbnail, must be one of “image/jpeg”, “image/gif”, or “video/mp4”. Defaults to “image/jpeg”
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif setThumbnailMimeType(String thumbnailMimeType) {
        this.thumbnailMimeType = thumbnailMimeType;
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif setShowCaptionAboveMedia(Boolean showCaptionAboveMedia) {
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        return this;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultMpeg4Gif}
     */
    public InlineQueryResultMpeg4Gif setTitle(String title) {
        this.title = title;
        return this;
    }
}