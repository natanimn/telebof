package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.chat_and_user.ChatInviteLink;

/**
 * EditChatInviteLink class
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#editChatInviteLink
 */
public class EditChatInviteLink extends AbstractBaseRequest<EditChatInviteLink, ChatInviteLink> {
    /**
     * Required
     * @param chat_id chat id
     * @param invite_link invite link
     * @param requestSender request sender
     */
    public EditChatInviteLink(Object chat_id, String invite_link, RequestSender requestSender) {
        super(chat_id, requestSender, "editChatInviteLink", ChatInviteLink.class);
        add("invite_link", invite_link);
    }

    /**
     * Optional
     * @param name Invite link name; 0-32 characters
     * @return {@link EditChatInviteLink}
     */
    public EditChatInviteLink name(String name) {
        return add("name", name);
    }

    /**
     * optional
     * @param expire_date Point in time (Unix timestamp) when the link will expire
     * @return {@link EditChatInviteLink}
     */
    public EditChatInviteLink expireDate(int expire_date) {
        return add("expire_date", expire_date);
    }

    /**
     * Optional
     * @param member_limit The maximum number of users that can be members of the chat simultaneously after joining the chat via this invite link; 1-99999
     * @return {@link EditChatInviteLink}
     */
    public EditChatInviteLink memberLimit(int member_limit) {
        return add("member_limit", member_limit);
    }

    /**
     * Optional
     * @param creates_join_request True, if users joining the chat via the link need to be approved by chat administrators.
     *                             If True, member_limit can't be specified
     * @return {@link EditChatInviteLink}
     */
    public EditChatInviteLink createsJoinRequest(boolean creates_join_request) {
        return add("creates_join_request", creates_join_request);
    }

}
