package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class EditGeneralForumTopic extends AbstractBaseRequest<EditGeneralForumTopic, Boolean> {
    public EditGeneralForumTopic(Object chatId, String name, RequestSender requestSender) {
        super(chatId, requestSender, "editGeneralForumTopic");
        add("name", name);
    }

}
