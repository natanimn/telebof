package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * SetChatStickerSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setChatStickerSet
 */
public class SetChatStickerSet extends AbstractBaseRequest<SetChatStickerSet, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param stickerSetName sticker set name
     * @param api api
     */
    public SetChatStickerSet(Object chatId, String stickerSetName, Api api) {
        super(chatId, api, "setChatStickerSet", Boolean.class);
        add("sticker_set_name", stickerSetName);
    }

}
