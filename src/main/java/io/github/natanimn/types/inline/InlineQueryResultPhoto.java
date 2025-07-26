package io.github.natanimn.types.inline;

import java.io.Serializable;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class InlineQueryResultPhoto extends InlineQueryMediaResult<InlineQueryResultPhoto> implements Serializable {
    private String photo_url, description, thumbnail_url;
    private Integer photo_width, photo_height;
    private Boolean show_caption_above_media;
    public InlineQueryResultPhoto(String id, String photo_url, String thumbnail_url) {
        super("photo", id);
        this.photo_url = photo_url;
        this.thumbnail_url = thumbnail_url;
    }
    public InlineQueryResultPhoto photoWidth(int photoWidth) {
        this.photo_width = photoWidth;
        return this;
    }

    public InlineQueryResultPhoto description(String description) {
        this.description = description;
        return this;
    }

    public InlineQueryResultPhoto showCaptionAboveMedia(boolean showCaptionAboveMedia){
        this.show_caption_above_media = showCaptionAboveMedia;
        return this;
    }
    public InlineQueryResultPhoto photoHeight(int photoHeight) {
        this.photo_height = photoHeight;
        return this;
    }

}
