package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Represents the rights of an administrator in a chat.
 * @author Natanim
 * @since 0.1
 */
@Getter
@Setter
@Accessors(chain = true)
public class ChatAdministratorRights implements Serializable {
    /**
     * True, if the user's presence in the chat is hidden
     */
    @SerializedName("is_anonymous")
    private boolean isAnonymous;

    /**
     * True, if the administrator can access the chat event log, get boost list, see hidden supergroup and channel members, report spam messages, ignore slow mode, and send messages to the chat without paying Telegram Stars. Implied by any other administrator privilege.
     */
    @SerializedName("can_manage_chat")
    private boolean canManageChat;

    /**
     * True, if the administrator can delete messages of other user
     */
    @SerializedName("can_delete_messages")
    private boolean canDeleteMessages;

    /**
     * True, if the administrator can manage video chats
     */
    @SerializedName("can_manage_video_chats")
    private boolean canManageVideoChats;

    /**
     * True, if the administrator can restrict, ban or unban chat members, or access supergroup statistics
     */
    @SerializedName("can_restrict_members")
    private boolean canRestrictMembers;

    /**
     * True, if the administrator can add new administrators with a subset of their own privileges or demote administrators that they have promoted, directly or indirectly (promoted by administrators that were appointed by the user)
     */
    @SerializedName("can_promote_members")
    private boolean canPromoteMembers;

    /**
     * True, if the user is allowed to change the chat title, photo and other settings
     */
    @SerializedName("can_change_info")
    private boolean canChangeInfo;

    /**
     * True, if the user is allowed to invite new users to the chat
     */
    @SerializedName("can_invite_users")
    private boolean canInviteUsers;

    /**
     * True, if the administrator can post messages in the channel, approve suggested posts, or access channel statistics; for channels only
     */
    @SerializedName("can_post_messages")
    private boolean canPostMessages;

    /**
     * True, if the administrator can edit messages of other users and can pin messages; for channels only
     */
    @SerializedName("can_edit_messages")
    private boolean canEditMessages;

    /**
     * True, if the user is allowed to pin messages; for groups and supergroups only
     */
    @SerializedName("can_pin_messages")
    private boolean canPinMessages;

    /**
     * True, if the user is allowed to create, rename, close, and reopen forum topics; for supergroups only
     */
    @SerializedName("can_manage_topics")
    private boolean canManageTopics;

    /**
     * True, if the administrator can post stories to the chat
     */
    @SerializedName("can_post_stories")
    private boolean canPostStories;

    /**
     * True, if the administrator can edit stories posted by other users, post stories to the chat page, pin chat stories, and access the chat's story archive
     */
    @SerializedName("can_edit_stories")
    private boolean canEditStories;

    /**
     * True, if the administrator can delete stories posted by other users
     */
    @SerializedName("can_delete_stories")
    private boolean canDeleteStories;

    /**
     * True, if the administrator can manage direct messages of the channel and decline suggested posts; for channels only
     */
    @SerializedName("can_manage_direct_messages")
    private boolean canManageDirectMessages;

    /**
     * Optional. True, if the administrator can edit the tags of regular members; for groups and supergroups only.
     * If omitted defaults to the value of can_pin_messages.
     */
    @SerializedName("can_manage_tags")
    private boolean canManageTags;

    /**
     * True, if the administrator can manage chat welcome messages or directly send them in the case of bots
     */
    @SerializedName("can_send_welcome_messages")
    private boolean canSendWelcomeMessages;
}