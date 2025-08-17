package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * UnbanChatMember class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#unbanChatMember
 */
public class UnbanChatMember extends AbstractBaseRequest<UnbanChatMember, Boolean> {

    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param api api
     */
    public UnbanChatMember(Object chat_id, long user_id, Api api) {
        super(chat_id, api, "unbanChatMember", Boolean.class);
        add("user_id", user_id);
    }

    /**
     * Optional
     * @param only_if_banned Do nothing if the user is not banned
     * @return {@link UnbanChatMember}
     */
    public UnbanChatMember onlyIfBanned(boolean only_if_banned){
        return add("only_if_banned", only_if_banned);
    }

}
