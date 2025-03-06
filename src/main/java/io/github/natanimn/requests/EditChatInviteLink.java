package io.github.natanimn.requests;


/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class EditChatInviteLink extends CreateChatInviteLink {
    public EditChatInviteLink(Object chatId, String inviteLink, RequestSender requestSender) {
        super(chatId, requestSender, "editChatInviteLink");
        add("invite_link", inviteLink);
    }

}
