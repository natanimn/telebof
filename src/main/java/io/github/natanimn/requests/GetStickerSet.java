package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.StickerSet;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetStickerSet extends AbstractBaseRequest<GetStickerSet, StickerSet> {
    public GetStickerSet(String name, RequestSender requestSender) {
        super(requestSender, "getStickerSet", StickerSet.class);
        add("name", name);
    }

}
