package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
