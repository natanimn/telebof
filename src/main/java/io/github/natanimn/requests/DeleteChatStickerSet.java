package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class DeleteChatStickerSet extends AbstractBaseRequest<DeleteChatStickerSet, Boolean> {
    public DeleteChatStickerSet(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "deleteChatStickerSet");
    }

}
