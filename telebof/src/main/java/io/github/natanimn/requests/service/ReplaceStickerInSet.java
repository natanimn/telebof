package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.input.InputSticker;

/**
 * ReplaceStickerInSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#replaceStickerInSet}
 */
public class ReplaceStickerInSet extends AbstractBaseRequest<ReplaceStickerInSet, Boolean> {
    /**
     * Required
     * @param user_id user id
     * @param name name
     * @param old_sticker old sticker
     * @param sticker sticker
     * @param requestSender request sender
     */
    public ReplaceStickerInSet(long user_id, String name, String old_sticker, InputSticker sticker, RequestSender requestSender){
        super(requestSender, "replaceStickerInSet");
        add("user_id", user_id);
        add("name", name);
        add("old_sticker", old_sticker);
        add("sticker", sticker);
    }

}
