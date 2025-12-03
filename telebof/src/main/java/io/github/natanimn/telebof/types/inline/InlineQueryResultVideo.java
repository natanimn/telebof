package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.input.InputTextMessageContent;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Represents a link to a page containing an embedded video player or a video file.
 * By default, this video file will be sent by the user with an optional caption.
 * Alternatively, you can use {@link io.github.natanimn.telebof.types.input.InputMessageContent} to send a message with the specified content instead of the video.
 * If an InlineQueryResultVideo message contains an embedded video (e.g., YouTube),
 * you must replace its content using {@link io.github.natanimn.telebof.types.input.InputMessageContent}.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultVideo extends InlineQueryMediaResult<InlineQueryResultVideo> implements Serializable {
    @SerializedName("video_url")
    private String videoUrl;
    private String description;
    @SerializedName("mime_type")
    private String mimeType;
    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    @SerializedName("video_width")
    private Integer videoWidth;
    @SerializedName("video_height")
    private Integer videoHeight;
    @SerializedName("video_duration")
    private Integer videoDuration;
    @SerializedName("show_caption_above_media")
    private Boolean showCaptionAboveMedia;
    private String title;

    /**
     * Required
     * @param id Unique identifier for this result, 1-64 bytes
     * @param videoUrl A valid URL for the embedded video player or video file
     * @param mimeType MIME type of the content of the video URL, “text/html” or “video/mp4”
     * @param thumbnailUrl URL of the thumbnail (JPEG only) for the video
     * @param title Title for the result
     */
    public InlineQueryResultVideo(String id, String videoUrl, String mimeType, String thumbnailUrl, String title) {
        super("video", id);
        this.videoUrl = videoUrl;
        this.mimeType = mimeType;
        this.thumbnailUrl = thumbnailUrl;
        this.title = title;
    }

    /**
     * Optional
     * @param videoWidth Video width
     * @return {@link InlineQueryResultVideo}
     */
    public InlineQueryResultVideo setVideoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
        return this;
    }

    /**
     * Optional
     * @param videoHeight Video height
     * @return {@link InlineQueryResultVideo}
     */
    public InlineQueryResultVideo setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
        return this;
    }

    /**
     * Optional
     * @param videoDuration Video duration in seconds
     * @return {@link InlineQueryResultVideo}
     */
    public InlineQueryResultVideo setVideoDuration(Integer videoDuration) {
        this.videoDuration = videoDuration;
        return this;
    }

    /**
     * Optional
     * @param description Short description of the result
     * @return {@link InlineQueryResultVideo}
     */
    public InlineQueryResultVideo setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional
     * @param showCaptionAboveMedia Pass True, if the caption must be shown above the message media
     * @return {@link InlineQueryResultVideo}
     */
    public InlineQueryResultVideo setShowCaptionAboveMedia(Boolean showCaptionAboveMedia) {
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        return this;
    }
}