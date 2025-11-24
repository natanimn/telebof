package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Describes actions that a non-administrator user is allowed to take in a chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ChatPermissions implements Serializable {
    /**
     * Optional. True, if the user is allowed to send text messages, contacts, giveaways, giveaway winners, invoices, locations and venues
     */
    @SerializedName("can_send_messages")
    private Boolean canSendMessages;

    /**
     * Optional. True, if the user is allowed to send audios
     */
    @SerializedName("can_send_audios")
    private Boolean canSendAudios;

    /**
     * Optional. True, if the user is allowed to send documents
     */
    @SerializedName("can_send_documents")
    private Boolean canSendDocuments;

    /**
     * Optional. True, if the user is allowed to send photos
     */
    @SerializedName("can_send_photos")
    private Boolean canSendPhotos;

    /**
     * Optional. True, if the user is allowed to send videos
     */
    @SerializedName("can_send_videos")
    private Boolean canSendVideos;

    /**
     * Optional. True, if the user is allowed to send video notes
     */
    @SerializedName("can_send_video_notes")
    private Boolean canSendVideoNotes;

    /**
     * Optional. True, if the user is allowed to send voice notes
     */
    @SerializedName("can_send_voice_notes")
    private Boolean canSendVoiceNotes;

    /**
     * Optional. True, if the user is allowed to send polls and checklists
     */
    @SerializedName("can_send_polls")
    private Boolean canSendPolls;

    /**
     * Optional. True, if the user is allowed to send animations, games, stickers and use inline bots
     */
    @SerializedName("can_send_other_messages")
    private Boolean canSendOtherMessages;

    /**
     * Optional. True, if the user is allowed to add web page previews to their messages
     */
    @SerializedName("can_add_web_page_previews")
    private Boolean canAddWebPagePreviews;

    /**
     * Optional. True, if the user is allowed to change the chat title, photo and other settings. Ignored in public supergroups
     */
    @SerializedName("can_change_info")
    private Boolean canChangeInfo;

    /**
     * Optional. True, if the user is allowed to invite new users to the chat
     */
    @SerializedName("can_invite_users")
    private Boolean canInviteUsers;

    /**
     * Optional. True, if the user is allowed to pin messages. Ignored in public supergroups
     */
    @SerializedName("can_pin_messages")
    private Boolean canPinMessages;

    /**
     * Optional. True, if the user is allowed to create forum topics. If omitted defaults to the value of can_pin_messages
     */
    @SerializedName("can_manage_topics")
    private Boolean canManageTopics;

    public Boolean getCanSendMessages() {
        return canSendMessages;
    }

    public ChatPermissions setCanSendMessages(Boolean canSendMessages) {
        this.canSendMessages = canSendMessages;
        return this;
    }

    public Boolean getCanSendAudios() {
        return canSendAudios;
    }

    public ChatPermissions setCanSendAudios(Boolean canSendAudios) {
        this.canSendAudios = canSendAudios;
        return this;
    }

    public Boolean getCanSendDocuments() {
        return canSendDocuments;
    }

    public ChatPermissions setCanSendDocuments(Boolean canSendDocuments) {
        this.canSendDocuments = canSendDocuments;
        return this;
    }

    public Boolean getCanSendPhotos() {
        return canSendPhotos;
    }

    public ChatPermissions setCanSendPhotos(Boolean canSendPhotos) {
        this.canSendPhotos = canSendPhotos;
        return this;
    }

    public Boolean getCanSendVideos() {
        return canSendVideos;
    }

    public ChatPermissions setCanSendVideos(Boolean canSendVideos) {
        this.canSendVideos = canSendVideos;
        return this;
    }

    public Boolean getCanSendVideoNotes() {
        return canSendVideoNotes;
    }

    public ChatPermissions setCanSendVideoNotes(Boolean canSendVideoNotes) {
        this.canSendVideoNotes = canSendVideoNotes;
        return this;
    }

    public Boolean getCanSendVoiceNotes() {
        return canSendVoiceNotes;
    }

    public ChatPermissions setCanSendVoiceNotes(Boolean canSendVoiceNotes) {
        this.canSendVoiceNotes = canSendVoiceNotes;
        return this;
    }

    public Boolean getCanSendPolls() {
        return canSendPolls;
    }

    public ChatPermissions setCanSendPolls(Boolean canSendPolls) {
        this.canSendPolls = canSendPolls;
        return this;
    }

    public Boolean getCanSendOtherMessages() {
        return canSendOtherMessages;
    }

    public ChatPermissions setCanSendOtherMessages(Boolean canSendOtherMessages) {
        this.canSendOtherMessages = canSendOtherMessages;
        return this;
    }

    public Boolean getCanAddWebPagePreviews() {
        return canAddWebPagePreviews;
    }

    public ChatPermissions setCanAddWebPagePreviews(Boolean canAddWebPagePreviews) {
        this.canAddWebPagePreviews = canAddWebPagePreviews;
        return this;
    }

    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    public ChatPermissions setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
        return this;
    }

    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    public ChatPermissions setCanInviteUsers(Boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
        return this;
    }

    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    public ChatPermissions setCanPinMessages(Boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
        return this;
    }

    public Boolean getCanManageTopics() {
        return canManageTopics;
    }

    public ChatPermissions setCanManageTopics(Boolean canManageTopics) {
        this.canManageTopics = canManageTopics;
        return this;
    }
}