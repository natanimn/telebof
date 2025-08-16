package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.chat_and_user.UserChatBoosts;

/**
 * GetUserChatBoosts class. Returns {@link UserChatBoosts} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#getUserChatBoosts
 */
public class GetUserChatBoosts extends AbstractBaseRequest<GetUserChatBoosts, UserChatBoosts> {
    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param requestSender request sender
     */
    public GetUserChatBoosts(Object chat_id, long user_id, RequestSender requestSender){
        super(chat_id, requestSender, "getUserChatBoosts", UserChatBoosts.class);
        add("user_id", user_id);
    }

}
