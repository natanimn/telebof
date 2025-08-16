package io.github.natanimn.telebof.requests.send;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.updates.Message;

/**
 *
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class SendMessage extends SendBuilder<SendMessage, Message> {
    /**
     * Required
     * @param chat_id Chat Id
     * @param text test
     * @param requestSender request sender
     */
    public SendMessage(Object chat_id,  String text, RequestSender requestSender) {
        super(chat_id, requestSender, "sendMessage");
        add("text", text);
     }

}
