package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.UserChatBoosts;

/**
 * GetUserChatBoosts class. Returns {@link UserChatBoosts} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#getUserChatBoosts
 */
public class GetUserChatBoosts extends AbstractBaseRequest<GetUserChatBoosts, UserChatBoosts> {
    /**
     * Required
     * @param chatId chat id
     * @param userId user id
     * @param api api
     */
    public GetUserChatBoosts(Object chatId, long userId, Api api){
        super(chatId, api, "getUserChatBoosts", UserChatBoosts.class);
        add("user_id", userId);
    }

}
