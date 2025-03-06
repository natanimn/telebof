package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class DeleteStickerFromSet extends AbstractBaseRequest<DeleteStickerFromSet, Boolean> {
    public DeleteStickerFromSet(String sticker, RequestSender requestSender){
        super(requestSender, "deleteStickerFromSet");
        add("sticker", sticker);
    }

}
