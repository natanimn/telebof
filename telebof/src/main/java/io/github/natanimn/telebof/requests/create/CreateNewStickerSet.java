package io.github.natanimn.telebof.requests.create;

import io.github.natanimn.telebof.enums.StickerType;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.input.InputSticker;

import java.util.List;

/**
 * CreateNewStickerSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#createNewStickerSet
 */
public class CreateNewStickerSet extends AbstractBaseRequest<CreateNewStickerSet, Boolean> {
    /**
     * Required
     * @param userId user id
     * @param name name
     * @param title title
     * @param stickers stickers
     * @param api api
     */
    public CreateNewStickerSet(long userId, String name, String title, InputSticker[] stickers, Api api) {
        super(api, "createNewStickerSet");
        add("user_id", userId);
        add("name", name);
        add("title", title);
        add("stickers", stickers);
    }

    /**
     * Optional
     * @param stickerType Type of stickers in the set
     * @return {@link CreateNewStickerSet}
     */
    public CreateNewStickerSet stickerType(StickerType stickerType) {
        return add("sticker_type", stickerType);
    }

    /**
     * Optional
     * @param needsRepainting Pass True if stickers in the sticker set must be repainted to the color of text when used in messages,
     *                         the accent color if used as emoji status, white on chat photos, or another appropriate color based on context; for custom emoji sticker sets only
     * @return {@link CreateNewStickerSet}
     */
    public CreateNewStickerSet needsRepainting(boolean needsRepainting) {
        return add("needs_repainting", needsRepainting);
    }

}
