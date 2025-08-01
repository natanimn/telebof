package io.github.natanimn.types.chat_and_user;


import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class ChatMember implements Serializable {
    public String status, custom_title;
    public User user;

    public Boolean can_be_edited, is_anonymous, can_manage_chat, can_delete_messages, can_manage_video_chats,
            can_restrict_members, can_promote_members, can_change_info, can_invite_users,
            can_post_messages, can_edit_messages, can_pin_messages, can_manage_topics;

    public Boolean is_member, can_send_messages, can_send_audios, can_send_documents,
            can_send_photos, can_send_videos, can_send_video_notes, can_send_voice_votes, can_send_polls,
            can_send_other_messages, can_add_web_page_previews;

    public Boolean can_post_stories, can_edit_stories, can_delete_stories;

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








