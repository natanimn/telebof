package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetStickerPositionInSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setStickerPositionInSet
 */
public class SetStickerPositionInSet extends AbstractBaseRequest<SetStickerPositionInSet, Boolean> {
    /**
     * Required
     * @param sticker sticker
     * @param position position
     * @param api api
     */
    public SetStickerPositionInSet(String sticker, int position, Api api) {
        super(api, "setStickerPositionInSet");
        add("sticker", sticker);
        add("position", position);
    }

}
