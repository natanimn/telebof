package io.github.natanimn.requests.get;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.media_and_service.StickerSet;

/**
 * GetStickerSet class. Returns {@link StickerSet} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#getStickerSet}
 */
public class GetStickerSet extends AbstractBaseRequest<GetStickerSet, StickerSet> {
    /**
     * Required
     * @param name name
     * @param requestSender request sender
     */
    public GetStickerSet(String name, RequestSender requestSender) {
        super(requestSender, "getStickerSet", StickerSet.class);
        add("name", name);
    }

}
