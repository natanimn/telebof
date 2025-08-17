package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.ChatFullInfo;

/**
 * GetChat class. Returns {@link ChatFullInfo} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#getChat
 */
public class GetChat extends AbstractBaseRequest<GetChat, ChatFullInfo> {
    /**
     * Required
     * @param chat_id chat id
     * @param api api
     */
    public GetChat(Object chat_id, Api api) {
        super(chat_id, api, "getChat", ChatFullInfo.class);
    }

}
