package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * DeleteStickerFromSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#deleteStickerFromSet
 */
public class DeleteStickerFromSet extends AbstractBaseRequest<DeleteStickerFromSet, Boolean> {
    /**
     * Required
     * @param sticker sticker
     * @param api api
     */
    public DeleteStickerFromSet(String sticker, Api api){
        super(api, "deleteStickerFromSet");
        add("sticker", sticker);
    }

}
