package io.github.natanimn.requests;


import java.util.List;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetStickerKeywords extends AbstractBaseRequest<SetStickerKeywords, Boolean> {
    public SetStickerKeywords(String sticker, String[] keywords, RequestSender requestSender) {
        super(requestSender, "setStickerKeywords");
        add("sticker", sticker);
        add("keywords", List.of(keywords));
    }

}
