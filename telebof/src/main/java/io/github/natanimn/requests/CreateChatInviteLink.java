package io.github.natanimn.requests;

import io.github.natanimn.types.chat_and_user.ChatInviteLink;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class CreateChatInviteLink extends AbstractBaseRequest<CreateChatInviteLink, ChatInviteLink> {
    public CreateChatInviteLink(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "createChatInviteLink", ChatInviteLink.class);
    }
    CreateChatInviteLink(Object chatId, RequestSender requestSender, String methodName){
        super(chatId, requestSender, methodName, ChatInviteLink.class);
    }

    public CreateChatInviteLink name(String name) {
        return add("name", name);
    }

    public CreateChatInviteLink expireDate(int expireDate) {
        return add("expire_date", expireDate);
    }

    public CreateChatInviteLink memberLimit(int memberLimit) {
        return add("member_limit", memberLimit);
    }

    public CreateChatInviteLink createsJoinRequest(boolean createsJoinRequest) {
        return add("creates_join_request", createsJoinRequest);
    }

}
