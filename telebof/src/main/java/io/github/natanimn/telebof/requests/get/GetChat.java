package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.ChatFullInfo;

/**
 * GetChat class. Returns {@link ChatFullInfo} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#getChat
 */
public class GetChat extends AbstractBaseRequest<GetChat, ChatFullInfo> {
    /**
     * Required
     * @param chatId chat id
     * @param api api
     */
    public GetChat(Object chatId, Api api) {
        super(chatId, api, "getChat", ChatFullInfo.class);
    }

}
