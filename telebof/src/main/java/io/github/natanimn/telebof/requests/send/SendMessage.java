package io.github.natanimn.telebof.requests.send;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.updates.Message;

/**
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SendMessage extends SendBuilder<SendMessage, Message> {
    /**
     * Required
     * @param chatId Chat Id
     * @param text test
     * @param api api
     */
    public SendMessage(Object chatId,  String text, Api api) {
        super(chatId, api, "sendMessage");
        add("text", text);
     }

}
