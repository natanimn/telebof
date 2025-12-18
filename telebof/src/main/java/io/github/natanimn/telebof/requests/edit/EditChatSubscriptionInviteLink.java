package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * @author Natanim
 * @since 12 April 2025
 * @version 1.3.0
 * @see BotContext#editChatSubscriptionInviteLink
 */

public class EditChatSubscriptionInviteLink extends AbstractBaseRequest<EditChatSubscriptionInviteLink, EditChatSubscriptionInviteLink> {
    /**
     * Required
     * @param chatId chat id
     * @param inviteLink invite link
     * @param api api
     */
    public EditChatSubscriptionInviteLink(Object chatId, String inviteLink, Api api) {
        super(chatId, api, "editChatSubscriptionInviteLink", EditChatSubscriptionInviteLink.class);
        add("invite_link", inviteLink);
    }

    /**
     * Optional
     * @param name Invite link name; 0-32 characters
     * @return {@link EditChatSubscriptionInviteLink}
     */
    public EditChatSubscriptionInviteLink name(String name) {
        return add("name", name);
    }
}
