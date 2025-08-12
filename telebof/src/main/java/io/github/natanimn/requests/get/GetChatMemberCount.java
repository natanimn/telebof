package io.github.natanimn.requests.get;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * GetChatMemberCount class. Returns an Integer on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#getChatMemberCount}
 */
public class GetChatMemberCount extends AbstractBaseRequest<GetChatMemberCount, Integer> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public GetChatMemberCount(Object chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "getChatMemberCount", Integer.class);
    }

}
