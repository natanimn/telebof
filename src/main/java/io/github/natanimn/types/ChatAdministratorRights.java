package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;


/**
 * Natanim Negash
 *  3 March 2025
 */
public class ChatAdministratorRights implements Serializable {
    public Boolean is_anonymous, can_manage_chat, can_delete_messages, can_manage_video_chats,
            can_restrict_members, can_promote_members, can_change_info, can_invite_users,
            can_post_messages, can_edit_messages, can_pin_messages, can_manage_topics,
            can_post_stories, can_edit_stories, can_delete_stories;

    public ChatAdministratorRights isAnonymous(boolean isAnonymous) {
        this.is_anonymous = isAnonymous;
        return this;
    }

    public ChatAdministratorRights canManageChat(boolean canManageChat) {
        this.can_manage_chat = canManageChat;
        return this;
    }

    public ChatAdministratorRights canPostMessages(boolean canPostMessages) {
        this.can_post_messages = canPostMessages;
        return this;
    }

    public ChatAdministratorRights canEditMessages(boolean canEditMessages) {
        this.can_edit_messages = canEditMessages;
        return this;
    }

    public ChatAdministratorRights canDeleteMessages(boolean canDeleteMessages) {
        this.can_delete_messages = canDeleteMessages;
        return this;
    }

    public ChatAdministratorRights canManageVideoChats(boolean canManageVideoChats) {
        this.can_manage_video_chats = canManageVideoChats;
        return this;
    }

    public ChatAdministratorRights canRestrictMembers(boolean canRestrictMembers) {
        this.can_restrict_members = canRestrictMembers;
        return this;
    }

    public ChatAdministratorRights canPromoteMembers(boolean canPromoteMembers) {
        this.can_promote_members = canPromoteMembers;
        return this;
    }

    public ChatAdministratorRights canChangeInfo(boolean canChangeInfo) {
        this.can_change_info = canChangeInfo;
        return this;
    }

    public ChatAdministratorRights canInviteUsers(boolean canInviteUsers) {
        this.can_invite_users = canInviteUsers;
        return this;
    }

    public ChatAdministratorRights canPinMessages(boolean canPinMessages) {
        this.can_pin_messages = canPinMessages;
        return this;
    }

    public ChatAdministratorRights canManageTopics(boolean canManageTopics) {
        this.can_manage_topics = canManageTopics;
        return this;
    }

    public ChatAdministratorRights canPostStories(boolean canPostStories){
        this.can_post_stories = canPostStories;
        return this;
    }

    public ChatAdministratorRights canEditStories(boolean canEditStories){
        this.can_edit_stories = canEditStories;
        return this;
    }

    public ChatAdministratorRights canDeleteStories(boolean can_delete_stories){
        this.can_delete_stories = can_delete_stories;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatAdministratorRights that = (ChatAdministratorRights) object;
        return Objects.equals(is_anonymous, that.is_anonymous) &&
                Objects.equals(can_manage_chat, that.can_manage_chat) &&
                Objects.equals(can_delete_messages, that.can_delete_messages) &&
                Objects.equals(can_manage_video_chats, that.can_manage_video_chats) &&
                Objects.equals(can_restrict_members, that.can_restrict_members) &&
                Objects.equals(can_promote_members, that.can_promote_members) &&
                Objects.equals(can_change_info, that.can_change_info) &&
                Objects.equals(can_invite_users, that.can_invite_users) &&
                Objects.equals(can_post_messages, that.can_post_messages) &&
                Objects.equals(can_edit_messages, that.can_edit_messages) &&
                Objects.equals(can_pin_messages, that.can_pin_messages) &&
                Objects.equals(can_manage_topics, that.can_manage_topics) &&
                Objects.equals(can_post_stories, that.can_post_stories) &&
                Objects.equals(can_edit_stories, that.can_edit_stories) &&
                Objects.equals(can_delete_stories, that.can_delete_stories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(is_anonymous, can_manage_chat, can_delete_messages, can_manage_video_chats,
                can_restrict_members, can_promote_members, can_change_info, can_invite_users, can_post_messages,
                can_edit_messages, can_pin_messages, can_manage_topics, can_post_stories, can_edit_stories, can_delete_stories);
    }
}
