package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;

/**
 * @author Natanim
 * @since 12 April 2025
 * @version 0.9
 * @see BotContext#editChatSubscriptionInviteLink
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
