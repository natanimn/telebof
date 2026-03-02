package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.enums.ChatMemberStatus;
import com.google.gson.annotations.SerializedName;

/**
 * This object contains information about one member of a chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.5.0
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

    /**
     * Optional. Tag of the member
     */
    private String tag;

    /**
     * True, if the user is allowed to edit their own tag
     */
    @SerializedName("can_edit_tag")
    private Boolean canEditTag;

    /**
     * Optional. True, if the administrator can edit the tags of regular members; for groups and supergroups only.
     * If omitted defaults to the value of can_pin_messages.
     */
    @SerializedName("can_manage_tags")
    private Boolean canManageTags;

    public ChatMemberStatus getStatus() {
        return status;
    }

    public String getCustomTitle() {
        return customTitle;
    }

    public User getUser() {
        return user;
    }

    public Boolean getCanBeEdited() {
        return canBeEdited;
    }

    public Boolean getAnonymous() {
        return isAnonymous;
    }

    public Boolean getCanManageChat() {
        return canManageChat;
    }

    public Boolean getCanDeleteMessages() {
        return canDeleteMessages;
    }

    public Boolean getCanManageVideoChats() {
        return canManageVideoChats;
    }

    public Boolean getCanRestrictMembers() {
        return canRestrictMembers;
    }

    public Boolean getCanPromoteMembers() {
        return canPromoteMembers;
    }

    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    public Boolean getCanPostMessages() {
        return canPostMessages;
    }

    public Boolean getCanEditMessages() {
        return canEditMessages;
    }

    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    public Boolean getCanManageTopics() {
        return canManageTopics;
    }

    public Boolean getMember() {
        return isMember;
    }

    public Boolean getCanSendMessages() {
        return canSendMessages;
    }

    public Boolean getCanSendAudios() {
        return canSendAudios;
    }

    public Boolean getCanSendDocuments() {
        return canSendDocuments;
    }

    public Boolean getCanSendPhotos() {
        return canSendPhotos;
    }

    public Boolean getCanSendVideos() {
        return canSendVideos;
    }

    public Boolean getCanSendVideoNotes() {
        return canSendVideoNotes;
    }

    public Boolean getCanSendVoiceVotes() {
        return canSendVoiceVotes;
    }

    public Boolean getCanSendPolls() {
        return canSendPolls;
    }

    public Boolean getCanSendOtherMessages() {
        return canSendOtherMessages;
    }

    public Boolean getCanAddWebPagePreviews() {
        return canAddWebPagePreviews;
    }

    public Boolean getCanPostStories() {
        return canPostStories;
    }

    public Boolean getCanEditStories() {
        return canEditStories;
    }

    public Boolean getCanDeleteStories() {
        return canDeleteStories;
    }

    public Integer getUntilDate() {
        return untilDate;
    }

    public String getTag() {
        return tag;
    }

    public Boolean getCanEditTag() {
        return canEditTag;
    }

    public Boolean getCanManageTags() {
        return canManageTags;
    }
}