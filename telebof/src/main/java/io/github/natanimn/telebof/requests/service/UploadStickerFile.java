package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.enums.StickerFormat;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.media_and_service.File;

/**
 * UploadStickerFile class. Returns {@link File} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#uploadStickerFile
 */
public class UploadStickerFile extends AbstractBaseRequest<UploadStickerFile, File> {
    /**
     * Required
     * @param userId user id
     * @param sticker sticker
     * @param stickerFormat sticker format
     * @param api api
     */
    public UploadStickerFile(long userId, java.io.File sticker, StickerFormat stickerFormat, Api api) {
        super(api, "uploadStickerFile", File.class);
        add("user_id", userId);
        add("sticker", sticker);
        add("sticker_format", stickerFormat);
    }

}
