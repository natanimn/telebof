package io.github.natanimn.requests.edit;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * EditGeneralForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#editGeneralForumTopic}
 */
public class EditGeneralForumTopic extends AbstractBaseRequest<EditGeneralForumTopic, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param name name
     * @param requestSender request sender
     */
    public EditGeneralForumTopic(Object chat_id, String name, RequestSender requestSender) {
        super(chat_id, requestSender, "editGeneralForumTopic", Boolean.class);
        add("name", name);
    }

}
