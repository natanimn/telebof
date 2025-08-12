package io.github.natanimn.requests.edit;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * @author Natanim
 * @since 12 April 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#editChatSubscriptionInviteLink}
 */

public class EditChatSubscriptionInviteLink extends AbstractBaseRequest<EditChatSubscriptionInviteLink, EditChatSubscriptionInviteLink> {
    /**
     * Required
     * @param chat_id chat id
     * @param invite_link invite link
     * @param requestSender request sender
     */
    public EditChatSubscriptionInviteLink(Object chat_id, String invite_link, RequestSender requestSender) {
        super(chat_id, requestSender, "editChatSubscriptionInviteLink", EditChatSubscriptionInviteLink.class);
        add("invite_link", invite_link);
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
