package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.StickerType;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a sticker set.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class StickerSet {
    /**
     * Sticker set name
     */
    private String name;

    /**
     * Sticker set title
     */
    private String title;

    /**
     * Type of stickers in the set
     */
    @SerializedName("sticker_type")
    private StickerType stickerType;

    /**
     * List of all set stickers
     */
    private List<Sticker> stickers;

    /**
     * Optional. Sticker set thumbnail in the .WEBP, .TGS, or .WEBM format
     */
    private PhotoSize thumbnail;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public StickerType getStickerType() {
        return stickerType;
    }

    public List<Sticker> getStickers() {
        return stickers;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }
}