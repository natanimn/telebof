package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetStickerEmojiList class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setStickerEmojiList
 */
public class SetStickerEmojiList extends AbstractBaseRequest<SetStickerEmojiList, Boolean> {
    /**
     * Required
     * @param sticker sticker
     * @param emojiList emoji list
     * @param api api
     */
    public SetStickerEmojiList(String sticker, String[] emojiList, Api api) {
        super(api, "setStickerEmojiList");
        add("sticker", sticker);
        add("emoji_list", emojiList);
    }
}
