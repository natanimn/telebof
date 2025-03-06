package io.github.natanimn.requests;

import io.github.natanimn.enums.StickerType;
import io.github.natanimn.types.InputSticker;

import java.util.List;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
        return add("sticker_type", stickerType.name().toLowerCase());
    }

    public CreateNewStickerSet needsRepainting(boolean needsRepainting) {
        return add("needs_repainting", needsRepainting);
    }

}
