package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;

/**
 * PromoteChatMember class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#promoteChatMember
 */
public class PromoteChatMember extends AbstractBaseRequest<PromoteChatMember, Boolean> {

    /**
     * Required
     * @param chat_id chat id
     * @param user_id user id
     * @param requestSender request sender
     */
    public PromoteChatMember(Object chat_id, long user_id, RequestSender requestSender) {
        super(chat_id, requestSender, "promoteChatMember", Boolean.class);
        add("user_id", user_id);
    }

    /**
     * Optional
     * @param is_anonymous Pass True if the administrator's presence in the chat is hidden
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember isAnonymous(boolean is_anonymous) {
        return add("is_anonymous", is_anonymous);
    }

    /**
     * Optional
     * @param can_manage_chat Pass True if the administrator can access the chat event log, get boost list, see hidden supergroup and channel members, report spam messages,
     *                        ignore slow mode, and send messages to the chat without paying Telegram Stars. Implied by any other administrator privilege.
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canManageChat(boolean can_manage_chat) {
        return add("can_manage_chat", can_manage_chat);
    }

    /**
     * Optional
     * @param can_post_messages Pass True if the administrator can post messages in the channel, approve suggested posts, or access channel statistics; for channels only
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canPostMessages(boolean can_post_messages) {
        return add("can_post_messages", can_post_messages);
    }

    /**
     * Optional
     * @param can_edit_messages Pass True if the administrator can edit messages of other users and can pin messages; for channels only
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canEditMessages(boolean can_edit_messages) {
        return add("can_edit_messages", can_edit_messages);
    }

    /**
     * Optional
     * @param can_delete_messages Pass True if the administrator can delete messages of other users
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canDeleteMessages(boolean can_delete_messages) {
        return add("can_delete_messages", can_delete_messages);
    }

    /**
     * Optional
     * @param can_manage_video_chats Pass True if the administrator can manage video chats
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canManageVideoChats(boolean can_manage_video_chats) {
        return add("can_manage_video_chats", can_manage_video_chats);
    }

    /**
     * Optional
     * @param can_restrict_members Pass True if the administrator can restrict, ban or unban chat members, or access supergroup statistics
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember can_restrict_members(boolean can_restrict_members) {
        return add("can_restrict_members", can_restrict_members);
    }

    /**
     * Optional
     * @param can_promote_members Pass True if the administrator can add new administrators with a subset of their own privileges or demote administrators that they have promoted,
     *                            directly or indirectly (promoted by administrators that were appointed by him)
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember can_promote_members(boolean can_promote_members) {
        return add("can_promote_members", can_promote_members);
    }

    /**
     * Optional
     * @param can_change_info Pass True if the administrator can change chat title, photo and other settings
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canChangeInfo(boolean can_change_info) {
        return add("can_change_info", can_change_info);
    }

    /**
     * Optional
     * @param can_invite_users Pass True if the administrator can invite new users to the chat
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canInviteUsers(boolean can_invite_users) {
        return add("can_invite_users", can_invite_users);
    }

    /**
     * Optional
     * @param can_pin_messages Pass True if the administrator can pin messages; for supergroups only
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canPinMessages(boolean can_pin_messages) {
        return add("can_pin_messages", can_pin_messages);
    }

    /**
     * Optional
     * @param can_manage_topics Pass True if the user is allowed to create, rename, close, and reopen forum topics; for supergroups only
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canManageTopics(boolean can_manage_topics) {
        return add("can_manage_topics", can_manage_topics);
    }

    /**
     * Optional
     * @param can_post_stories Pass True if the administrator can post stories to the chat
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canPostStories(boolean can_post_stories){
        return add("can_post_stories", can_post_stories);
    }

    /**
     * Optional
     * @param can_edit_stories Pass True if the administrator can edit stories posted by other users, post stories to the chat page,
     *                         pin chat stories, and access the chat's story archive
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canEditStories(boolean can_edit_stories){
        return add("can_edit_stories", can_edit_stories);
    }

    /**
     * Optional
     * @param can_delete_stories Pass True if the administrator can delete stories posted by other users
     * @return {@link PromoteChatMember}
     */
    public PromoteChatMember canDeleteStories(boolean can_delete_stories){
        return add("can_delete_stories", can_delete_stories);
    }

}
