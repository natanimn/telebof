package io.github.natanimn.types;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InlineQueryResultCachedPhoto extends InlineQueryMediaResult<InlineQueryResultCachedPhoto> implements Serializable {
    private String photo_file_id, description;
    private Boolean show_caption_above_media;
    public InlineQueryResultCachedPhoto(String id, String photo_file_id) {
        super("photo", id);
        this.photo_file_id = photo_file_id;
    }

    public InlineQueryResultCachedPhoto description(String description) {
        this.description = description;
        return this;
    }

    public InlineQueryResultCachedPhoto showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }
}
