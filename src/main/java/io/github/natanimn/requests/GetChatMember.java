package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.ChatMember;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetChatMember extends AbstractBaseRequest<GetChatMember, ChatMember> {
    public GetChatMember(Object chatId, long userId, RequestSender requestSender) {
        super(chatId, requestSender, "getChatMember", ChatMember.class);
        add("user_id", userId);
    }

}
