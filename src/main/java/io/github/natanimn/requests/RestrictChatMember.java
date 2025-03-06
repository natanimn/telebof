package io.github.natanimn.requests;

import io.github.natanimn.types.ChatPermission;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class RestrictChatMember extends AbstractBaseRequest<RestrictChatMember, Boolean> {

    public RestrictChatMember(Object chatId, long userId, ChatPermission permissions, RequestSender requestSender){
        super(chatId, requestSender, "restrictChatMember");
        parameters.put("user_id", userId);
        parameters.put("permissions", permissions);
    }


    public RestrictChatMember untilDate(long untilDate){
        parameters.put("until_date", untilDate);
        return this;
    }

}
