package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.ChatMember;

/**
 * GetChatMember class. Returns {@link ChatMember} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#getChatMember
 */
public class GetChatMember extends AbstractBaseRequest<GetChatMember, ChatMember> {
    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param api api
     */
    public GetChatMember(Object chat_id, long user_id, Api api) {
        super(chat_id, api, "getChatMember", ChatMember.class);
        add("user_id", user_id);
    }

}
