package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.StickerType;

import java.util.List;

/**
 * This object represents a sticker set.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class StickerSet {
    /**
     * Sticker set name
     */
    public String name;

    /**
     * Sticker set title
     */
    public String title;

    /**
     * Type of stickers in the set
     */
    public StickerType sticker_type;

    /**
     * List of all set stickers
     */
    public List<Sticker> stickers;

    /**
     * Optional. Sticker set thumbnail in the .WEBP, .TGS, or .WEBM format
     */
    public PhotoSize thumbnail;
}
