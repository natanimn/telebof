package io.github.natanimn.requests;

import io.github.natanimn.types.media_and_service.StickerSet;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetStickerSet extends AbstractBaseRequest<GetStickerSet, StickerSet> {
    public GetStickerSet(String name, RequestSender requestSender) {
        super(requestSender, "getStickerSet", StickerSet.class);
        add("name", name);
    }

}
