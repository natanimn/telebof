package io.github.natanimn.requests;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class BanChatSenderChat extends AbstractBaseRequest<BanChatSenderChat, Boolean> {
    public BanChatSenderChat(Object chatId, long senderChatId, RequestSender requestSender) {
        super(chatId, requestSender, "banChatSenderChat");
        add("sender_chat_id", senderChatId);
    }

}
