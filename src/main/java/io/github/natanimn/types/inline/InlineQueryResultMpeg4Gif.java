package io.github.natanimn.types.inline;

import java.io.Serializable;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class InlineQueryResultMpeg4Gif extends InlineQueryMediaResult<InlineQueryResultMpeg4Gif> implements Serializable {
    private String mpeg4_url, thumbnail_mime_type;
    private Integer mpeg4_width, mpeg4_height, mpeg4_duration;
    private Boolean show_caption_above_media;
    private String thumbnail_url;

    public InlineQueryResultMpeg4Gif(String id, String mpeg4_url) {
        super("mpeg4_url", id);
        this.mpeg4_url = mpeg4_url;
    }

    public InlineQueryResultMpeg4Gif mpeg4Width(int mpeg4Width) {
        this.mpeg4_width = mpeg4Width;
        return this;
    }

    public InlineQueryResultMpeg4Gif mpeg4Height(int mpeg4Height) {
        this.mpeg4_height = mpeg4Height;
        return this;
    }

    public InlineQueryResultMpeg4Gif mpeg4Duration(int mpeg4Duration) {
        this.mpeg4_duration = mpeg4Duration;
        return this;
    }

    public InlineQueryResultMpeg4Gif thumbnailUrl(String thumbnailUrl) {
        this.thumbnail_url = thumbnailUrl;
        return this;
    }
    public InlineQueryResultMpeg4Gif thumbnailMimeType(String thumbnailMimeType) {
        this.thumbnail_mime_type = thumbnailMimeType;
        return this;
    }

    public InlineQueryResultMpeg4Gif showCaptionAboveMedia(boolean showCaptionAboveMedia){
        this.show_caption_above_media = showCaptionAboveMedia;
        return this;
    }

}
