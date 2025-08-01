package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SetStickerSetTitle extends AbstractBaseRequest<SetStickerSetTitle, Boolean> {

    public SetStickerSetTitle(String sticker, String title, RequestSender requestSender) {
        super(requestSender, "setStickerSetTitle");
        add("sticker", sticker);
        add("title", title);
    }

}
