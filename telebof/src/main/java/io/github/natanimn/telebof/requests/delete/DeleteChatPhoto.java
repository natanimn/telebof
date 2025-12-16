package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * DeleteChatPhoto class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#deleteChatPhoto
 */
public class DeleteChatPhoto extends AbstractBaseRequest<DeleteChatPhoto, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param api api
     */
    public DeleteChatPhoto(Object chatId, Api api) {
        super(chatId, api, "deleteChatPhoto", Boolean.class);
    }

}
