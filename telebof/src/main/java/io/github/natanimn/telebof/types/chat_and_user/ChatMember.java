package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.enums.ChatMemberStatus;
import com.google.gson.annotations.SerializedName;

/**
 * This object contains information about one member of a chat.
 * @param status The member's status in the chat.
 * @param customTitle Optional. Custom title for this user
 * @param user Information about the user
 * @param canBeEdited True, if the bot is allowed to edit administrator privileges of that user
 * @param isAnonymous True, if the user's presence in the chat is hidden
 * @param canManageChat True, if the administrator can access the chat event log, get boost list, see hidden supergroup and channel members, report spam messages, ignore slow mode, and send messages to the chat without paying Telegram Stars. Implied by any other administrator privilege.
 * @param canDeleteMessages True, if the administrator can delete messages of other users
 * @param canManageVideoChats True, if the administrator can manage video chats
 * @param canRestrictMembers True, if the administrator can restrict, ban or unban chat members, or access supergroup statistics
 * @param canPromoteMembers True, if the administrator can add new administrators with a subset of their own privileges or demote administrators that they have promoted, directly or indirectly (promoted by administrators that were appointed by the user)
 * @param canChangeInfo True, if the user is allowed to change the chat title, photo and other settings
 * @param canInviteUsers True, if the user is allowed to invite new users to the chat
 * @param canPostMessages Optional. True, if the administrator can post messages in the channel, approve suggested posts, or access channel statistics; for channels only
 * @param canEditMessages Optional. True, if the administrator can edit messages of other users and can pin messages; for channels only
 * @param canPinMessages Optional. True, if the user is allowed to pin messages; for groups and supergroups only
 * @param canManageTopics Optional. True, if the user is allowed to create, rename, close, and reopen forum topics; for supergroups only
 * @param isMember True, if the user is a member of the chat at the moment of the request
 * @param canSendMessages True, if the user is allowed to send text messages, contacts, giveaways, giveaway winners, invoices, locations and venues
 * @param canSendAudios True, if the user is allowed to send audios
 * @param canSendDocuments True, if the user is allowed to send documents
 * @param canSendPhotos True, if the user is allowed to send photos
 * @param canSendVideos True, if the user is allowed to send videos
 * @param canSendVideoNotes True, if the user is allowed to send video notes
 * @param canSendVoiceVotes True, if the user is allowed to send voice notes
 * @param canSendPolls True, if the user is allowed to send polls and checklists
 * @param canSendOtherMessages True, if the user is allowed to send animations, games, stickers and use inline bots
 * @param canAddWebPagePreviews True, if the user is allowed to add web page previews to their messages
 * @param canPostStories True, if the administrator can post stories to the chat
 * @param canEditStories True, if the administrator can edit stories posted by other users, post stories to the chat page, pin chat stories, and access the chat's story archive
 * @param canDeleteStories True, if the administrator can delete stories posted by other users
 * @param untilDate Optional. Date when the user's subscription will expire; Unix time
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ChatMember(
        ChatMemberStatus status,
        @SerializedName("custom_title") String customTitle,
        User user,
        @SerializedName("can_be_edited") Boolean canBeEdited,
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
        @SerializedName("is_member") Boolean isMember,
        @SerializedName("can_send_messages") Boolean canSendMessages,
        @SerializedName("can_send_audios") Boolean canSendAudios,
        @SerializedName("can_send_documents") Boolean canSendDocuments,
        @SerializedName("can_send_photos") Boolean canSendPhotos,
        @SerializedName("can_send_videos") Boolean canSendVideos,
        @SerializedName("can_send_video_notes") Boolean canSendVideoNotes,
        @SerializedName("can_send_voice_votes") Boolean canSendVoiceVotes,
        @SerializedName("can_send_polls") Boolean canSendPolls,
        @SerializedName("can_send_other_messages") Boolean canSendOtherMessages,
        @SerializedName("can_add_web_page_previews") Boolean canAddWebPagePreviews,
        @SerializedName("can_post_stories") Boolean canPostStories,
        @SerializedName("can_edit_stories") Boolean canEditStories,
        @SerializedName("can_delete_stories") Boolean canDeleteStories,
        @SerializedName("until_date") Integer untilDate
) {}