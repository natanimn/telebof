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
    /**
     * True, if the user's presence in the chat is hidden
     */
    @SerializedName("is_anonymous")
    private Boolean isAnonymous;

    /**
     * True, if the administrator can access the chat event log, get boost list, see hidden supergroup and channel members, report spam messages, ignore slow mode, and send messages to the chat without paying Telegram Stars. Implied by any other administrator privilege.
     */
    @SerializedName("can_manage_chat")
    private Boolean canManageChat;

    /**
     * True, if the administrator can delete messages of other user
     */
    @SerializedName("can_delete_messages")
    private Boolean canDeleteMessages;

    /**
     * True, if the administrator can manage video chats
     */
    @SerializedName("can_manage_video_chats")
    private Boolean canManageVideoChats;

    /**
     * True, if the administrator can restrict, ban or unban chat members, or access supergroup statistics
     */
    @SerializedName("can_restrict_members")
    private Boolean canRestrictMembers;

    /**
     * True, if the administrator can add new administrators with a subset of their own privileges or demote administrators that they have promoted, directly or indirectly (promoted by administrators that were appointed by the user)
     */
    @SerializedName("can_promote_members")
    private Boolean canPromoteMembers;

    /**
     * True, if the user is allowed to change the chat title, photo and other settings
     */
    @SerializedName("can_change_info")
    private Boolean canChangeInfo;

    /**
     * True, if the user is allowed to invite new users to the chat
     */
    @SerializedName("can_invite_users")
    private Boolean canInviteUsers;

    /**
     * True, if the administrator can post messages in the channel, approve suggested posts, or access channel statistics; for channels only
     */
    @SerializedName("can_post_messages")
    private Boolean canPostMessages;

    /**
     * True, if the administrator can edit messages of other users and can pin messages; for channels only
     */
    @SerializedName("can_edit_messages")
    private Boolean canEditMessages;

    /**
     * True, if the user is allowed to pin messages; for groups and supergroups only
     */
    @SerializedName("can_pin_messages")
    private Boolean canPinMessages;

    /**
     * True, if the user is allowed to create, rename, close, and reopen forum topics; for supergroups only
     */
    @SerializedName("can_manage_topics")
    private Boolean canManageTopics;

    /**
     * True, if the administrator can post stories to the chat
     */
    @SerializedName("can_post_stories")
    private Boolean canPostStories;

    /**
     * True, if the administrator can edit stories posted by other users, post stories to the chat page, pin chat stories, and access the chat's story archive
     */
    @SerializedName("can_edit_stories")
    private Boolean canEditStories;

    /**
     * True, if the administrator can delete stories posted by other users
     */
    @SerializedName("can_delete_stories")
    private Boolean canDeleteStories;

    /**
     * True, if the administrator can manage direct messages of the channel and decline suggested posts; for channels only
     */
    @SerializedName("can_manage_direct_messages")
    private Boolean canManageDirectMessages;

    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    public ChatAdministratorRights setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
        return this;
    }

    public Boolean getCanManageChat() {
        return canManageChat;
    }

    public ChatAdministratorRights setCanManageChat(Boolean canManageChat) {
        this.canManageChat = canManageChat;
        return this;
    }

    public Boolean getCanDeleteMessages() {
        return canDeleteMessages;
    }

    public ChatAdministratorRights setCanDeleteMessages(Boolean canDeleteMessages) {
        this.canDeleteMessages = canDeleteMessages;
        return this;
    }

    public Boolean getCanManageVideoChats() {
        return canManageVideoChats;
    }

    public ChatAdministratorRights setCanManageVideoChats(Boolean canManageVideoChats) {
        this.canManageVideoChats = canManageVideoChats;
        return this;
    }

    public Boolean getCanRestrictMembers() {
        return canRestrictMembers;
    }

    public ChatAdministratorRights setCanRestrictMembers(Boolean canRestrictMembers) {
        this.canRestrictMembers = canRestrictMembers;
        return this;
    }

    public Boolean getCanPromoteMembers() {
        return canPromoteMembers;
    }

    public ChatAdministratorRights setCanPromoteMembers(Boolean canPromoteMembers) {
        this.canPromoteMembers = canPromoteMembers;
        return this;
    }

    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    public ChatAdministratorRights setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
        return this;
    }

    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    public ChatAdministratorRights setCanInviteUsers(Boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
        return this;
    }

    public Boolean getCanPostMessages() {
        return canPostMessages;
    }

    public ChatAdministratorRights setCanPostMessages(Boolean canPostMessages) {
        this.canPostMessages = canPostMessages;
        return this;
    }

    public Boolean getCanEditMessages() {
        return canEditMessages;
    }

    public ChatAdministratorRights setCanEditMessages(Boolean canEditMessages) {
        this.canEditMessages = canEditMessages;
        return this;
    }

    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    public ChatAdministratorRights setCanPinMessages(Boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
        return this;
    }

    public Boolean getCanManageTopics() {
        return canManageTopics;
    }

    public ChatAdministratorRights setCanManageTopics(Boolean canManageTopics) {
        this.canManageTopics = canManageTopics;
        return this;
    }

    public Boolean getCanPostStories() {
        return canPostStories;
    }

    public ChatAdministratorRights setCanPostStories(Boolean canPostStories) {
        this.canPostStories = canPostStories;
        return this;
    }

    public Boolean getCanEditStories() {
        return canEditStories;
    }

    public ChatAdministratorRights setCanEditStories(Boolean canEditStories) {
        this.canEditStories = canEditStories;
        return this;
    }

    public Boolean getCanDeleteStories() {
        return canDeleteStories;
    }

    public ChatAdministratorRights setCanDeleteStories(Boolean canDeleteStories) {
        this.canDeleteStories = canDeleteStories;
        return this;
    }

    public Boolean getCanManageDirectMessages() {
        return canManageDirectMessages;
    }

    public ChatAdministratorRights setCanManageDirectMessages(Boolean canManageDirectMessages) {
        this.canManageDirectMessages = canManageDirectMessages;
        return this;
    }
}