package io.github.natanimn.telebof.types.chat_and_user;

import java.io.Serializable;
import java.util.Objects;


/**
 * Represents the rights of an administrator in a chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.2.0
 */
public class ChatAdministratorRights implements Serializable {
    /**
     * True, if the user's presence in the chat is hidden
     */
    public Boolean is_anonymous;

    /**
     * True, if the administrator can access the chat event log, get boost list, see hidden supergroup and channel members,
     * report spam messages, ignore slow mode, and send messages to the chat without paying Telegram Stars. Implied by any other administrator privilege.
     */
    public Boolean can_manage_chat;

    /**
     * True, if the administrator can delete messages of other user
     */
    public Boolean can_delete_messages;

    /**
     * True, if the administrator can manage video chats
     */
    public Boolean can_manage_video_chats;

    /**
     * True, if the administrator can restrict, ban or unban chat members, or access supergroup statistics
     */
    public Boolean can_restrict_members;

    /**
     * True, if the administrator can add new administrators with a subset of their own privileges or demote administrators that they have promoted,
     * directly or indirectly (promoted by administrators that were appointed by the user)
     */
    public Boolean can_promote_members;

    /**
     * True, if the user is allowed to change the chat title, photo and other settings
     */
    public Boolean can_change_info;

    /**
     * True, if the user is allowed to invite new users to the chat
     */
    public Boolean can_invite_users;

    /**
     * True, if the administrator can post messages in the channel, approve suggested posts, or access channel statistics; for channels only
     */
    public Boolean can_post_messages;

    /**
     * True, if the administrator can edit messages of other users and can pin messages; for channels only
     */
    public Boolean can_edit_messages;

    /**
     * True, if the user is allowed to pin messages; for groups and supergroups only
     */
    public Boolean can_pin_messages;

    /**
     * True, if the user is allowed to create, rename, close, and reopen forum topics; for supergroups only
     */
    public Boolean can_manage_topics;

    /**
     * True, if the administrator can post stories to the chat
     */
    public Boolean can_post_stories;

    /**
     * True, if the administrator can edit stories posted by other users, post stories to the chat page, pin chat stories, and access the chat's story archive
     */
    public Boolean can_edit_stories;

    /**
     * True, if the administrator can delete stories posted by other users
     */
    public Boolean can_delete_stories;

    /**
     * Optional. True, if the administrator can manage direct messages of the channel and decline suggested posts; for channels only
     */
    public Boolean can_manage_direct_messages;

    /**
     * Setter method
     * @param is_anonymous makes the user's presence anonymous/hidden or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights isAnonymous(boolean is_anonymous) {
        this.is_anonymous = is_anonymous;
        return this;
    }

    /**
     * Setter method
     * @param can_manage_chat whether the admin can manage chat or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canManageChat(boolean can_manage_chat) {
        this.can_manage_chat = can_manage_chat;
        return this;
    }

    /**
     * Setter method
     * @param can_post_messages whether the user can send message or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canPostMessages(boolean can_post_messages) {
        this.can_post_messages = can_post_messages;
        return this;
    }

    /**
     * Setter method
     * @param can_edit_messages whether the admin can edit messages or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canEditMessages(boolean can_edit_messages) {
        this.can_edit_messages = can_edit_messages;
        return this;
    }

    /**
     * Setter method
     * @param can_delete_messages whether the admin can delete messages or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canDeleteMessages(boolean can_delete_messages) {
        this.can_delete_messages = can_delete_messages;
        return this;
    }

    /**
     * Setter method
     * @param can_manage_video_chats whether the admin can manage video chats or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canManageVideoChats(boolean can_manage_video_chats) {
        this.can_manage_video_chats = can_manage_video_chats;
        return this;
    }

    /**
     * Setter method
     * @param can_restrict_members whether the admin can restrict members or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canRestrictMembers(boolean can_restrict_members) {
        this.can_restrict_members = can_restrict_members;
        return this;
    }

    /**
     * Setter method
     * @param can_promote_members whether the admin can promote members or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canPromoteMembers(boolean can_promote_members) {
        this.can_promote_members = can_promote_members;
        return this;
    }

    /**
     * Setter method
     * @param can_change_info whether the admin can change info or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canChangeInfo(boolean can_change_info) {
        this.can_change_info = can_change_info;
        return this;
    }

    /**
     * Setter method
     * @param can_invite_users whether the user can invite users or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canInviteUsers(boolean can_invite_users) {
        this.can_invite_users = can_invite_users;
        return this;
    }

    /**
     * Setter method
     * @param can_pin_messages whether the admin can pin messages or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canPinMessages(boolean can_pin_messages) {
        this.can_pin_messages = can_pin_messages;
        return this;
    }

    /**
     * Setter method
     * @param can_manage_topics whether the admin can manage topics or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canManageTopics(boolean can_manage_topics) {
        this.can_manage_topics = can_manage_topics;
        return this;
    }

    /**
     * Setter method
     * @param can_post_stories whether the admin can post stories or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canPostStories(boolean can_post_stories){
        this.can_post_stories = can_post_stories;
        return this;
    }

    /**
     * Setter method
     * @param can_edit_stories whether the admin can edit stories or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canEditStories(boolean can_edit_stories){
        this.can_edit_stories = can_edit_stories;
        return this;
    }

    /**
     * Setter method
     * @param can_delete_stories whether the admin can delete stories or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canDeleteStories(boolean can_delete_stories){
        this.can_delete_stories = can_delete_stories;
        return this;
    }

    /**
     * Setter method
     * @param can_manage_direct_messages whether the admin can manage direct messages or not
     * @return {@link ChatAdministratorRights}
     */
    public ChatAdministratorRights canManageDirectMessages(boolean can_manage_direct_messages){
        this.can_manage_direct_messages = can_manage_direct_messages;
        return this;
    }

}
