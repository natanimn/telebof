package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * SetChatStickerSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setChatStickerSet
 */
public class SetChatStickerSet extends AbstractBaseRequest<SetChatStickerSet, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param sticker_set_name sticker set name
     * @param api api
     */
    public SetChatStickerSet(Object chat_id, String sticker_set_name, Api api) {
        super(chat_id, api, "setChatStickerSet", Boolean.class);
        add("sticker_set_name", sticker_set_name);
    }

}
