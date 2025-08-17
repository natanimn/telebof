package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.chat_and_user.ChatInviteLink;

/**
 * RevokeChatInviteLink class
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#revokeChatInviteLink
 */
public class RevokeChatInviteLink extends AbstractBaseRequest<RevokeChatInviteLink, ChatInviteLink> {
    /**
     * Required
     * @param chat_id chat id
     * @param invite_link invite link
     * @param api api
     */
    public RevokeChatInviteLink(Object chat_id, String invite_link, Api api) {
        super(chat_id, api, "revokeChatInviteLink", ChatInviteLink.class);
        add("invite_link", invite_link);
    }

}
