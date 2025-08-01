package io.github.natanimn.types.inline;

/**
 * Represents a link to a video file stored on the Telegram servers. By default, this video file will be sent by the user with an optional caption.
 * Alternatively, you can use {@link #inputMessageContent} to send a message with the specified content instead of the video.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultCachedVideo extends InlineQueryMediaResult<InlineQueryResultCachedVideo> {

    private String video_file_id;
    private String title;
    private String description;
    private Boolean show_caption_above_media;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param video_file_id A valid file identifier for the video file
     * @param title Title for the result
     */
    public InlineQueryResultCachedVideo(String id, String video_file_id, String title) {
        super("video", id);
        this.video_file_id = video_file_id;
        this.title = title;
    }

    /**
     * Optional
     * @param description Short description of the result
     * @return {@link InlineQueryResultCachedVideo}
     */
    public InlineQueryResultCachedVideo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultCachedVideo}
     */
    public InlineQueryResultCachedVideo showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }
}
