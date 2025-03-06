package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class UnbanChatMember extends AbstractBaseRequest<UnbanChatMember, Boolean> {
    public UnbanChatMember(Object chatId, long userId, RequestSender requestSender) {
        super(chatId, requestSender, "unbanChatMember");
        add("user_id", userId);
    }

    public UnbanChatMember onlyIfBanned(boolean onlyIfBanned){
        return add("only_if_banned", onlyIfBanned);
    }

}
