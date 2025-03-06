package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class BanChatMember extends AbstractBaseRequest<BanChatMember, Boolean> {
    public BanChatMember(Object chatId, long userId, RequestSender requestSender){
        super(chatId, requestSender, "banChatMember");
        add("user_id", userId);
    }

    public BanChatMember untilDate(int untilDate) {
        return add("until_date", untilDate);
    }

    public BanChatMember revokeMessages(boolean revokeMessages){
        return add("revoke_messages", revokeMessages);
    }

}
