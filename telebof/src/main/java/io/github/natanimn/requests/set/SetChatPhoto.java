package io.github.natanimn.requests.set;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

import java.io.File;

/**
 * SetChatPhoto class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#setChatPhoto}
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
