package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetCustomEmojiStickerSetThumbnail class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setCustomEmojiStickerSetThumbnail
 */
public class SetCustomEmojiStickerSetThumbnail extends AbstractBaseRequest<SetCustomEmojiStickerSetThumbnail, Boolean> {
    /**
     * Required
     * @param name name
     * @param api api
     */
    public SetCustomEmojiStickerSetThumbnail(String name, Api api) {
        super(api, "setCustomEmojiStickerSetThumbnail");
        add("name", name);
    }

    /**
     * Optional
     * @param customEmojiId custom emoji id
     * @return {@link SetCustomEmojiStickerSetThumbnail}
     */
    public SetCustomEmojiStickerSetThumbnail customEmojiId(String customEmojiId){
        return add("custom_emoji_id", customEmojiId);
    }

}
