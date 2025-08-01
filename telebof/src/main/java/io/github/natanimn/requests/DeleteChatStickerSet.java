package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class DeleteChatStickerSet extends AbstractBaseRequest<DeleteChatStickerSet, Boolean> {
    public DeleteChatStickerSet(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "deleteChatStickerSet");
    }

}
