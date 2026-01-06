package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.input.InputSticker;

/**
 * ReplaceStickerInSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#replaceStickerInSet
 */
public class ReplaceStickerInSet extends AbstractBaseRequest<ReplaceStickerInSet, Boolean> {
    /**
     * Required
     * @param userId user id
     * @param name name
     * @param oldSticker old sticker
     * @param sticker sticker
     * @param api api
     */
    public ReplaceStickerInSet(long userId, String name, String oldSticker, InputSticker sticker, Api api){
        super(api, "replaceStickerInSet");
        add("user_id", userId);
        add("name", name);
        add("old_sticker", oldSticker);
        add("sticker", sticker);
    }

}
