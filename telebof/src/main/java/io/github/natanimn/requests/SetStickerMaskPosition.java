package io.github.natanimn.requests;

import io.github.natanimn.types.media_and_service.MaskPosition;


/**
 * Natanim Negash
 *  3 March 2025
 */
public class SetStickerMaskPosition extends AbstractBaseRequest<SetStickerMaskPosition, Boolean> {
    public SetStickerMaskPosition(String sticker, MaskPosition maskPosition, RequestSender requestSender) {
        super(requestSender, "setStickerMaskPosition");
        add("sticker", sticker);
        add("mask_position", maskPosition);
    }

}
