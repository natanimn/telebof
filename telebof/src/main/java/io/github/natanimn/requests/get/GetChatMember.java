package io.github.natanimn.requests.get;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.chat_and_user.ChatMember;

/**
 * GetChatMember class. Returns {@link ChatMember} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#getChatMember}
 */
public class GetChatMember extends AbstractBaseRequest<GetChatMember, ChatMember> {
    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param requestSender request sender
     */
    public GetChatMember(Object chat_id, long user_id, RequestSender requestSender) {
        super(chat_id, requestSender, "getChatMember", ChatMember.class);
        add("user_id", user_id);
    }

}
