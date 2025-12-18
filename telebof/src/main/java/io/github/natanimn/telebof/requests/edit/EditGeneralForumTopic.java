package io.github.natanimn.telebof.requests.edit;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * EditGeneralForumTopic class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#editGeneralForumTopic
 */
public class EditGeneralForumTopic extends AbstractBaseRequest<EditGeneralForumTopic, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param name name
     * @param api api
     */
    public EditGeneralForumTopic(Object chatId, String name, Api api) {
        super(chatId, api, "editGeneralForumTopic", Boolean.class);
        add("name", name);
    }

}
