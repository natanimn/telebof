package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.enums.ChatMemberStatus;

import java.util.Objects;

/**
 * This object contains information about one member of a chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.0.0
 */
public class ChatMember {
    /**
     * 	The member's status in the chat.
     */
    public ChatMemberStatus status;

    /**
     * Optional. Custom title for this user
     */
    public String custom_title;

    /**
     * Information about the user
     */
    public User user;

    /**
     * True, if the bot is allowed to edit administrator privileges of that user
     */
    public Boolean can_be_edited;

    /**
     * True, if the user's presence in the chat is hidden
     */
    public Boolean is_anonymous;

    /**
     * True, if the administrator can access the chat event log, get boost list, see hidden supergroup and channel members,
     * report spam messages, ignore slow mode, and send messages to the chat without paying Telegram Stars.
     * Implied by any other administrator privilege.
     */
    public Boolean can_manage_chat;

    /**
     * True, if the administrator can delete messages of other users
     */
    public Boolean can_delete_messages;

    /**
     * True, if the administrator can manage video chats
     */
    public Boolean can_manage_video_chats;

    /**
     * True, if the administrator can restrict, ban or unban chat members, or access supergroup statistics
     */
    public Boolean can_restrict_members;

    /**
     * True, if the administrator can add new administrators with a subset of their own privileges or demote administrators that they have promoted,
     * directly or indirectly (promoted by administrators that were appointed by the user)
     */
    public Boolean can_promote_members;

    /**
     * True, if the user is allowed to change the chat title, photo and other settings
     */
    public Boolean can_change_info;

    /**
     * True, if the user is allowed to invite new users to the chat
     */
    public Boolean can_invite_users;

    /**
     * Optional. True, if the administrator can post messages in the channel, approve suggested posts, or access channel statistics; for channels only
     */
    public Boolean can_post_messages;

    /**
     * Optional. True, if the administrator can edit messages of other users and can pin messages; for channels only
     */
    public Boolean can_edit_messages;

    /**
     * Optional. True, if the user is allowed to pin messages; for groups and supergroups only
     */
    public Boolean can_pin_messages;

    /**
     * Optional. True, if the user is allowed to create, rename, close, and reopen forum topics; for supergroups only
     */
    public Boolean can_manage_topics;

    /**
     * True, if the user is a member of the chat at the moment of the request
     */
    public Boolean is_member;

    /**
     * True, if the user is allowed to send text messages, contacts, giveaways, giveaway winners, invoices, locations and venues
     */
    public Boolean can_send_messages;

    /**
     * True, if the user is allowed to send audios
     */
    public Boolean can_send_audios;

    /**
     * True, if the user is allowed to send documents
     */
    public Boolean can_send_documents;

    /**
     * True, if the user is allowed to send photos
     */
    public Boolean can_send_photos;

    /**
     * True, if the user is allowed to send videos
     */
    public Boolean can_send_videos;

    /**
     * True, if the user is allowed to send video notes
     */
    public Boolean can_send_video_notes;

    /**
     * True, if the user is allowed to send voice notes
     */
    public Boolean can_send_voice_votes;

    /**
     * True, if the user is allowed to send polls and checklists
     */
    public Boolean can_send_polls;

    /**
     * True, if the user is allowed to send animations, games, stickers and use inline bots
     */
    public Boolean can_send_other_messages;

    /**
     * True, if the user is allowed to add web page previews to their messages
     */
    public Boolean can_add_web_page_previews;

    /**
     * True, if the administrator can post stories to the chat
     */
    public Boolean can_post_stories;

    /**
     * True, if the administrator can edit stories posted by other users, post stories to the chat page, pin chat stories, and access the chat's story archive
     */
    public Boolean can_edit_stories;

    /**
     * True, if the administrator can delete stories posted by other users
     */
    public Boolean can_delete_stories;

    /**
     * Optional. Date when the user's subscription will expire; Unix time
     */
    public Integer until_date;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatMember that = (ChatMember) object;
        return Objects.equals(status, that.status) &&
                Objects.equals(custom_title, that.custom_title) &&
                Objects.equals(user, that.user) &&
                Objects.equals(can_be_edited, that.can_be_edited) &&
                Objects.equals(is_anonymous, that.is_anonymous) &&
                Objects.equals(can_manage_chat, that.can_manage_chat) &&
                Objects.equals(can_delete_messages, that.can_delete_messages) &&
                Objects.equals(can_manage_video_chats, that.can_manage_video_chats) &&
                Objects.equals(can_restrict_members, that.can_restrict_members) &&
                Objects.equals(can_promote_members, that.can_promote_members) &&
                Objects.equals(can_change_info, that.can_change_info) &&
                Objects.equals(can_invite_users, that.can_invite_users) &&
                Objects.equals(can_post_messages, that.can_post_messages) &&
                Objects.equals(can_edit_messages, that.can_edit_messages) &&
                Objects.equals(can_pin_messages, that.can_pin_messages) &&
                Objects.equals(can_manage_topics, that.can_manage_topics) &&
                Objects.equals(is_member, that.is_member) &&
                Objects.equals(can_send_messages, that.can_send_messages) &&
                Objects.equals(can_send_audios, that.can_send_audios) &&
                Objects.equals(can_send_documents, that.can_send_documents) &&
                Objects.equals(can_send_photos, that.can_send_photos) &&
                Objects.equals(can_send_videos, that.can_send_videos) &&
                Objects.equals(can_send_video_notes, that.can_send_video_notes) &&
                Objects.equals(can_send_voice_votes, that.can_send_voice_votes) &&
                Objects.equals(can_send_polls, that.can_send_polls) &&
                Objects.equals(can_send_other_messages, that.can_send_other_messages) &&
                Objects.equals(can_add_web_page_previews, that.can_add_web_page_previews) &&
                Objects.equals(can_post_stories, that.can_post_stories) &&
                Objects.equals(can_edit_stories, that.can_edit_stories) &&
                Objects.equals(can_delete_stories, that.can_delete_stories) &&
                Objects.equals(until_date, that.until_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, custom_title, user, can_be_edited, is_anonymous, can_manage_chat,
                can_delete_messages, can_manage_video_chats, can_restrict_members, can_promote_members,
                can_change_info, can_invite_users, can_post_messages, can_edit_messages, can_pin_messages,
                can_manage_topics, is_member, can_send_messages, can_send_audios, can_send_documents,
                can_send_photos, can_send_videos, can_send_video_notes, can_send_voice_votes, can_send_polls,
                can_send_other_messages, can_add_web_page_previews, can_post_stories, can_edit_stories,
                can_delete_stories, until_date);
    }
}
