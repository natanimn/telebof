package io.github.natanimn.types;

import io.github.natanimn.BotLog;
import io.github.natanimn.errors.TelegramError;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InlineQueryResultCachedMpeg4Gif extends InlineQueryMediaResult<InlineQueryResultCachedMpeg4Gif> implements Serializable {
    private String mpeg4_file_id;
    private Boolean show_caption_above_media;
    public InlineQueryResultCachedMpeg4Gif(String id, String mpeg4_file_id) {
        super("mpeg4", id);
        this.mpeg4_file_id = mpeg4_file_id;
    }

    public InlineQueryResultCachedMpeg4Gif showCaptionAboveMedia(boolean show_caption_above_media){
        this.show_caption_above_media = show_caption_above_media;
        return this;
    }

}
