package io.github.natanimn.requests;


/**
 * Natanim Negash
 *  3 March 2025
 */
public class EditChatInviteLink extends CreateChatInviteLink {
    public EditChatInviteLink(Object chatId, String inviteLink, RequestSender requestSender) {
        super(chatId, requestSender, "editChatInviteLink");
        add("invite_link", inviteLink);
    }

}
