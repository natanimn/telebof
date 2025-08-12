package io.github.natanimn.requests.set;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

import java.util.List;

/**
 * SetStickerKeywords class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#setStickerKeywords}
 */
public class SetStickerKeywords extends AbstractBaseRequest<SetStickerKeywords, Boolean> {
    /**
     * Required
     * @param sticker stciker
     * @param keywords keywords
     * @param requestSender request sender
     */
    public SetStickerKeywords(String sticker, String[] keywords, RequestSender requestSender) {
        super(requestSender, "setStickerKeywords");
        add("sticker", sticker);
        add("keywords", List.of(keywords));
    }

}
