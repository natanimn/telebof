package io.github.natanimn.requests;

import io.github.natanimn.enums.StickerType;
import io.github.natanimn.types.input.InputSticker;

import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class CreateNewStickerSet extends AbstractBaseRequest<CreateNewStickerSet, Boolean> {
    public CreateNewStickerSet(long userId, String name, String title, InputSticker[] stickers, RequestSender requestSender) {
        super(requestSender, "createNewStickerSet");
        add("user_id", userId);
        add("name", name);
        add("title", title);
        add("stickers", List.of(stickers));
    }

    public CreateNewStickerSet stickerType(StickerType stickerType) {
        return add("sticker_type", stickerType);
    }

    public CreateNewStickerSet needsRepainting(boolean needsRepainting) {
        return add("needs_repainting", needsRepainting);
    }

}
