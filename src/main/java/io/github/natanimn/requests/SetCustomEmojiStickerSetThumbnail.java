package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetCustomEmojiStickerSetThumbnail extends AbstractBaseRequest<SetCustomEmojiStickerSetThumbnail, Boolean> {
    public SetCustomEmojiStickerSetThumbnail(String name, String customEmojiId, RequestSender requestSender) {
        super(requestSender, "setCustomEmojiStickerSetThumbnail");
        add("name", name);
        add("custom_emoji_id", customEmojiId);
    }

}
