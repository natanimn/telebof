package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.chat_and_user.ChatInviteLink;

/**
 * RevokeChatInviteLink class
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#revokeChatInviteLink}
 */
public class RevokeChatInviteLink extends AbstractBaseRequest<RevokeChatInviteLink, ChatInviteLink> {
    /**
     * Required
     * @param chat_id chat id
     * @param invite_link invite link
     * @param requestSender request sender
     */
    public RevokeChatInviteLink(Object chat_id, String invite_link, RequestSender requestSender) {
        super(chat_id, requestSender, "revokeChatInviteLink", ChatInviteLink.class);
        add("invite_link", invite_link);
    }

}
