package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;

/**
 * BanChatMember class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#banChatMember
 */
public class BanChatMember extends AbstractBaseRequest<BanChatMember, Boolean> {

    /**
     * Required
     * @param chatId chat id
     * @param user_id user id
     * @param api api
     */
    public BanChatMember(Object chatId, long userId, Api api){
        super(chatId, api, "banChatMember", Boolean.class);
        add("user_id", userId);
    }

    /**
     * Optional
     * @param untilDate Date when the user will be unbanned; Unix time.
     *                   If user is banned for more than 366 days or less than 30 seconds from the current time they are considered to be banned forever.
     *                   Applied for supergroups and channels only.
     * @return {@link BanChatMember}
     */
    public BanChatMember untilDate(int untilDate) {
        return add("until_date", untilDate);
    }

    /**
     * Optional
     * @param revokeMessages Pass True to delete all messages from the chat for the user that is being removed.
     *                        If False, the user will be able to see messages in the group that were sent before the user was removed.
     *                        Always True for supergroups and channels.
     * @return {@link BanChatMember}
     */
    public BanChatMember revokeMessages(boolean revokeMessages){
        return add("revoke_messages", revokeMessages);
    }

}
