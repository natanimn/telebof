package io.github.natanimn.types.chat_and_user;

import io.github.natanimn.types.business.BusinessIntro;
import io.github.natanimn.types.business.BusinessLocation;
import io.github.natanimn.types.business.BusinessOpeningHours;
import io.github.natanimn.types.media_and_service.Birthdate;
import io.github.natanimn.types.media_and_service.Location;
import io.github.natanimn.types.media_and_service.ReactionType;
import io.github.natanimn.types.updates.Message;

import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class ChatFullInfo{
    public long id;
    public String type, title, username, first_name, last_name;
    public Boolean is_forum;
    public ChatPhoto photo;
    public List<String> active_usernames;
    public String emoji_status_custom_emoji_id, bio;
    public Boolean has_private_forwards, has_restricted_voice_and_video_messages, join_to_send_messages, join_by_request;
    public String description, invite_link;
    public Message pinned_message;
    public ChatPermission permissions;
    public Integer slow_mode_delay, message_auto_delete_time;
    public Boolean has_aggressive_anti_spam_enabled, has_hidden_members, has_protected_content;
    public String sticker_set_name;
    public Boolean can_set_sticker_set;
    public Integer linked_chat_id;
    public Location location;
    public Integer emoji_status_expiration_date;
    public List<ReactionType> available_reactions;
    public Boolean has_visible_history;
    public Integer accent_color_id, max_reaction_count;
    public String background_custom_emoji_id;
    public Integer profile_accent_color_id;
    public String profile_background_custom_emoji_id;
    public Integer unrestrict_boost_count;
    public String custom_emoji_sticker_set_name;
    public BusinessIntro business_intro;
    public BusinessLocation business_location;
    public BusinessOpeningHours business_opening_hours;
    public Chat personal_chat;
    public Birthdate birthdate;
    public Boolean can_send_paid_media;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatFullInfo that = (ChatFullInfo) object;
        return id == that.id && Objects.equals(type, that.type) &&
                Objects.equals(title, that.title) &&
                Objects.equals(username, that.username) &&
                Objects.equals(first_name, that.first_name) &&
                Objects.equals(last_name, that.last_name) &&
                Objects.equals(is_forum, that.is_forum) &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(active_usernames, that.active_usernames) &&
                Objects.equals(emoji_status_custom_emoji_id, that.emoji_status_custom_emoji_id) &&
                Objects.equals(bio, that.bio) && Objects.equals(has_private_forwards, that.has_private_forwards) &&
                Objects.equals(has_restricted_voice_and_video_messages, that.has_restricted_voice_and_video_messages) &&
                Objects.equals(join_to_send_messages, that.join_to_send_messages) &&
                Objects.equals(join_by_request, that.join_by_request) &&
                Objects.equals(description, that.description) &&
                Objects.equals(invite_link, that.invite_link) &&
                Objects.equals(pinned_message, that.pinned_message) &&
                Objects.equals(permissions, that.permissions) &&
                Objects.equals(slow_mode_delay, that.slow_mode_delay) &&
                Objects.equals(message_auto_delete_time, that.message_auto_delete_time) &&
                Objects.equals(has_aggressive_anti_spam_enabled, that.has_aggressive_anti_spam_enabled) &&
                Objects.equals(has_hidden_members, that.has_hidden_members) &&
                Objects.equals(has_protected_content, that.has_protected_content) &&
                Objects.equals(sticker_set_name, that.sticker_set_name) &&
                Objects.equals(can_set_sticker_set, that.can_set_sticker_set) &&
                Objects.equals(linked_chat_id, that.linked_chat_id) &&
                Objects.equals(location, that.location) &&
                Objects.equals(emoji_status_expiration_date, that.emoji_status_expiration_date) &&
                Objects.equals(available_reactions, that.available_reactions) &&
                Objects.equals(has_visible_history, that.has_visible_history) &&
                Objects.equals(accent_color_id, that.accent_color_id) &&
                Objects.equals(max_reaction_count, that.max_reaction_count) &&
                Objects.equals(background_custom_emoji_id, that.background_custom_emoji_id) &&
                Objects.equals(profile_accent_color_id, that.profile_accent_color_id) &&
                Objects.equals(profile_background_custom_emoji_id, that.profile_background_custom_emoji_id) &&
                Objects.equals(unrestrict_boost_count, that.unrestrict_boost_count) &&
                Objects.equals(custom_emoji_sticker_set_name, that.custom_emoji_sticker_set_name) &&
                Objects.equals(business_intro, that.business_intro) &&
                Objects.equals(business_location, that.business_location) &&
                Objects.equals(business_opening_hours, that.business_opening_hours) &&
                Objects.equals(personal_chat, that.personal_chat) &&
                Objects.equals(birthdate, that.birthdate) &&
                Objects.equals(can_send_paid_media, that.can_send_paid_media);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, title, username, first_name, last_name, is_forum, photo, active_usernames,
                emoji_status_custom_emoji_id, bio, has_private_forwards, has_restricted_voice_and_video_messages,
                join_to_send_messages, join_by_request, description, invite_link, pinned_message, permissions,
                slow_mode_delay, message_auto_delete_time, has_aggressive_anti_spam_enabled, has_hidden_members,
                has_protected_content, sticker_set_name, can_set_sticker_set, linked_chat_id, location,
                emoji_status_expiration_date, available_reactions, has_visible_history, accent_color_id,
                max_reaction_count, background_custom_emoji_id, profile_accent_color_id, profile_background_custom_emoji_id,
                unrestrict_boost_count, custom_emoji_sticker_set_name, business_intro, business_location,
                business_opening_hours, personal_chat, birthdate, can_send_paid_media);
    }

    @Override
    public String toString() {
        return "ChatFullInfo{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", is_forum=" + is_forum +
                ", photo=" + photo +
                ", active_usernames=" + active_usernames +
                ", emoji_status_custom_emoji_id='" + emoji_status_custom_emoji_id + '\'' +
                ", bio='" + bio + '\'' +
                ", has_private_forwards=" + has_private_forwards +
                ", has_restricted_voice_and_video_messages=" + has_restricted_voice_and_video_messages +
                ", join_to_send_messages=" + join_to_send_messages +
                ", join_by_request=" + join_by_request +
                ", description='" + description + '\'' +
                ", invite_link='" + invite_link + '\'' +
                ", pinned_message=" + pinned_message +
                ", permissions=" + permissions +
                ", slow_mode_delay=" + slow_mode_delay +
                ", message_auto_delete_time=" + message_auto_delete_time +
                ", has_aggressive_anti_spam_enabled=" + has_aggressive_anti_spam_enabled +
                ", has_hidden_members=" + has_hidden_members +
                ", has_protected_content=" + has_protected_content +
                ", sticker_set_name='" + sticker_set_name + '\'' +
                ", can_set_sticker_set=" + can_set_sticker_set +
                ", linked_chat_id=" + linked_chat_id +
                ", location=" + location +
                ", emoji_status_expiration_date=" + emoji_status_expiration_date +
                ", available_reactions=" + available_reactions +
                ", has_visible_history=" + has_visible_history +
                ", accent_color_id=" + accent_color_id +
                ", max_reaction_count=" + max_reaction_count +
                ", background_custom_emoji_id='" + background_custom_emoji_id + '\'' +
                ", profile_accent_color_id=" + profile_accent_color_id +
                ", profile_background_custom_emoji_id='" + profile_background_custom_emoji_id + '\'' +
                ", unrestrict_boost_count=" + unrestrict_boost_count +
                ", custom_emoji_sticker_set_name='" + custom_emoji_sticker_set_name + '\'' +
                ", business_intro=" + business_intro +
                ", business_location=" + business_location +
                ", business_opening_hours=" + business_opening_hours +
                ", personal_chat=" + personal_chat +
                ", birthdate=" + birthdate +
                ", can_send_paid_media=" + can_send_paid_media +
                '}';
    }
}
