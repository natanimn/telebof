package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.enums.StickerFormat;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;

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
     * @param api api
     * @see BotContext#setStickerSetThumbnail(String, long, File, StickerFormat)
     */
    public SetStickerSetThumbnail(String name, long user_id, File thumbnail, StickerFormat format, Api api) {
        super(api, "setStickerSetThumbnail");
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
     * @param api api
     * @see BotContext#setStickerSetThumbnail(String, long, String, StickerFormat)
     */
    public SetStickerSetThumbnail(String name, long user_id, String thumbnail, StickerFormat format,  Api api) {
        super(api, "setStickerSetThumbnail");
        add("name", name);
        add("user_id", user_id);
        add("thumbnail", thumbnail);
        add("format", format);
    }

}
