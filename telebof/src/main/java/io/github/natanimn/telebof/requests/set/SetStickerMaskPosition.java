package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.media_and_service.MaskPosition;

/**
 * SetStickerMaskPosition class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setStickerMaskPosition
 */
public class SetStickerMaskPosition extends AbstractBaseRequest<SetStickerMaskPosition, Boolean> {
    /**
     * Required
     * @param sticker sticker
     * @param api api
     */
    public SetStickerMaskPosition(String sticker, Api api) {
        super(api, "setStickerMaskPosition");
        add("sticker", sticker);
    }

    /**
     * Optional
     * @param maskPosition A JSON-serialized object with the position where the mask should be placed on faces.
     *                       Omit the parameter to remove the mask position.
     * @return {@link SetStickerMaskPosition}
     */
    public SetStickerMaskPosition maskPosition(MaskPosition maskPosition){
        return add("mask_position", maskPosition);
    }
}
