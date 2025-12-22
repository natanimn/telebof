package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * GetChatMemberCount class. Returns an Integer on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#getChatMemberCount
 */
public class GetChatMemberCount extends AbstractBaseRequest<GetChatMemberCount, Integer> {
    /**
     * Required
     * @param chatId chat id
     * @param api api
     */
    public GetChatMemberCount(Object chatId, Api api) {
        super(chatId, api, "getChatMemberCount", Integer.class);
    }

}
