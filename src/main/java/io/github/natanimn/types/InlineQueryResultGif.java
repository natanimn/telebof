package io.github.natanimn.types;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InlineQueryResultGif extends InlineQueryMediaResult<InlineQueryResultGif> implements Serializable {
    private String gif_url, thumbnail_mime_type;
    private Integer gif_width, gif_height, gif_duration;
    private Boolean show_caption_above_media;
    private String thumbnail_url;

    public InlineQueryResultGif(String id, String gif_url) {
        super("gif", id);
        this.gif_url = gif_url;
    }
    public InlineQueryResultGif gifWidth(int gifWidth) {
        this.gif_width = gifWidth;
        return this;
    }

    public InlineQueryResultGif gifHeight(int gif_height) {
        this.gif_height = gif_height;
        return this;
    }

    public InlineQueryResultGif gifDuration(int gif_duration) {
        this.gif_duration = gif_duration;
        return this;
    }

    public InlineQueryResultGif thumbnailUrl(String thumbnailUrl) {
        this.thumbnail_url = thumbnailUrl;
        return this;
    }

    public InlineQueryResultGif showCaptionAboveMedia(boolean showCaptionAboveMedia){
        this.show_caption_above_media = showCaptionAboveMedia;
        return this;
    }

    public InlineQueryResultGif thumbnailMimeType(String thumbnailMimeType) {
        this.thumbnail_mime_type = thumbnailMimeType;
        return this;
    }
}
