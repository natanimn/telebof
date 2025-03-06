package io.github.natanimn.types;

import io.github.natanimn.BotLog;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InlineQueryResultCachedGif extends InlineQueryMediaResult<InlineQueryResultCachedGif> implements Serializable {
    private String gif_file_id;
    private Boolean show_caption_above_media;
    public InlineQueryResultCachedGif(String id, String gif_file_id) {
        super("gif", id);
        this.gif_file_id = gif_file_id;
    }

    public InlineQueryResultCachedGif showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }

}
