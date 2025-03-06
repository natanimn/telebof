package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.ChatMember;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class GetChatMember extends AbstractBaseRequest<GetChatMember, ChatMember> {
    public GetChatMember(Object chatId, long userId, RequestSender requestSender) {
        super(chatId, requestSender, "getChatMember", ChatMember.class);
        add("user_id", userId);
    }

}
