package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetStickerSetTitle extends AbstractBaseRequest<SetStickerSetTitle, Boolean> {

    public SetStickerSetTitle(String sticker, String title, RequestSender requestSender) {
        super(requestSender, "setStickerSetTitle");
        add("sticker", sticker);
        add("title", title);
    }

}
