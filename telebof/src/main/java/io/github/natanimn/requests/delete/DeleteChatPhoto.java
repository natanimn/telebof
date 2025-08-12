package io.github.natanimn.requests.delete;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * DeleteChatPhoto class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#deleteChatPhoto}
 */
public class DeleteChatPhoto extends AbstractBaseRequest<DeleteChatPhoto, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public DeleteChatPhoto(Object chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "deleteChatPhoto", Boolean.class);
    }

}
