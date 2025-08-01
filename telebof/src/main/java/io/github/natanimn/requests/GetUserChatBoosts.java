package io.github.natanimn.requests;

import io.github.natanimn.types.chat_and_user.UserChatBoosts;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetUserChatBoosts extends AbstractBaseRequest<GetUserChatBoosts, UserChatBoosts> {
    public GetUserChatBoosts(Object chat_id, long user_id, RequestSender requestSender){
        super(chat_id, requestSender, "getUserChatBoosts", UserChatBoosts.class);
        add("user_id", user_id);
    }

}
