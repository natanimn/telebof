package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.ChatInviteLink;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
