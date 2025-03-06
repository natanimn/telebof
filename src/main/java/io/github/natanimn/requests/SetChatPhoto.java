package io.github.natanimn.requests;

import java.io.File;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetChatPhoto extends AbstractBaseRequest<SetChatPhoto, Boolean> {
    public SetChatPhoto(Object chatId, File photo, RequestSender requestSender) {
        super(chatId, requestSender, "setChatPhoto");
        add("photo", photo);
        setContentType(MediaContentType.PHOTO);
    }

}
