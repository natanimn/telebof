package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

import java.util.List;

/**
 * SetStickerEmojiList class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setStickerEmojiList
 */
public class SetStickerEmojiList extends AbstractBaseRequest<SetStickerEmojiList, Boolean> {
    /**
     * Required
     * @param sticker sticker
     * @param emoji_list emoji list
     * @param requestSender request sender
     */
    public SetStickerEmojiList(String sticker, String[] emoji_list, RequestSender requestSender) {
        super(requestSender, "setStickerEmojiList");
        add("sticker", sticker);
        add("emoji_list", List.of(emoji_list));
    }

}
