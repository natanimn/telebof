package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class BanChatSenderChat extends AbstractBaseRequest<BanChatSenderChat, Boolean> {
    public BanChatSenderChat(Object chatId, long senderChatId, RequestSender requestSender) {
        super(chatId, requestSender, "banChatSenderChat");
        add("sender_chat_id", senderChatId);
    }

}
