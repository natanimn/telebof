package io.github.natanimn.requests.service;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.chat_and_user.ChatPermissions;

/**
 * RestrictChatMember class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#restrictChatMember}
 */
public class RestrictChatMember extends AbstractBaseRequest<RestrictChatMember, Boolean> {

    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param permissions permissions
     * @param requestSender request sender
     */
    public RestrictChatMember(Object chat_id, long user_id, ChatPermissions permissions, RequestSender requestSender){
        super(chat_id, requestSender, "restrictChatMember", Boolean.class);
        parameters.put("user_id", user_id);
        parameters.put("permissions", permissions);
    }

    /**
     * Optional
     * @param until_date Date when restrictions will be lifted for the user; Unix time.
     *                   If user is restricted for more than 366 days or less than 30 seconds from the current time, they are considered to be restricted forever
     * @return {@link RestrictChatMember}
     */
    public RestrictChatMember untilDate(long until_date){
        parameters.put("until_date", until_date);
        return this;
    }

    /**
     * Optional
     * @param use_independent_chat_permissions Pass True if chat permissions are set independently.
     *                                         Otherwise, the can_send_other_messages and can_add_web_page_previews permissions will imply
     *                                         the can_send_messages, can_send_audios, can_send_documents, can_send_photos, can_send_videos, can_send_video_notes, and can_send_voice_notes permissions;
     *                                         the can_send_polls permission will imply the can_send_messages permission.
     * @return {@link RestrictChatMember}
     */
    public RestrictChatMember useIndependentChatPermissions(boolean use_independent_chat_permissions){
        return add("use_independent_chat_permissions", use_independent_chat_permissions);
    }

}
