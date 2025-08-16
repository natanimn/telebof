package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;

/**
 * ExportChatInviteLink class. Returns the new invite link as String on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#exportChatInviteLink
 */
public class ExportChatInviteLink extends AbstractBaseRequest<ExportChatInviteLink, String> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public ExportChatInviteLink(Object chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "exportChatInviteLink", Object.class);
    }

}
