package io.github.natanimn.requests.set;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * SetChatTitle class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#setChatTitle}
 */
public class SetChatTitle extends AbstractBaseRequest<SetChatTitle, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param title title
     * @param requestSender request sender
     */
    public SetChatTitle(Object chat_id, String title, RequestSender requestSender) {
        super(chat_id, requestSender, "setChatTitle", Boolean.class);
        add("title", title);
    }

}
