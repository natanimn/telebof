package io.github.natanimn.telebof.types.inline;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a link to a video file stored on the Telegram servers. By default, this video file will be sent by the user with an optional caption.
 * Alternatively, you can use {@link #setInputMessageContent} to send a message with the specified content instead of the video.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultCachedVideo extends InlineQueryMediaResult<InlineQueryResultCachedVideo> {
    @SerializedName("video_file_id")
    private String videoFileId;
    private String title;
    private String description;
    @SerializedName("show_caption_above_media")
    private Boolean showCaptionAboveMedia;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param videoFileId A valid file identifier for the video file
     * @param title Title for the result
     */
    public InlineQueryResultCachedVideo(String id, String videoFileId, String title) {
        super("video", id);
        this.videoFileId = videoFileId;
        this.title = title;
    }

    /**
     * Optional
     * @param description Short description of the result
     * @return {@link InlineQueryResultCachedVideo}
     */
    public InlineQueryResultCachedVideo setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultCachedVideo}
     */
    public InlineQueryResultCachedVideo setShowCaptionAboveMedia(Boolean showCaptionAboveMedia) {
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        return this;
    }
}