package io.github.natanimn.requests;

import java.io.File;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class SetStickerSetThumbnail extends AbstractBaseRequest<SetStickerSetThumbnail, Boolean> {

    public SetStickerSetThumbnail(String name, long userId, File thumbnail, String format, RequestSender requestSender) {
        super(requestSender, "setStickerSetThumbnail");
        add("name", name);
        add("user_id", userId);
        add("thumbnail", thumbnail);
        add("format", format);
        setContentType(MediaContentType.PHOTO);
    }

    public SetStickerSetThumbnail(String name, long userId, String thumbnail, String format,  RequestSender requestSender) {
        super(requestSender, "setStickerSetThumbnail");
        add("name", name);
        add("user_id", userId);
        add("thumbnail", thumbnail);
        add("format", format);
    }

}
