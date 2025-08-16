package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * SetChatDescription class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setChatDescription
 */
public class SetChatDescription extends AbstractBaseRequest<SetChatDescription, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param title title
     * @param requestSender request sender
     */
    public SetChatDescription(Object chat_id, String title, RequestSender requestSender) {
        super(chat_id, requestSender, "setChatDescription", Boolean.class);
        add("description", title);
    }

}
