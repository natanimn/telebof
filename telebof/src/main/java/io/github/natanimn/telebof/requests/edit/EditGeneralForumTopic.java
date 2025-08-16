package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * EditGeneralForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#editGeneralForumTopic
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
