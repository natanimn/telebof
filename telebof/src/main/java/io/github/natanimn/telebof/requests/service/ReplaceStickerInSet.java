package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.input.InputSticker;

/**
 * ReplaceStickerInSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#replaceStickerInSet
 */
public class ReplaceStickerInSet extends AbstractBaseRequest<ReplaceStickerInSet, Boolean> {
    /**
     * Required
     * @param user_id user id
     * @param name name
     * @param old_sticker old sticker
     * @param sticker sticker
     * @param api api
     */
    public ReplaceStickerInSet(long user_id, String name, String old_sticker, InputSticker sticker, Api api){
        super(api, "replaceStickerInSet");
        add("user_id", user_id);
        add("name", name);
        add("old_sticker", old_sticker);
        add("sticker", sticker);
    }

}
