package io.github.natanimn.requests;

import io.github.natanimn.types.Message;
import io.github.natanimn.types.MessageEntity;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SendMessage extends DefaultParameters<SendMessage, Message> {
    public SendMessage(Object chatId,  String text, RequestSender requestSender) {
        super(chatId, requestSender, "sendMessage");
        add("text", text);
        add("allow_sending_without_reply", true);
    }

    public SendMessage entities(MessageEntity[] entities) {
        return add("entities", entities);
    }

}
