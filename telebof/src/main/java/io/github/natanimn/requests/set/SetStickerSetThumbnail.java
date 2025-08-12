package io.github.natanimn.requests.set;

import io.github.natanimn.enums.StickerFormat;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

import java.io.File;

/**
 * SetStickerSetThumbnail class. Returns True on success.
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 0.9
 */
public class SetStickerSetThumbnail extends AbstractBaseRequest<SetStickerSetThumbnail, Boolean> {
    /**
     * Required
     * @param name name
     * @param user_id user id
     * @param thumbnail thumbnail
     * @param format format
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#setStickerSetThumbnail(String, long, File, StickerFormat)}
     */
    public SetStickerSetThumbnail(String name, long user_id, File thumbnail, StickerFormat format, RequestSender requestSender) {
        super(requestSender, "setStickerSetThumbnail");
        add("name", name);
        add("user_id", user_id);
        add("thumbnail", thumbnail);
        add("format", format);
    }

    /**
     * Required
     * @param name name
     * @param user_id user id
     * @param thumbnail thumbnail
     * @param format format
     * @param requestSender request sender
     * @implNote {@link io.github.natanimn.BotContext#setStickerSetThumbnail(String, long, String, StickerFormat)}
     */
    public SetStickerSetThumbnail(String name, long user_id, String thumbnail, StickerFormat format,  RequestSender requestSender) {
        super(requestSender, "setStickerSetThumbnail");
        add("name", name);
        add("user_id", user_id);
        add("thumbnail", thumbnail);
        add("format", format);
    }

}
