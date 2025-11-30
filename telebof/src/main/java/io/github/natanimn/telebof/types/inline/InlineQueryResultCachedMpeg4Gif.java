package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound) stored on the Telegram servers.
 * By default, this animated MPEG-4 file will be sent by the user with an optional caption.
 * Alternatively, you can use {@link io.github.natanimn.telebof.types.input.InputTextMessageContent} to send a message with the specified content instead of the animation.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultCachedMpeg4Gif extends InlineQueryMediaResult<InlineQueryResultCachedMpeg4Gif> {
    @SerializedName("mpeg4_file_id")
    private String mpeg4FileId;
    private String title;
    @SerializedName("show_caption_above_media")
    private Boolean showCaptionAboveMedia;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param mpeg4FileId A valid file identifier for the MPEG4 file
     */
    public InlineQueryResultCachedMpeg4Gif(String id, String mpeg4FileId) {
        super("mpeg4", id);
        this.mpeg4FileId = mpeg4FileId;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultCachedMpeg4Gif}
     */
    public InlineQueryResultCachedMpeg4Gif setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultCachedMpeg4Gif}
     */
    public InlineQueryResultCachedMpeg4Gif setShowCaptionAboveMedia(Boolean showCaptionAboveMedia) {
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        return this;
    }
}