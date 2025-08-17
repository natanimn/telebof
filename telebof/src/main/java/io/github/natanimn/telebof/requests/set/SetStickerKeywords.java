package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

import java.util.List;

/**
 * SetStickerKeywords class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setStickerKeywords
 */
public class SetStickerKeywords extends AbstractBaseRequest<SetStickerKeywords, Boolean> {
    /**
     * Required
     * @param sticker stciker
     * @param keywords keywords
     * @param api api
     */
    public SetStickerKeywords(String sticker, String[] keywords, Api api) {
        super(api, "setStickerKeywords");
        add("sticker", sticker);
        add("keywords", List.of(keywords));
    }

}
