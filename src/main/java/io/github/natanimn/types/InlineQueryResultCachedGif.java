package io.github.natanimn.types;

import io.github.natanimn.BotLog;

import java.io.Serializable;

/**
 * Natanim Negash 
 *  3 March 2025
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
