package io.github.natanimn.telebof.requests.create;

import io.github.natanimn.telebof.enums.StickerType;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.input.InputSticker;

import java.util.List;

/**
 * CreateNewStickerSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @see BotContext#createNewStickerSet
 */
public class CreateNewStickerSet extends AbstractBaseRequest<CreateNewStickerSet, Boolean> {
    /**
     * Required
     * @param user_id user id
     * @param name name
     * @param title title
     * @param stickers stickers
     * @param requestSender request sender
     */
    public CreateNewStickerSet(long user_id, String name, String title, InputSticker[] stickers, RequestSender requestSender) {
        super(requestSender, "createNewStickerSet");
        add("user_id", user_id);
        add("name", name);
        add("title", title);
        add("stickers", List.of(stickers));
    }

    /**
     * Optional
     * @param sticker_type Type of stickers in the set
     * @return {@link CreateNewStickerSet}
     */
    public CreateNewStickerSet stickerType(StickerType sticker_type) {
        return add("sticker_type", sticker_type);
    }

    /**
     * Optional
     * @param needs_repainting Pass True if stickers in the sticker set must be repainted to the color of text when used in messages,
     *                         the accent color if used as emoji status, white on chat photos, or another appropriate color based on context; for custom emoji sticker sets only
     * @return {@link CreateNewStickerSet}
     */
    public CreateNewStickerSet needsRepainting(boolean needs_repainting) {
        return add("needs_repainting", needs_repainting);
    }

}
