package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.StickerType;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a sticker set.
 * @param name Sticker set name
 * @param title Sticker set title
 * @param stickerType Type of stickers in the set
 * @param stickers List of all set stickers
 * @param thumbnail Optional. Sticker set thumbnail in the .WEBP, .TGS, or .WEBM format
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record StickerSet(
        String name,
        String title,
        @SerializedName("sticker_type") StickerType stickerType,
        List<Sticker> stickers,
        PhotoSize thumbnail
) {}