package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class DeleteStickerSet extends AbstractBaseRequest<DeleteStickerSet, Boolean> {
    public DeleteStickerSet(String name, RequestSender requestSender) {
        super(requestSender, "deleteStickerSet");
        add("name", name);
    }

}
