package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.input.InputSticker;

/**
 * AddStickerToSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#addStickerToSet
 */
public class AddStickerToSet extends AbstractBaseRequest<AddStickerToSet, Boolean> {
    /**
     * Required
     * @param user_id user id
     * @param name name
     * @param sticker sticker
     * @param requestSender request sender
     */
    public AddStickerToSet(long user_id, String name, InputSticker sticker, RequestSender requestSender){
        super(requestSender, "addStickerToSet");
        add("user_id", user_id);
        add("name", name);
        add("sticker", sticker);
    }
}
