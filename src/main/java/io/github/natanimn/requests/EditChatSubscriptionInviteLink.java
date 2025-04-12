package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  12 April 2025
 */

public class EditChatSubscriptionInviteLink extends AbstractBaseRequest<EditChatSubscriptionInviteLink, EditChatSubscriptionInviteLink> {

    public EditChatSubscriptionInviteLink(Object chatId, String invite_link, RequestSender requestSender) {
        super(chatId, requestSender, "editChatSubscriptionInviteLink", EditChatSubscriptionInviteLink.class);
        add("invite_link", invite_link);
    }

    public EditChatSubscriptionInviteLink name(String name) {
        return add("name", name);
    }
}
