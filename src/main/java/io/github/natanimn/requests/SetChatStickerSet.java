package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetChatStickerSet extends AbstractBaseRequest<SetChatStickerSet, Boolean> {
    public SetChatStickerSet(Object chatId, String stickerSetName, RequestSender requestSender) {
        super(chatId, requestSender, "setChatStickerSet");
        add("sticker_set_name", stickerSetName);
    }

}
