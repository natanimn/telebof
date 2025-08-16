package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.input.InputTextMessageContent;

import java.io.Serializable;

/**
 * Represents a link to a page containing an embedded video player or a video file.
 * By default, this video file will be sent by the user with an optional caption.
 * Alternatively, you can use {@link InlineQueryMediaResult#inputMessageContent} to send a message with the specified content instead of the video.
 * If an InlineQueryResultVideo message contains an embedded video (e.g., YouTube),
 * you must replace its content using {@link InlineQueryMediaResult#inputMessageContent}.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultVideo extends InlineQueryMediaResult<InlineQueryResultVideo> implements Serializable {
    private String video_url;
    private String description;
    private String mime_type;
    private String thumbnail_url;
    private Integer video_width;
    private Integer video_height;
    private Integer video_duration;
    private Boolean show_caption_above_media;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param video_url A valid URL for the embedded video player or video file
     * @param mime_type MIME type of the content of the video URL, “text/html” or “video/mp4”
     * @param thumbnail_url URL of the thumbnail (JPEG only) for the video
     * @param title Title for the result
     */
    public InlineQueryResultVideo(String id, String video_url, String mime_type, String thumbnail_url, String title) {
        super("video", id);
        this.video_url = video_url;
        this.mime_type = mime_type;
        this.thumbnail_url = thumbnail_url;
        this.title = title;
    }

    /**
     * Optional
     * @param video_width Video width
     * @return {@link InlineQueryResultVideo}
     */
    public InlineQueryResultVideo videoWidth(int video_width) {
        this.video_width = video_width;
        return this;
    }

    /**
     * Optional
     * @param video_height Video width
     * @return {@link InlineQueryResultVideo}
     */
    public InlineQueryResultVideo videoHeight(int video_height) {
        this.video_height = video_height;
        return this;
    }

    /**
     * Optional
     * @param video_duration Video duration in seconds
     * @return {@link InlineQueryResultVideo}
     */
    public InlineQueryResultVideo videoDuration(int video_duration) {
        this.video_duration = video_duration;
        return this;
    }

    /**
     * Optional
     * @param description Short description of the result
     * @return {@link InlineQueryResultVideo}
     */
    public InlineQueryResultVideo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional
     * @param show_caption_above_media Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultVideo}
     */
    public InlineQueryResultVideo showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }

    /**
     * Optional
     * @param input_message_content Content of the message to be sent instead of the video.
     *                              This field is required if InlineQueryResultVideo is used to send an HTML-page as a result (e.g., a YouTube video).
     * @return {@link InlineQueryResultVideo}
     */
    @Override
    public InlineQueryResultVideo inputMessageContent(InputTextMessageContent input_message_content) {
        return super.inputMessageContent(input_message_content);
    }
}
