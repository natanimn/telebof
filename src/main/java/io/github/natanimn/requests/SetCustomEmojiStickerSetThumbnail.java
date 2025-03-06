package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SetCustomEmojiStickerSetThumbnail extends AbstractBaseRequest<SetCustomEmojiStickerSetThumbnail, Boolean> {
    public SetCustomEmojiStickerSetThumbnail(String name, String customEmojiId, RequestSender requestSender) {
        super(requestSender, "setCustomEmojiStickerSetThumbnail");
        add("name", name);
        add("custom_emoji_id", customEmojiId);
    }

}
