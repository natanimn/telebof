package io.github.natanimn.types;

import java.io.Serializable;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class InlineQueryResultVideo extends InlineQueryMediaResult<InlineQueryResultVideo> implements Serializable {
    private String video_url, description, mime_type, thumbnail_url;
    private Integer video_width, video_height, video_duration;
    private Boolean show_caption_above_media;

    public InlineQueryResultVideo(String id, String video_url, String mime_type) {
        super("video", id);
        this.video_url = video_url;
        this.mime_type = mime_type;
    }

    public InlineQueryResultVideo videoWidth(int videoWidth) {
        this.video_width = videoWidth;
        return this;
    }

    public InlineQueryResultVideo videoHeight(int videoHeight) {
        this.video_height = videoHeight;
        return this;
    }

    public InlineQueryResultVideo videoDuration(int videoDuration) {
        this.video_duration = videoDuration;
        return this;
    }

    public InlineQueryResultVideo description(String description) {
        this.description = description;
        return this;
    }

    public InlineQueryResultVideo thumbnailUrl(String thumbnailUrl) {
        this.thumbnail_url = thumbnailUrl;
        return this;
    }

    public InlineQueryResultVideo showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }
}
