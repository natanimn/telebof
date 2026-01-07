package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.ChatPermissions;

/**
 * RestrictChatMember class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#restrictChatMember
 */
public class RestrictChatMember extends AbstractBaseRequest<RestrictChatMember, Boolean> {

    /**
     * Required
     * @param chatId chat id
     * @param userId user id
     * @param permissions permissions
     * @param api api
     */
    public RestrictChatMember(Object chatId, long userId, ChatPermissions permissions, Api api){
        super(chatId, api, "restrictChatMember", Boolean.class);
        parameters.put("user_id", userId);
        parameters.put("permissions", permissions);
    }

    /**
     * Optional
     * @param untilDate Date when restrictions will be lifted for the user; Unix time.
     *                   If user is restricted for more than 366 days or less than 30 seconds from the current time, they are considered to be restricted forever
     * @return {@link RestrictChatMember}
     */
    public RestrictChatMember untilDate(long untilDate){
        parameters.put("until_date", untilDate);
        return this;
    }

    /**
     * Optional
     * @param useIndependentChatPermissions Pass True if chat permissions are set independently.
     *                                         Otherwise, the can_send_other_messages and can_add_web_page_previews permissions will imply
     *                                         the can_send_messages, can_send_audios, can_send_documents, can_send_photos, can_send_videos, can_send_video_notes, and can_send_voice_notes permissions;
     *                                         the can_send_polls permission will imply the can_send_messages permission.
     * @return {@link RestrictChatMember}
     */
    public RestrictChatMember useIndependentChatPermissions(boolean useIndependentChatPermissions){
        return add("use_independent_chat_permissions", useIndependentChatPermissions);
    }

}
