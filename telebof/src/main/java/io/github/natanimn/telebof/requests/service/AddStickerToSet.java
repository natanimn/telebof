package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.input.InputSticker;

/**
 * AddStickerToSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#addStickerToSet
 */
public class AddStickerToSet extends AbstractBaseRequest<AddStickerToSet, Boolean> {
    /**
     * Required
     * @param userId user id
     * @param name name
     * @param sticker sticker
     * @param api api
     */
    public AddStickerToSet(long userId, String name, InputSticker sticker, Api api){
        super(api, "addStickerToSet");
        add("user_id", userId);
        add("name", name);
        add("sticker", sticker);
    }
}
