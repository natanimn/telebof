package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class SetChatStickerSet extends AbstractBaseRequest<SetChatStickerSet, Boolean> {
    public SetChatStickerSet(Object chatId, String stickerSetName, RequestSender requestSender) {
        super(chatId, requestSender, "setChatStickerSet");
        add("sticker_set_name", stickerSetName);
    }

}
