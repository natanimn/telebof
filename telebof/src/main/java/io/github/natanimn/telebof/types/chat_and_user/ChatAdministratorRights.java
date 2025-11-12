package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Represents the rights of an administrator in a chat.
 * @param isAnonymous True, if the user's presence in the chat is hidden
 * @param canManageChat True, if the administrator can access the chat event log, get boost list, see hidden supergroup and channel members, report spam messages, ignore slow mode, and send messages to the chat without paying Telegram Stars. Implied by any other administrator privilege.
 * @param canDeleteMessages True, if the administrator can delete messages of other user
 * @param canManageVideoChats True, if the administrator can manage video chats
 * @param canRestrictMembers True, if the administrator can restrict, ban or unban chat members, or access supergroup statistics
 * @param canPromoteMembers True, if the administrator can add new administrators with a subset of their own privileges or demote administrators that they have promoted, directly or indirectly (promoted by administrators that were appointed by the user)
 * @param canChangeInfo True, if the user is allowed to change the chat title, photo and other settings
 * @param canInviteUsers True, if the user is allowed to invite new users to the chat
 * @param canPostMessages True, if the administrator can post messages in the channel, approve suggested posts, or access channel statistics; for channels only
 * @param canEditMessages True, if the administrator can edit messages of other users and can pin messages; for channels only
 * @param canPinMessages True, if the user is allowed to pin messages; for groups and supergroups only
 * @param canManageTopics True, if the user is allowed to create, rename, close, and reopen forum topics; for supergroups only
 * @param canPostStories True, if the administrator can post stories to the chat
 * @param canEditStories True, if the administrator can edit stories posted by other users, post stories to the chat page, pin chat stories, and access the chat's story archive
 * @param canDeleteStories True, if the administrator can delete stories posted by other users
 * @param canManageDirectMessages True, if the administrator can manage direct messages of the channel and decline suggested posts; for channels only
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ChatAdministratorRights(
        @SerializedName("is_anonymous") Boolean isAnonymous,
        @SerializedName("can_manage_chat") Boolean canManageChat,
        @SerializedName("can_delete_messages") Boolean canDeleteMessages,
        @SerializedName("can_manage_video_chats") Boolean canManageVideoChats,
        @SerializedName("can_restrict_members") Boolean canRestrictMembers,
        @SerializedName("can_promote_members") Boolean canPromoteMembers,
        @SerializedName("can_change_info") Boolean canChangeInfo,
        @SerializedName("can_invite_users") Boolean canInviteUsers,
        @SerializedName("can_post_messages") Boolean canPostMessages,
        @SerializedName("can_edit_messages") Boolean canEditMessages,
        @SerializedName("can_pin_messages") Boolean canPinMessages,
        @SerializedName("can_manage_topics") Boolean canManageTopics,
        @SerializedName("can_post_stories") Boolean canPostStories,
        @SerializedName("can_edit_stories") Boolean canEditStories,
        @SerializedName("can_delete_stories") Boolean canDeleteStories,
        @SerializedName("can_manage_direct_messages") Boolean canManageDirectMessages
) implements Serializable {

    /**
     * Creates a new ChatAdministratorRights builder
     */
    public static ChatAdministratorRightsBuilder builder() {
        return new ChatAdministratorRightsBuilder();
    }

    /**
     * Builder class for ChatAdministratorRights
     */
    public static class ChatAdministratorRightsBuilder {
        private Boolean isAnonymous;
        private Boolean canManageChat;
        private Boolean canDeleteMessages;
        private Boolean canManageVideoChats;
        private Boolean canRestrictMembers;
        private Boolean canPromoteMembers;
        private Boolean canChangeInfo;
        private Boolean canInviteUsers;
        private Boolean canPostMessages;
        private Boolean canEditMessages;
        private Boolean canPinMessages;
        private Boolean canManageTopics;
        private Boolean canPostStories;
        private Boolean canEditStories;
        private Boolean canDeleteStories;
        private Boolean canManageDirectMessages;

        public ChatAdministratorRightsBuilder isAnonymous(boolean isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }

        public ChatAdministratorRightsBuilder canManageChat(boolean canManageChat) {
            this.canManageChat = canManageChat;
            return this;
        }

        public ChatAdministratorRightsBuilder canDeleteMessages(boolean canDeleteMessages) {
            this.canDeleteMessages = canDeleteMessages;
            return this;
        }

        public ChatAdministratorRightsBuilder canManageVideoChats(boolean canManageVideoChats) {
            this.canManageVideoChats = canManageVideoChats;
            return this;
        }

        public ChatAdministratorRightsBuilder canRestrictMembers(boolean canRestrictMembers) {
            this.canRestrictMembers = canRestrictMembers;
            return this;
        }

        public ChatAdministratorRightsBuilder canPromoteMembers(boolean canPromoteMembers) {
            this.canPromoteMembers = canPromoteMembers;
            return this;
        }

        public ChatAdministratorRightsBuilder canChangeInfo(boolean canChangeInfo) {
            this.canChangeInfo = canChangeInfo;
            return this;
        }

        public ChatAdministratorRightsBuilder canInviteUsers(boolean canInviteUsers) {
            this.canInviteUsers = canInviteUsers;
            return this;
        }

        public ChatAdministratorRightsBuilder canPostMessages(boolean canPostMessages) {
            this.canPostMessages = canPostMessages;
            return this;
        }

        public ChatAdministratorRightsBuilder canEditMessages(boolean canEditMessages) {
            this.canEditMessages = canEditMessages;
            return this;
        }

        public ChatAdministratorRightsBuilder canPinMessages(boolean canPinMessages) {
            this.canPinMessages = canPinMessages;
            return this;
        }

        public ChatAdministratorRightsBuilder canManageTopics(boolean canManageTopics) {
            this.canManageTopics = canManageTopics;
            return this;
        }

        public ChatAdministratorRightsBuilder canPostStories(boolean canPostStories) {
            this.canPostStories = canPostStories;
            return this;
        }

        public ChatAdministratorRightsBuilder canEditStories(boolean canEditStories) {
            this.canEditStories = canEditStories;
            return this;
        }

        public ChatAdministratorRightsBuilder canDeleteStories(boolean canDeleteStories) {
            this.canDeleteStories = canDeleteStories;
            return this;
        }

        public ChatAdministratorRightsBuilder canManageDirectMessages(boolean canManageDirectMessages) {
            this.canManageDirectMessages = canManageDirectMessages;
            return this;
        }

        public ChatAdministratorRights build() {
            return new ChatAdministratorRights(
                    isAnonymous,
                    canManageChat,
                    canDeleteMessages,
                    canManageVideoChats,
                    canRestrictMembers,
                    canPromoteMembers,
                    canChangeInfo,
                    canInviteUsers,
                    canPostMessages,
                    canEditMessages,
                    canPinMessages,
                    canManageTopics,
                    canPostStories,
                    canEditStories,
                    canDeleteStories,
                    canManageDirectMessages
            );
        }
    }
}