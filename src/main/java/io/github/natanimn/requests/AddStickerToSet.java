package io.github.natanimn.requests;

import java.io.File;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class AddStickerToSet extends AbstractBaseRequest<AddStickerToSet, Boolean> {
    public AddStickerToSet(long userId, String name, File sticker, RequestSender requestSender){
        super(requestSender, "addStickerToSet");
        add("user_id", userId);
        add("name", name);
        add("sticker", sticker);
        this.setContentType(MediaContentType.PHOTO);
    }
}
