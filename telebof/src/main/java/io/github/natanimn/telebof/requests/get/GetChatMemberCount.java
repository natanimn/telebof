package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

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
     * @param api api
     */
    public GetChatMemberCount(Object chat_id, Api api) {
        super(chat_id, api, "getChatMemberCount", Integer.class);
    }

}
