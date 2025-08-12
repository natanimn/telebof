package io.github.natanimn.requests.create;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.chat_and_user.ChatInviteLink;

/**
 * CreateChatInviteLink class
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#createChatInviteLink}
 */
public class CreateChatInviteLink extends AbstractBaseRequest<CreateChatInviteLink, ChatInviteLink> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public CreateChatInviteLink(Object chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "createChatInviteLink", ChatInviteLink.class);
    }

    /**
     * Optional
     * @param name Invite link name; 0-32 characters
     * @return {@link CreateChatInviteLink}
     */
    public CreateChatInviteLink name(String name) {
        return add("name", name);
    }

    /**
     * optional
     * @param expire_date Point in time (Unix timestamp) when the link will expire
     * @return {@link CreateChatInviteLink}
     */
    public CreateChatInviteLink expireDate(int expire_date) {
        return add("expire_date", expire_date);
    }

    /**
     * Optional
     * @param member_limit The maximum number of users that can be members of the chat simultaneously after joining the chat via this invite link; 1-99999
     * @return {@link CreateChatInviteLink}
     */
    public CreateChatInviteLink memberLimit(int member_limit) {
        return add("member_limit", member_limit);
    }

    /**
     * Optional
     * @param creates_join_request True, if users joining the chat via the link need to be approved by chat administrators.
     *                             If True, member_limit can't be specified
     * @return {@link CreateChatInviteLink}
     */
    public CreateChatInviteLink createsJoinRequest(boolean creates_join_request) {
        return add("creates_join_request", creates_join_request);
    }

}
