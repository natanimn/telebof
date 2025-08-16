package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * GetChatMemberCount class. Returns an Integer on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#getChatMemberCount
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
