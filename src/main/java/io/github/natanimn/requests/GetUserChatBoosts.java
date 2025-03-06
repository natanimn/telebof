package io.github.natanimn.requests;

import io.github.natanimn.types.UserChatBoosts;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetUserChatBoosts extends AbstractBaseRequest<GetUserChatBoosts, UserChatBoosts> {
    public GetUserChatBoosts(Object chat_id, long user_id, RequestSender requestSender){
        super(chat_id, requestSender, "getUserChatBoosts", UserChatBoosts.class);
        add("user_id", user_id);
    }

}
