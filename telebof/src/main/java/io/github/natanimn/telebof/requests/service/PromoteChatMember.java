package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * PromoteChatMember class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#promoteChatMember
 */
public class PromoteChatMember extends AbstractBaseRequest<PromoteChatMember, Boolean> {

    /**
     * Required
     * @param chatId chat id
     * @param userId user id
     * @param api api
     */
    public PromoteChatMember(Object chatId, long userId, Api api) {
        super(chatId, api, "promoteChatMember", Boolean.class);
        add("user_id", userId);
    }

    /**
     * Optional
     * @param isAnonymous Pass True if the administrator's presence in the chat is hidden
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember isAnonymous(boolean isAnonymous) {
        return add("is_anonymous", isAnonymous);
    }

    /**
     * Optional
     * @param canManageChat Pass True if the administrator can access the chat event log, get boost list, see hidden supergroup and channel members, report spam messages,
     *                        ignore slow mode, and send messages to the chat without paying Telegram Stars. Implied by any other administrator privilege.
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canManageChat(boolean canManageChat) {
        return add("can_manage_chat", canManageChat);
    }

    /**
     * Optional
     * @param canPostMessages Pass True if the administrator can post messages in the channel, approve suggested posts, or access channel statistics; for channels only
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canPostMessages(boolean canPostMessages) {
        return add("can_post_messages", canPostMessages);
    }

    /**
     * Optional
     * @param canEditMessages Pass True if the administrator can edit messages of other users and can pin messages; for channels only
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canEditMessages(boolean canEditMessages) {
        return add("can_edit_messages", canEditMessages);
    }

    /**
     * Optional
     * @param canDeleteMessages Pass True if the administrator can delete messages of other users
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canDeleteMessages(boolean canDeleteMessages) {
        return add("can_delete_messages", canDeleteMessages);
    }

    /**
     * Optional
     * @param canManageVideoChats Pass True if the administrator can manage video chats
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canManageVideoChats(boolean canManageVideoChats) {
        return add("can_manage_video_chats", canManageVideoChats);
    }

    /**
     * Optional
     * @param canRestrictMembers Pass True if the administrator can restrict, ban or unban chat members, or access supergroup statistics
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canRestrictMembers(boolean canRestrictMembers) {
        return add("can_restrict_members", canRestrictMembers);
    }

    /**
     * Optional
     * @param canPromoteMembers Pass True if the administrator can add new administrators with a subset of their own privileges or demote administrators that they have promoted,
     *                            directly or indirectly (promoted by administrators that were appointed by him)
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canPromoteMembers(boolean canPromoteMembers) {
        return add("can_promote_members", canPromoteMembers);
    }

    /**
     * Optional
     * @param canChangeInfo Pass True if the administrator can change chat title, photo and other settings
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canChangeInfo(boolean canChangeInfo) {
        return add("can_change_info", canChangeInfo);
    }

    /**
     * Optional
     * @param canInviteUsers Pass True if the administrator can invite new users to the chat
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canInviteUsers(boolean canInviteUsers) {
        return add("can_invite_users", canInviteUsers);
    }

    /**
     * Optional
     * @param canPinMessages Pass True if the administrator can pin messages; for supergroups only
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canPinMessages(boolean canPinMessages) {
        return add("can_pin_messages", canPinMessages);
    }

    /**
     * Optional
     * @param canManageTopics Pass True if the user is allowed to create, rename, close, and reopen forum topics; for supergroups only
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canManageTopics(boolean canManageTopics) {
        return add("can_manage_topics", canManageTopics);
    }

    /**
     * Optional
     * @param canPostStories Pass True if the administrator can post stories to the chat
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canPostStories(boolean canPostStories){
        return add("can_post_stories", canPostStories);
    }

    /**
     * Optional
     * @param canEditStories Pass True if the administrator can edit stories posted by other users, post stories to the chat page,
     *                         pin chat stories, and access the chat's story archive
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canEditStories(boolean canEditStories){
        return add("can_edit_stories", canEditStories);
    }

    /**
     * Optional
     * @param canDeleteStories Pass True if the administrator can delete stories posted by other users
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canDeleteStories(boolean canDeleteStories){
        return add("can_delete_stories", canDeleteStories);
    }

    /**
     * Optional
     * @param canManageDirectMessages Pass True if the administrator can manage direct messages within the channel and decline suggested posts; for channels only
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canManageDirectMessages(boolean canManageDirectMessages){
        return add("can_manage_direct_messages", canManageDirectMessages);
    }
}
