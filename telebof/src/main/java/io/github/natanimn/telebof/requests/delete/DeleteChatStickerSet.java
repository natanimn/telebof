package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * DeleteChatStickerSet class. Returns True on sucess.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#deleteChatStickerSet
 */
public class DeleteChatStickerSet extends AbstractBaseRequest<DeleteChatStickerSet, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param api api
     */
    public DeleteChatStickerSet(Object chatId, Api api) {
        super(chatId, api, "deleteChatStickerSet", Boolean.class);
    }

}
