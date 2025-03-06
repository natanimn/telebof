package io.github.natanimn.requests;

import io.github.natanimn.types.MaskPosition;


/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetStickerMaskPosition extends AbstractBaseRequest<SetStickerMaskPosition, Boolean> {
    public SetStickerMaskPosition(String sticker, MaskPosition maskPosition, RequestSender requestSender) {
        super(requestSender, "setStickerMaskPosition");
        add("sticker", sticker);
        add("mask_position", maskPosition);
    }

}
