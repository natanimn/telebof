package io.github.natanimn.requests;

import io.github.natanimn.types.ChatPermission;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetChatPermissions extends AbstractBaseRequest<SetChatPermissions, Boolean> {
    public SetChatPermissions(Object chatId, ChatPermission permissions, RequestSender requestSender) {
        super(chatId, requestSender, "setChatPermissions");
        add("permissions", permissions);
    }

}
