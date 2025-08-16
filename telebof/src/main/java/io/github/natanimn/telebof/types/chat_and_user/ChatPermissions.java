package io.github.natanimn.telebof.types.chat_and_user;

import java.io.Serializable;
import java.util.Objects;

/**
 * Describes actions that a non-administrator user is allowed to take in a chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class ChatPermissions implements Serializable {
    /**
     * Optional.
     * True, if the user is allowed to send text messages, contacts, giveaways, giveaway winners, invoices, locations and venues
     */
    public Boolean can_send_messages;

    /**
     * Optional. True, if the user is allowed to send audios
     */
    public Boolean can_send_audios;

    /**
     * Optional. True, if the user is allowed to send documents
     */
    public Boolean can_send_documents;

    /**
     * Optional. True, if the user is allowed to send photos
     */
    public Boolean can_send_photos;

    /**
     * Optional. True, if the user is allowed to send videos
     */
    public Boolean can_send_videos;

    /**
     * Optional. True, if the user is allowed to send video notes
     */
    public Boolean can_send_video_notes;

    /**
     * Optional. True, if the user is allowed to send voice notes
     */
    public Boolean can_send_voice_notes;

    /**
     * Optional. True, if the user is allowed to send polls and checklists
     */
    public Boolean can_send_polls;

    /**
     * Optional. True, if the user is allowed to send animations, games, stickers and use inline bots
     */
    public Boolean can_send_other_messages;

    /**
     * Optional. True, if the user is allowed to add web page previews to their messages
     */
    public Boolean can_add_web_page_previews;

    /**
     * Optional. True, if the user is allowed to change the chat title, photo and other settings. Ignored in public supergroups
     */
    public Boolean can_change_info;

    /**
     * Optional. True, if the user is allowed to invite new users to the chat
     */
    public Boolean can_invite_users;

    /**
     * Optional. True, if the user is allowed to pin messages. Ignored in public supergroups
     */
    public Boolean can_pin_messages;

    /**
     * Optional. True, if the user is allowed to create forum topics. If omitted defaults to the value of can_pin_messages
     */
    public Boolean can_manage_topics;

    public ChatPermissions canSendMessages(boolean canSendMessages) {
        this.can_send_messages = canSendMessages;
        return this;
    }

    public ChatPermissions canSendAudios(boolean canSendAudios) {
        this.can_send_audios = canSendAudios;
        return this;
    }

    public ChatPermissions canSendDocuments(boolean canSendDocuments) {
        this.can_send_documents = canSendDocuments;
        return this;
    }

    public ChatPermissions canSendPhotos(boolean canSendPhotos) {
        this.can_send_photos = canSendPhotos;
        return this;
    }

    public ChatPermissions canSendVideos(boolean canSendVideos) {
        this.can_send_videos = canSendVideos;
        return this;
    }

    public ChatPermissions canSendVideoNotes(boolean canSendVideoNotes) {
        this.can_send_video_notes = canSendVideoNotes;
        return this;
    }

    public ChatPermissions canSendVoiceNotes(boolean canSendVoiceNotes) {
        this.can_send_voice_notes = canSendVoiceNotes;
        return this;
    }

    public ChatPermissions canSendPolls(boolean canSendPolls) {
        this.can_send_polls = canSendPolls;
        return this;
    }

    public ChatPermissions canSendOtherMessages(boolean canSendOtherMessages) {
        this.can_send_other_messages = canSendOtherMessages;
        return this;
    }

    public ChatPermissions canAddWebPagePreviews(boolean canAddWebPagePreviews) {
        this.can_add_web_page_previews = canAddWebPagePreviews;
        return this;
    }

    public ChatPermissions canChangeInfo(boolean canChangeInfo) {
        this.can_change_info = canChangeInfo;
        return this;
    }

    public ChatPermissions canInviteUsers(boolean canInviteUsers) {
        this.can_invite_users = canInviteUsers;
        return this;
    }

    public ChatPermissions canPinMessages(boolean canPinMessages) {
        this.can_pin_messages = canPinMessages;
        return this;
    }

    public ChatPermissions canManageTopics(boolean canManageTopics) {
        this.can_manage_topics = canManageTopics;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatPermissions that = (ChatPermissions) object;
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
