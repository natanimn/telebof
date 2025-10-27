package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Represents the rights of an administrator in a chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ChatAdministratorRights implements Serializable {
    @SerializedName("is_anonymous")
    private Boolean isAnonymous;

    @SerializedName("can_manage_chat")
    private Boolean canManageChat;

    @SerializedName("can_delete_messages")
    private Boolean canDeleteMessages;

    @SerializedName("can_manage_video_chats")
    private Boolean canManageVideoChats;

    @SerializedName("can_restrict_members")
    private Boolean canRestrictMembers;

    @SerializedName("can_promote_members")
    private Boolean canPromoteMembers;

    @SerializedName("can_change_info")
    private Boolean canChangeInfo;

    @SerializedName("can_invite_users")
    private Boolean canInviteUsers;

    @SerializedName("can_post_messages")
    private Boolean canPostMessages;

    @SerializedName("can_edit_messages")
    private Boolean canEditMessages;

    @SerializedName("can_pin_messages")
    private Boolean canPinMessages;

    @SerializedName("can_manage_topics")
    private Boolean canManageTopics;

    @SerializedName("can_post_stories")
    private Boolean canPostStories;

    @SerializedName("can_edit_stories")
    private Boolean canEditStories;

    @SerializedName("can_delete_stories")
    private Boolean canDeleteStories;

    @SerializedName("can_manage_direct_messages")
    private Boolean canManageDirectMessages;

    // Setters
    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public void setCanManageChat(Boolean canManageChat) {
        this.canManageChat = canManageChat;
    }

    public void setCanDeleteMessages(Boolean canDeleteMessages) {
        this.canDeleteMessages = canDeleteMessages;
    }

    public void setCanManageVideoChats(Boolean canManageVideoChats) {
        this.canManageVideoChats = canManageVideoChats;
    }

    public void setCanRestrictMembers(Boolean canRestrictMembers) {
        this.canRestrictMembers = canRestrictMembers;
    }

    public void setCanPromoteMembers(Boolean canPromoteMembers) {
        this.canPromoteMembers = canPromoteMembers;
    }

    public void setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
    }

    public void setCanInviteUsers(Boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
    }

    public void setCanPostMessages(Boolean canPostMessages) {
        this.canPostMessages = canPostMessages;
    }

    public void setCanEditMessages(Boolean canEditMessages) {
        this.canEditMessages = canEditMessages;
    }

    public void setCanPinMessages(Boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
    }

    public void setCanManageTopics(Boolean canManageTopics) {
        this.canManageTopics = canManageTopics;
    }

    public void setCanPostStories(Boolean canPostStories) {
        this.canPostStories = canPostStories;
    }

    public void setCanEditStories(Boolean canEditStories) {
        this.canEditStories = canEditStories;
    }

    public void setCanDeleteStories(Boolean canDeleteStories) {
        this.canDeleteStories = canDeleteStories;
    }

    public void setCanManageDirectMessages(Boolean canManageDirectMessages) {
        this.canManageDirectMessages = canManageDirectMessages;
    }

    // Getters
    /**
     * Gets whether the user's presence in the chat is hidden.
     * @return True, if the user's presence in the chat is hidden
     */
    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    /**
     * Gets whether the administrator can access the chat event log, get boost list, see hidden supergroup and channel members, report spam messages, ignore slow mode, and send messages to the chat without paying Telegram Stars.
     * @return True, if the administrator can access the chat event log, get boost list, see hidden supergroup and channel members, report spam messages, ignore slow mode, and send messages to the chat without paying Telegram Stars. Implied by any other administrator privilege.
     */
    public Boolean getCanManageChat() {
        return canManageChat;
    }

    /**
     * Gets whether the administrator can delete messages of other users.
     * @return True, if the administrator can delete messages of other users
     */
    public Boolean getCanDeleteMessages() {
        return canDeleteMessages;
    }

    /**
     * Gets whether the administrator can manage video chats.
     * @return True, if the administrator can manage video chats
     */
    public Boolean getCanManageVideoChats() {
        return canManageVideoChats;
    }

    /**
     * Gets whether the administrator can restrict, ban or unban chat members, or access supergroup statistics.
     * @return True, if the administrator can restrict, ban or unban chat members, or access supergroup statistics
     */
    public Boolean getCanRestrictMembers() {
        return canRestrictMembers;
    }

    /**
     * Gets whether the administrator can add new administrators with a subset of their own privileges or demote administrators.
     * @return True, if the administrator can add new administrators with a subset of their own privileges or demote administrators that they have promoted, directly or indirectly (promoted by administrators that were appointed by the user)
     */
    public Boolean getCanPromoteMembers() {
        return canPromoteMembers;
    }

    /**
     * Gets whether the user is allowed to change the chat title, photo and other settings.
     * @return True, if the user is allowed to change the chat title, photo and other settings
     */
    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    /**
     * Gets whether the user is allowed to invite new users to the chat.
     * @return True, if the user is allowed to invite new users to the chat
     */
    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    /**
     * Gets whether the administrator can post messages in the channel, approve suggested posts, or access channel statistics.
     * @return True, if the administrator can post messages in the channel, approve suggested posts, or access channel statistics; for channels only
     */
    public Boolean getCanPostMessages() {
        return canPostMessages;
    }

    /**
     * Gets whether the administrator can edit messages of other users and can pin messages.
     * @return True, if the administrator can edit messages of other users and can pin messages; for channels only
     */
    public Boolean getCanEditMessages() {
        return canEditMessages;
    }

    /**
     * Gets whether the user is allowed to pin messages.
     * @return True, if the user is allowed to pin messages; for groups and supergroups only
     */
    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    /**
     * Gets whether the user is allowed to create, rename, close, and reopen forum topics.
     * @return True, if the user is allowed to create, rename, close, and reopen forum topics; for supergroups only
     */
    public Boolean getCanManageTopics() {
        return canManageTopics;
    }

    /**
     * Gets whether the administrator can post stories to the chat.
     * @return True, if the administrator can post stories to the chat
     */
    public Boolean getCanPostStories() {
        return canPostStories;
    }

    /**
     * Gets whether the administrator can edit stories posted by other users, post stories to the chat page, pin chat stories, and access the chat's story archive.
     * @return True, if the administrator can edit stories posted by other users, post stories to the chat page, pin chat stories, and access the chat's story archive
     */
    public Boolean getCanEditStories() {
        return canEditStories;
    }

    /**
     * Gets whether the administrator can delete stories posted by other users.
     * @return True, if the administrator can delete stories posted by other users
     */
    public Boolean getCanDeleteStories() {
        return canDeleteStories;
    }

    /**
     * Gets whether the administrator can manage direct messages of the channel and decline suggested posts.
     * @return True, if the administrator can manage direct messages of the channel and decline suggested posts; for channels only
     */
    public Boolean getCanManageDirectMessages() {
        return canManageDirectMessages;
    }
}