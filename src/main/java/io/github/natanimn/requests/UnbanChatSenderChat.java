package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class UnbanChatSenderChat extends AbstractBaseRequest<UnbanChatSenderChat, Boolean> {
    public UnbanChatSenderChat(Object chatId, long senderChatId, RequestSender requestSender) {
        super(chatId, requestSender, "unbanChatSenderChat");
        add("sender_chat_id", senderChatId);
    }

}
