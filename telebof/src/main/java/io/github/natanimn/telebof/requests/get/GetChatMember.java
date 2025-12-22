package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.ChatMember;

/**
 * GetChatMember class. Returns {@link ChatMember} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#getChatMember
 */
public class GetChatMember extends AbstractBaseRequest<GetChatMember, ChatMember> {
    /**
     * Required
     * @param chatId chat id
     * @param userId user id
     * @param api api
     */
    public GetChatMember(Object chatId, long userId, Api api) {
        super(chatId, api, "getChatMember", ChatMember.class);
        add("user_id", userId);
    }

}
