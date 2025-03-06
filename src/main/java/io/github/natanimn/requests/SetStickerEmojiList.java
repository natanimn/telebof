package io.github.natanimn.requests;

import java.util.List;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetStickerEmojiList extends AbstractBaseRequest<SetStickerEmojiList, Boolean> {
    public SetStickerEmojiList(String sticker, String[] emojiList, RequestSender requestSender) {
        super(requestSender, "setStickerEmojiList");
        add("sticker", sticker);
        add("emoji_list", List.of(emojiList));
    }

}
