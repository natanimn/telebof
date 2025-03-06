package io.github.natanimn.requests;

import io.github.natanimn.types.File;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
