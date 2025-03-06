package io.github.natanimn.requests;


import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SetStickerKeywords extends AbstractBaseRequest<SetStickerKeywords, Boolean> {
    public SetStickerKeywords(String sticker, String[] keywords, RequestSender requestSender) {
        super(requestSender, "setStickerKeywords");
        add("sticker", sticker);
        add("keywords", List.of(keywords));
    }

}
