package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.ChatPermissions;

/**
 * SetChatPermissions class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setChatPermissions
 */
public class SetChatPermissions extends AbstractBaseRequest<SetChatPermissions, Boolean> {
    /**
     * Required
     * @param chat_id chat id
     * @param permissions permissions
     * @param api api
     */
    public SetChatPermissions(Object chat_id, ChatPermissions permissions, Api api) {
        super(chat_id, api, "setChatPermissions", Boolean.class);
        add("permissions", permissions);
    }

    /**
     * Optional
     * @param use_independent_chat_permissions Pass True if chat permissions are set independently.
     *                                         Otherwise, the can_send_other_messages and can_add_web_page_previews permissions will imply the can_send_messages,
     *                                         can_send_audios, can_send_documents, can_send_photos, can_send_videos, can_send_video_notes, and can_send_voice_notes permissions;
     *                                         the can_send_polls permission will imply the can_send_messages permission.
     * @return {@link SetChatPermissions}
     */
    public SetChatPermissions useIndependentChatPermissions(boolean use_independent_chat_permissions){
        return add("use_independent_chat_permissions", use_independent_chat_permissions);
    }

}
