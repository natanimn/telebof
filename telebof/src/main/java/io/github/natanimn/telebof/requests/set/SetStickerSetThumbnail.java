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
 * @version 1.3.0
 */
public class SetStickerSetThumbnail extends AbstractBaseRequest<SetStickerSetThumbnail, Boolean> {
    /**
     * Required
     * @param name name
     * @param userId user id
     * @param thumbnail thumbnail
     * @param format format
     * @param api api
     * @see BotContext#setStickerSetThumbnail(String, long, File, StickerFormat)
     */
    public SetStickerSetThumbnail(String name, long userId, File thumbnail, StickerFormat format, Api api) {
        super(api, "setStickerSetThumbnail");
        add("name", name);
        add("user_id", userId);
        add("thumbnail", thumbnail);
        add("format", format);
    }

    /**
     * Required
     * @param name name
     * @param userId user id
     * @param thumbnail thumbnail
     * @param format format
     * @param api api
     * @see BotContext#setStickerSetThumbnail(String, long, String, StickerFormat)
     */
    public SetStickerSetThumbnail(String name, long userId, String thumbnail, StickerFormat format,  Api api) {
        super(api, "setStickerSetThumbnail");
        add("name", name);
        add("user_id", userId);
        add("thumbnail", thumbnail);
        add("format", format);
    }
}
