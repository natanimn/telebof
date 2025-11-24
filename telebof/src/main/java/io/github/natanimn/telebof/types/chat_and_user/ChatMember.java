package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.enums.ChatMemberStatus;
import com.google.gson.annotations.SerializedName;

/**
 * This object contains information about one member of a chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ChatMember {
    /**
     * The member's status in the chat.
     */
    private ChatMemberStatus status;

    /**
     * Optional. Custom title for this user
     */
    @SerializedName("custom_title")
    private String customTitle;

    /**
     * Information about the user
     */
    private User user;

    /**
     * True, if the bot is allowed to edit administrator privileges of that user
     */
    @SerializedName("can_be_edited")
    private Boolean canBeEdited;

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
     * True, if the administrator can delete messages of other users
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
     * Optional. True, if the administrator can post messages in the channel, approve suggested posts, or access channel statistics; for channels only
     */
    @SerializedName("can_post_messages")
    private Boolean canPostMessages;

    /**
     * Optional. True, if the administrator can edit messages of other users and can pin messages; for channels only
     */
    @SerializedName("can_edit_messages")
    private Boolean canEditMessages;

    /**
     * Optional. True, if the user is allowed to pin messages; for groups and supergroups only
     */
    @SerializedName("can_pin_messages")
    private Boolean canPinMessages;

    /**
     * Optional. True, if the user is allowed to create, rename, close, and reopen forum topics; for supergroups only
     */
    @SerializedName("can_manage_topics")
    private Boolean canManageTopics;

    /**
     * True, if the user is a member of the chat at the moment of the request
     */
    @SerializedName("is_member")
    private Boolean isMember;

    /**
     * True, if the user is allowed to send text messages, contacts, giveaways, giveaway winners, invoices, locations and venues
     */
    @SerializedName("can_send_messages")
    private Boolean canSendMessages;

    /**
     * True, if the user is allowed to send audios
     */
    @SerializedName("can_send_audios")
    private Boolean canSendAudios;

    /**
     * True, if the user is allowed to send documents
     */
    @SerializedName("can_send_documents")
    private Boolean canSendDocuments;

    /**
     * True, if the user is allowed to send photos
     */
    @SerializedName("can_send_photos")
    private Boolean canSendPhotos;

    /**
     * True, if the user is allowed to send videos
     */
    @SerializedName("can_send_videos")
    private Boolean canSendVideos;

    /**
     * True, if the user is allowed to send video notes
     */
    @SerializedName("can_send_video_notes")
    private Boolean canSendVideoNotes;

    /**
     * True, if the user is allowed to send voice notes
     */
    @SerializedName("can_send_voice_votes")
    private Boolean canSendVoiceVotes;

    /**
     * True, if the user is allowed to send polls and checklists
     */
    @SerializedName("can_send_polls")
    private Boolean canSendPolls;

    /**
     * True, if the user is allowed to send animations, games, stickers and use inline bots
     */
    @SerializedName("can_send_other_messages")
    private Boolean canSendOtherMessages;

    /**
     * True, if the user is allowed to add web page previews to their messages
     */
    @SerializedName("can_add_web_page_previews")
    private Boolean canAddWebPagePreviews;

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
     * Optional. Date when the user's subscription will expire; Unix time
     */
    @SerializedName("until_date")
    private Integer untilDate;

    public ChatMemberStatus getStatus() {
        return status;
    }

    public ChatMember setStatus(ChatMemberStatus status) {
        this.status = status;
        return this;
    }

    public String getCustomTitle() {
        return customTitle;
    }

    public ChatMember setCustomTitle(String customTitle) {
        this.customTitle = customTitle;
        return this;
    }

    public User getUser() {
        return user;
    }

    public ChatMember setUser(User user) {
        this.user = user;
        return this;
    }

    public Boolean getCanBeEdited() {
        return canBeEdited;
    }

    public ChatMember setCanBeEdited(Boolean canBeEdited) {
        this.canBeEdited = canBeEdited;
        return this;
    }

    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    public ChatMember setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
        return this;
    }

    public Boolean getCanManageChat() {
        return canManageChat;
    }

    public ChatMember setCanManageChat(Boolean canManageChat) {
        this.canManageChat = canManageChat;
        return this;
    }

    public Boolean getCanDeleteMessages() {
        return canDeleteMessages;
    }

    public ChatMember setCanDeleteMessages(Boolean canDeleteMessages) {
        this.canDeleteMessages = canDeleteMessages;
        return this;
    }

    public Boolean getCanManageVideoChats() {
        return canManageVideoChats;
    }

    public ChatMember setCanManageVideoChats(Boolean canManageVideoChats) {
        this.canManageVideoChats = canManageVideoChats;
        return this;
    }

    public Boolean getCanRestrictMembers() {
        return canRestrictMembers;
    }

    public ChatMember setCanRestrictMembers(Boolean canRestrictMembers) {
        this.canRestrictMembers = canRestrictMembers;
        return this;
    }

    public Boolean getCanPromoteMembers() {
        return canPromoteMembers;
    }

    public ChatMember setCanPromoteMembers(Boolean canPromoteMembers) {
        this.canPromoteMembers = canPromoteMembers;
        return this;
    }

    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    public ChatMember setCanChangeInfo(Boolean canChangeInfo) {
        this.canChangeInfo = canChangeInfo;
        return this;
    }

    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    public ChatMember setCanInviteUsers(Boolean canInviteUsers) {
        this.canInviteUsers = canInviteUsers;
        return this;
    }

    public Boolean getCanPostMessages() {
        return canPostMessages;
    }

    public ChatMember setCanPostMessages(Boolean canPostMessages) {
        this.canPostMessages = canPostMessages;
        return this;
    }

    public Boolean getCanEditMessages() {
        return canEditMessages;
    }

    public ChatMember setCanEditMessages(Boolean canEditMessages) {
        this.canEditMessages = canEditMessages;
        return this;
    }

    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    public ChatMember setCanPinMessages(Boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
        return this;
    }

    public Boolean getCanManageTopics() {
        return canManageTopics;
    }

    public ChatMember setCanManageTopics(Boolean canManageTopics) {
        this.canManageTopics = canManageTopics;
        return this;
    }

    public Boolean getIsMember() {
        return isMember;
    }

    public ChatMember setIsMember(Boolean isMember) {
        this.isMember = isMember;
        return this;
    }

    public Boolean getCanSendMessages() {
        return canSendMessages;
    }

    public ChatMember setCanSendMessages(Boolean canSendMessages) {
        this.canSendMessages = canSendMessages;
        return this;
    }

    public Boolean getCanSendAudios() {
        return canSendAudios;
    }

    public ChatMember setCanSendAudios(Boolean canSendAudios) {
        this.canSendAudios = canSendAudios;
        return this;
    }

    public Boolean getCanSendDocuments() {
        return canSendDocuments;
    }

    public ChatMember setCanSendDocuments(Boolean canSendDocuments) {
        this.canSendDocuments = canSendDocuments;
        return this;
    }

    public Boolean getCanSendPhotos() {
        return canSendPhotos;
    }

    public ChatMember setCanSendPhotos(Boolean canSendPhotos) {
        this.canSendPhotos = canSendPhotos;
        return this;
    }

    public Boolean getCanSendVideos() {
        return canSendVideos;
    }

    public ChatMember setCanSendVideos(Boolean canSendVideos) {
        this.canSendVideos = canSendVideos;
        return this;
    }

    public Boolean getCanSendVideoNotes() {
        return canSendVideoNotes;
    }

    public ChatMember setCanSendVideoNotes(Boolean canSendVideoNotes) {
        this.canSendVideoNotes = canSendVideoNotes;
        return this;
    }

    public Boolean getCanSendVoiceVotes() {
        return canSendVoiceVotes;
    }

    public ChatMember setCanSendVoiceVotes(Boolean canSendVoiceVotes) {
        this.canSendVoiceVotes = canSendVoiceVotes;
        return this;
    }

    public Boolean getCanSendPolls() {
        return canSendPolls;
    }

    public ChatMember setCanSendPolls(Boolean canSendPolls) {
        this.canSendPolls = canSendPolls;
        return this;
    }

    public Boolean getCanSendOtherMessages() {
        return canSendOtherMessages;
    }

    public ChatMember setCanSendOtherMessages(Boolean canSendOtherMessages) {
        this.canSendOtherMessages = canSendOtherMessages;
        return this;
    }

    public Boolean getCanAddWebPagePreviews() {
        return canAddWebPagePreviews;
    }

    public ChatMember setCanAddWebPagePreviews(Boolean canAddWebPagePreviews) {
        this.canAddWebPagePreviews = canAddWebPagePreviews;
        return this;
    }

    public Boolean getCanPostStories() {
        return canPostStories;
    }

    public ChatMember setCanPostStories(Boolean canPostStories) {
        this.canPostStories = canPostStories;
        return this;
    }

    public Boolean getCanEditStories() {
        return canEditStories;
    }

    public ChatMember setCanEditStories(Boolean canEditStories) {
        this.canEditStories = canEditStories;
        return this;
    }

    public Boolean getCanDeleteStories() {
        return canDeleteStories;
    }

    public ChatMember setCanDeleteStories(Boolean canDeleteStories) {
        this.canDeleteStories = canDeleteStories;
        return this;
    }

    public Integer getUntilDate() {
        return untilDate;
    }

    public ChatMember setUntilDate(Integer untilDate) {
        this.untilDate = untilDate;
        return this;
    }
}