package io.github.natanimn.requests.set;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * SetStickerPositionInSet class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#setStickerPositionInSet}
 */
public class SetStickerPositionInSet extends AbstractBaseRequest<SetStickerPositionInSet, Boolean> {
    /**
     * Required
     * @param sticker sticker
     * @param position position
     * @param requestSender request sender
     */
    public SetStickerPositionInSet(String sticker, int position, RequestSender requestSender) {
        super(requestSender, "setStickerPositionInSet");
        add("sticker", sticker);
        add("position", position);
    }

}
