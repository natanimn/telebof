package io.github.natanimn.requests.delete;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * DeleteStickerFromSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#deleteStickerFromSet}
 */
public class DeleteStickerFromSet extends AbstractBaseRequest<DeleteStickerFromSet, Boolean> {
    /**
     * Required
     * @param sticker sticker
     * @param requestSender request sender
     */
    public DeleteStickerFromSet(String sticker, RequestSender requestSender){
        super(requestSender, "deleteStickerFromSet");
        add("sticker", sticker);
    }

}
