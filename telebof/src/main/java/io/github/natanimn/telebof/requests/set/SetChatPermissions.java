package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.ChatPermissions;

/**
 * SetChatPermissions class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setChatPermissions
 */
public class SetChatPermissions extends AbstractBaseRequest<SetChatPermissions, Boolean> {
    /**
     * Required
     * @param chatId chat id
     * @param permissions permissions
     * @param api api
     */
    public SetChatPermissions(Object chatId, ChatPermissions permissions, Api api) {
        super(chatId, api, "setChatPermissions", Boolean.class);
        add("permissions", permissions);
    }

    /**
     * Optional
     * @param useIndependentChatPermissions Pass True if chat permissions are set independently.
     *                                         Otherwise, the can_send_other_messages and can_add_web_page_previews permissions will imply the can_send_messages,
     *                                         can_send_audios, can_send_documents, can_send_photos, can_send_videos, can_send_video_notes, and can_send_voice_notes permissions;
     *                                         the can_send_polls permission will imply the can_send_messages permission.
     * @return {@link SetChatPermissions}
     */
    public SetChatPermissions useIndependentChatPermissions(boolean useIndependentChatPermissions){
        return add("use_independent_chat_permissions", useIndependentChatPermissions);
    }

}
