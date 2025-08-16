package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * BanChatMember class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#banChatMember
 */
public class BanChatMember extends AbstractBaseRequest<BanChatMember, Boolean> {

    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param requestSender request sender
     */
    public BanChatMember(Object chat_id, long user_id, RequestSender requestSender){
        super(chat_id, requestSender, "banChatMember", Boolean.class);
        add("user_id", user_id);
    }

    /**
     * Optional
     * @param until_date Date when the user will be unbanned; Unix time.
     *                   If user is banned for more than 366 days or less than 30 seconds from the current time they are considered to be banned forever.
     *                   Applied for supergroups and channels only.
     * @return {@link BanChatMember}
     */
    public BanChatMember untilDate(int until_date) {
        return add("until_date", until_date);
    }

    /**
     * Optional
     * @param revoke_messages Pass True to delete all messages from the chat for the user that is being removed.
     *                        If False, the user will be able to see messages in the group that were sent before the user was removed.
     *                        Always True for supergroups and channels.
     * @return {@link BanChatMember}
     */
    public BanChatMember revokeMessages(boolean revoke_messages){
        return add("revoke_messages", revoke_messages);
    }

}
