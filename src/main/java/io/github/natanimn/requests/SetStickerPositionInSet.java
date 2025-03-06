package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetStickerPositionInSet extends AbstractBaseRequest<SetStickerPositionInSet, Boolean> {

    public SetStickerPositionInSet(String sticker, int position, RequestSender requestSender) {
        super(requestSender, "setStickerPositionInSet");
        add("sticker", sticker);
        add("position", position);
    }

}
