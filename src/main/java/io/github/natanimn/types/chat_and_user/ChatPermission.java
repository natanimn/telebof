package io.github.natanimn.types.chat_and_user;

import java.io.Serializable;
import java.util.Objects;


/**
 * Natanim Negash
 *  3 March 2025
 */
public class ChatPermission implements Serializable {
    public Boolean can_send_messages, can_send_audios, can_send_documents, can_send_photos, can_send_videos,
            can_send_video_notes, can_send_voice_notes, can_send_polls, can_send_other_messages, can_add_web_page_previews,
            can_change_info, can_invite_users, can_pin_messages, can_manage_topics;
    public ChatPermission canSendMessages(boolean canSendMessages) {
        this.can_send_messages = canSendMessages;
        return this;
    }

    public ChatPermission canSendAudios(boolean canSendAudios) {
        this.can_send_audios = canSendAudios;
        return this;
    }

    public ChatPermission canSendDocuments(boolean canSendDocuments) {
        this.can_send_documents = canSendDocuments;
        return this;
    }

    public ChatPermission canSendPhotos(boolean canSendPhotos) {
        this.can_send_photos = canSendPhotos;
        return this;
    }

    public ChatPermission canSendVideos(boolean canSendVideos) {
        this.can_send_videos = canSendVideos;
        return this;
    }

    public ChatPermission canSendVideoNotes(boolean canSendVideoNotes) {
        this.can_send_video_notes = canSendVideoNotes;
        return this;
    }

    public ChatPermission canSendVoiceNotes(boolean canSendVoiceNotes) {
        this.can_send_voice_notes = canSendVoiceNotes;
        return this;
    }

    public ChatPermission canSendPolls(boolean canSendPolls) {
        this.can_send_polls = canSendPolls;
        return this;
    }

    public ChatPermission canSendOtherMessages(boolean canSendOtherMessages) {
        this.can_send_other_messages = canSendOtherMessages;
        return this;
    }

    public ChatPermission canAddWebPagePreviews(boolean canAddWebPagePreviews) {
        this.can_add_web_page_previews = canAddWebPagePreviews;
        return this;
    }

    public ChatPermission canChangeInfo(boolean canChangeInfo) {
        this.can_change_info = canChangeInfo;
        return this;
    }

    public ChatPermission canInviteUsers(boolean canInviteUsers) {
        this.can_invite_users = canInviteUsers;
        return this;
    }

    public ChatPermission canPinMessages(boolean canPinMessages) {
        this.can_pin_messages = canPinMessages;
        return this;
    }

    public ChatPermission canManageTopics(boolean canManageTopics) {
        this.can_manage_topics = canManageTopics;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatPermission that = (ChatPermission) object;
        return Objects.equals(can_send_messages, that.can_send_messages) &&
                Objects.equals(can_send_audios, that.can_send_audios) &&
                Objects.equals(can_send_documents, that.can_send_documents) &&
                Objects.equals(can_send_photos, that.can_send_photos) &&
                Objects.equals(can_send_videos, that.can_send_videos) &&
                Objects.equals(can_send_video_notes, that.can_send_video_notes) &&
                Objects.equals(can_send_voice_notes, that.can_send_voice_notes) &&
                Objects.equals(can_send_polls, that.can_send_polls) &&
                Objects.equals(can_send_other_messages, that.can_send_other_messages) &&
                Objects.equals(can_add_web_page_previews, that.can_add_web_page_previews) &&
                Objects.equals(can_change_info, that.can_change_info) &&
                Objects.equals(can_invite_users, that.can_invite_users) &&
                Objects.equals(can_pin_messages, that.can_pin_messages) &&
                Objects.equals(can_manage_topics, that.can_manage_topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(can_send_messages, can_send_audios, can_send_documents, can_send_photos, can_send_videos,
                can_send_video_notes, can_send_voice_notes, can_send_polls, can_send_other_messages, can_add_web_page_previews,
                can_change_info, can_invite_users, can_pin_messages, can_manage_topics);
    }
}
