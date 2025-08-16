package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.enums.StickerFormat;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.media_and_service.File;

/**
 * UploadStickerFile class. Returns {@link File} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#uploadStickerFile
 */
public class UploadStickerFile extends AbstractBaseRequest<UploadStickerFile, File> {
    /**
     * Required
     * @param user_id user id
     * @param sticker sticker
     * @param sticker_format sticker format
     * @param requestSender request sender
     */
    public UploadStickerFile(long user_id, java.io.File sticker, StickerFormat sticker_format, RequestSender requestSender) {
        super(requestSender, "uploadStickerFile", File.class);
        add("user_id", user_id);
        add("sticker", sticker);
        add("sticker_format", sticker_format);
    }

}
