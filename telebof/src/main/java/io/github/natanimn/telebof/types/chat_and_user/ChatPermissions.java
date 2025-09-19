package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Describes actions that a non-administrator user is allowed to take in a chat.
 * @param canSendMessages Optional. True, if the user is allowed to send text messages, contacts, giveaways, giveaway winners, invoices, locations and venues
 * @param canSendAudios Optional. True, if the user is allowed to send audios
 * @param canSendDocuments Optional. True, if the user is allowed to send documents
 * @param canSendPhotos Optional. True, if the user is allowed to send photos
 * @param canSendVideos Optional. True, if the user is allowed to send videos
 * @param canSendVideoNotes Optional. True, if the user is allowed to send video notes
 * @param canSendVoiceNotes Optional. True, if the user is allowed to send voice notes
 * @param canSendPolls Optional. True, if the user is allowed to send polls and checklists
 * @param canSendOtherMessages Optional. True, if the user is allowed to send animations, games, stickers and use inline bots
 * @param canAddWebPagePreviews Optional. True, if the user is allowed to add web page previews to their messages
 * @param canChangeInfo Optional. True, if the user is allowed to change the chat title, photo and other settings. Ignored in public supergroups
 * @param canInviteUsers Optional. True, if the user is allowed to invite new users to the chat
 * @param canPinMessages Optional. True, if the user is allowed to pin messages. Ignored in public supergroups
 * @param canManageTopics Optional. True, if the user is allowed to create forum topics. If omitted defaults to the value of can_pin_messages
 * @author Natanim
 * @since 3 March 2025
 * @version 1.2.4
 */
public record ChatPermissions(
        @SerializedName("can_send_messages") Boolean canSendMessages,
        @SerializedName("can_send_audios") Boolean canSendAudios,
        @SerializedName("can_send_documents") Boolean canSendDocuments,
        @SerializedName("can_send_photos") Boolean canSendPhotos,
        @SerializedName("can_send_videos") Boolean canSendVideos,
        @SerializedName("can_send_video_notes") Boolean canSendVideoNotes,
        @SerializedName("can_send_voice_notes") Boolean canSendVoiceNotes,
        @SerializedName("can_send_polls") Boolean canSendPolls,
        @SerializedName("can_send_other_messages") Boolean canSendOtherMessages,
        @SerializedName("can_add_web_page_previews") Boolean canAddWebPagePreviews,
        @SerializedName("can_change_info") Boolean canChangeInfo,
        @SerializedName("can_invite_users") Boolean canInviteUsers,
        @SerializedName("can_pin_messages") Boolean canPinMessages,
        @SerializedName("can_manage_topics") Boolean canManageTopics
) implements Serializable {

    /**
     * Creates a new ChatPermissions builder
     */
    public static ChatPermissionsBuilder builder() {
        return new ChatPermissionsBuilder();
    }

    /**
     * Builder class for ChatPermissions
     */
    public static class ChatPermissionsBuilder {
        private Boolean canSendMessages;
        private Boolean canSendAudios;
        private Boolean canSendDocuments;
        private Boolean canSendPhotos;
        private Boolean canSendVideos;
        private Boolean canSendVideoNotes;
        private Boolean canSendVoiceNotes;
        private Boolean canSendPolls;
        private Boolean canSendOtherMessages;
        private Boolean canAddWebPagePreviews;
        private Boolean canChangeInfo;
        private Boolean canInviteUsers;
        private Boolean canPinMessages;
        private Boolean canManageTopics;

        public ChatPermissionsBuilder canSendMessages(boolean canSendMessages) {
            this.canSendMessages = canSendMessages;
            return this;
        }

        public ChatPermissionsBuilder canSendAudios(boolean canSendAudios) {
            this.canSendAudios = canSendAudios;
            return this;
        }

        public ChatPermissionsBuilder canSendDocuments(boolean canSendDocuments) {
            this.canSendDocuments = canSendDocuments;
            return this;
        }

        public ChatPermissionsBuilder canSendPhotos(boolean canSendPhotos) {
            this.canSendPhotos = canSendPhotos;
            return this;
        }

        public ChatPermissionsBuilder canSendVideos(boolean canSendVideos) {
            this.canSendVideos = canSendVideos;
            return this;
        }

        public ChatPermissionsBuilder canSendVideoNotes(boolean canSendVideoNotes) {
            this.canSendVideoNotes = canSendVideoNotes;
            return this;
        }

        public ChatPermissionsBuilder canSendVoiceNotes(boolean canSendVoiceNotes) {
            this.canSendVoiceNotes = canSendVoiceNotes;
            return this;
        }

        public ChatPermissionsBuilder canSendPolls(boolean canSendPolls) {
            this.canSendPolls = canSendPolls;
            return this;
        }

        public ChatPermissionsBuilder canSendOtherMessages(boolean canSendOtherMessages) {
            this.canSendOtherMessages = canSendOtherMessages;
            return this;
        }

        public ChatPermissionsBuilder canAddWebPagePreviews(boolean canAddWebPagePreviews) {
            this.canAddWebPagePreviews = canAddWebPagePreviews;
            return this;
        }

        public ChatPermissionsBuilder canChangeInfo(boolean canChangeInfo) {
            this.canChangeInfo = canChangeInfo;
            return this;
        }

        public ChatPermissionsBuilder canInviteUsers(boolean canInviteUsers) {
            this.canInviteUsers = canInviteUsers;
            return this;
        }

        public ChatPermissionsBuilder canPinMessages(boolean canPinMessages) {
            this.canPinMessages = canPinMessages;
            return this;
        }

        public ChatPermissionsBuilder canManageTopics(boolean canManageTopics) {
            this.canManageTopics = canManageTopics;
            return this;
        }

        public ChatPermissions build() {
            return new ChatPermissions(
                    canSendMessages,
                    canSendAudios,
                    canSendDocuments,
                    canSendPhotos,
                    canSendVideos,
                    canSendVideoNotes,
                    canSendVoiceNotes,
                    canSendPolls,
                    canSendOtherMessages,
                    canAddWebPagePreviews,
                    canChangeInfo,
                    canInviteUsers,
                    canPinMessages,
                    canManageTopics
            );
        }
    }
}