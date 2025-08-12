package io.github.natanimn.requests.set;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * SetChatStickerSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#setChatStickerSet}
 */
public class SetChatStickerSet extends AbstractBaseRequest<SetChatStickerSet, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param sticker_set_name sticker set name
     * @param requestSender request sender
     */
    public SetChatStickerSet(Object chat_id, String sticker_set_name, RequestSender requestSender) {
        super(chat_id, requestSender, "setChatStickerSet", Boolean.class);
        add("sticker_set_name", sticker_set_name);
    }

}
