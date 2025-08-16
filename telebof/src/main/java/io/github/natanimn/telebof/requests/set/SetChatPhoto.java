package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;

import java.io.File;

/**
 * SetChatPhoto class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setChatPhoto
 */
public class SetChatPhoto extends AbstractBaseRequest<SetChatPhoto, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param photo photo
     * @param requestSender request sender
     */
    public SetChatPhoto(Object chat_id, File photo, RequestSender requestSender) {
        super(chat_id, requestSender, "setChatPhoto", Boolean.class);
        add("photo", photo);
    }

}
