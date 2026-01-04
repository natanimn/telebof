package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * ExportChatInviteLink class. Returns the new invite link as String on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#exportChatInviteLink
 */
public class ExportChatInviteLink extends AbstractBaseRequest<ExportChatInviteLink, String> {
    /**
     * Required
     * @param chatId chat id
     * @param api api
     */
    public ExportChatInviteLink(Object chatId, Api api) {
        super(chatId, api, "exportChatInviteLink", Object.class);
    }

}
