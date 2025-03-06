package io.github.natanimn.requests;

import io.github.natanimn.types.ChatPermission;

/**
 * Natanim Negash 
 *  3 March 2025
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
