package io.github.natanimn.requests.set;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.media_and_service.MaskPosition;

/**
 * SetStickerMaskPosition class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#setStickerMaskPosition}
 */
public class SetStickerMaskPosition extends AbstractBaseRequest<SetStickerMaskPosition, Boolean> {
    /**
     * Required
     * @param sticker sticker
     * @param requestSender request sender
     */
    public SetStickerMaskPosition(String sticker, RequestSender requestSender) {
        super(requestSender, "setStickerMaskPosition");
        add("sticker", sticker);
    }

    /**
     * Optional
     * @param mask_position A JSON-serialized object with the position where the mask should be placed on faces.
     *                       Omit the parameter to remove the mask position.
     * @return {@link SetStickerMaskPosition}
     */
    public SetStickerMaskPosition maskPosition(MaskPosition mask_position){
        return add("mask_position", mask_position);
    }
}
