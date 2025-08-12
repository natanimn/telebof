package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.input.InputSticker;

import java.io.File;

/**
 * AddStickerToSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#addStickerToSet}
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
