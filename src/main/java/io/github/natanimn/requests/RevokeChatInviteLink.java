package io.github.natanimn.requests;

import io.github.natanimn.types.ChatInviteLink;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class RevokeChatInviteLink extends AbstractBaseRequest<RevokeChatInviteLink, ChatInviteLink> {
    public RevokeChatInviteLink(Object chatId, String inviteLink, RequestSender requestSender) {
        super(chatId, requestSender, "revokeChatInviteLink", ChatInviteLink.class);
        add("invite_link", inviteLink);
    }

}
