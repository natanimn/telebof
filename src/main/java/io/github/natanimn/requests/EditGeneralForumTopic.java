package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class EditGeneralForumTopic extends AbstractBaseRequest<EditGeneralForumTopic, Boolean> {
    public EditGeneralForumTopic(Object chatId, String name, RequestSender requestSender) {
        super(chatId, requestSender, "editGeneralForumTopic");
        add("name", name);
    }

}
