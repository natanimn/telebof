package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to an animated GIF file stored on the Telegram servers. By default, this animated GIF file will be sent by the user with an optional caption.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with specified content instead of the animation.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultCachedGif extends InlineQueryMediaResult<InlineQueryResultCachedGif> {
    @SerializedName("gif_file_id")
    private String gifFileId;
    private String title;
    @SerializedName("show_caption_above_media")
    private Boolean showCaptionAboveMedia;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param gifFileId A valid file identifier for the GIF file
     */
    public InlineQueryResultCachedGif(String id, String gifFileId) {
        super("gif", id);
        this.gifFileId = gifFileId;
    }

    /**
     * Optional
     * @param title Title for the result
     * @return {@link InlineQueryResultCachedGif}
     */
    public InlineQueryResultCachedGif setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultCachedGif}
     */
    public InlineQueryResultCachedGif setShowCaptionAboveMedia(Boolean showCaptionAboveMedia) {
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        return this;
    }
}