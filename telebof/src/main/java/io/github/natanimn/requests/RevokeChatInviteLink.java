package io.github.natanimn.requests;

import io.github.natanimn.types.chat_and_user.ChatInviteLink;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class RevokeChatInviteLink extends AbstractBaseRequest<RevokeChatInviteLink, ChatInviteLink> {
    public RevokeChatInviteLink(Object chatId, String inviteLink, RequestSender requestSender) {
        super(chatId, requestSender, "revokeChatInviteLink", ChatInviteLink.class);
        add("invite_link", inviteLink);
    }

}
