package io.github.natanimn.requests;

import java.io.File;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SetChatPhoto extends AbstractBaseRequest<SetChatPhoto, Boolean> {
    public SetChatPhoto(Object chatId, File photo, RequestSender requestSender) {
        super(chatId, requestSender, "setChatPhoto");
        add("photo", photo);
        setContentType(MediaContentType.PHOTO);
    }

}
