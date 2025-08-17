package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * DeleteChatPhoto class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#deleteChatPhoto
 */
public class DeleteChatPhoto extends AbstractBaseRequest<DeleteChatPhoto, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param api api
     */
    public DeleteChatPhoto(Object chat_id, Api api) {
        super(chat_id, api, "deleteChatPhoto", Boolean.class);
    }

}
