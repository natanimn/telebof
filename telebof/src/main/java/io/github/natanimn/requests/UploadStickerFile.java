package io.github.natanimn.requests;

import io.github.natanimn.types.media_and_service.File;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class UploadStickerFile extends AbstractBaseRequest<UploadStickerFile, File> {
    public UploadStickerFile(long userId, java.io.File sticker, String stickerFormat, RequestSender requestSender) {
        super(requestSender, "uploadStickerFile", File.class);
        add("user_id", userId);
        add("sticker", sticker);
        add("sticker_format", stickerFormat);
        setContentType(MediaContentType.PHOTO);
    }

}
