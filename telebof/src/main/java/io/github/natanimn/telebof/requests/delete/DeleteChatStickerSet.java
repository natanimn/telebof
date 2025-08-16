package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;

/**
 * DeleteChatStickerSet class. Returns True on sucess.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#deleteChatStickerSet
 */
public class DeleteChatStickerSet extends AbstractBaseRequest<DeleteChatStickerSet, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public DeleteChatStickerSet(Object chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "deleteChatStickerSet", Boolean.class);
    }

}
