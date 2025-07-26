package io.github.natanimn.requests;

import io.github.natanimn.types.chat_and_user.ChatPermission;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SetChatPermissions extends AbstractBaseRequest<SetChatPermissions, Boolean> {
    public SetChatPermissions(Object chatId, ChatPermission permissions, RequestSender requestSender) {
        super(chatId, requestSender, "setChatPermissions");
        add("permissions", permissions);
    }

}
