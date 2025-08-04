package io.github.natanimn.requests;

import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SetStickerEmojiList extends AbstractBaseRequest<SetStickerEmojiList, Boolean> {
    public SetStickerEmojiList(String sticker, String[] emojiList, RequestSender requestSender) {
        super(requestSender, "setStickerEmojiList");
        add("sticker", sticker);
        add("emoji_list", List.of(emojiList));
    }

}
