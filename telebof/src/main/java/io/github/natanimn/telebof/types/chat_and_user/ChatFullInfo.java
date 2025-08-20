package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.business.BusinessIntro;
import io.github.natanimn.telebof.types.business.BusinessLocation;
import io.github.natanimn.telebof.types.business.BusinessOpeningHours;
import io.github.natanimn.telebof.types.gift_and_giveaway.AcceptedGiftTypes;
import io.github.natanimn.telebof.types.media_and_service.Birthdate;
import io.github.natanimn.telebof.types.media_and_service.Location;
import io.github.natanimn.telebof.types.media_and_service.ReactionType;
import io.github.natanimn.telebof.types.updates.Message;
import java.util.List;
import java.util.Objects;

/**
 * This object contains full information about a chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.0.0
 */
public class ChatFullInfo extends Chat{
    /**
     * Chat photo
     */
    public ChatPhoto photo;

    /**
     * If non-empty, the list of all <a href="https://telegram.org/blog/topics-in-groups-collectible-usernames#collectible-usernames">active chat usernames</a>;
     * for private chats, supergroups and channels
     */
    public List<String> active_usernames;

    /**
     * Custom emoji identifier of the emoji status of the chat or the other party in a private chat
     */
    public String emoji_status_custom_emoji_id;

    /**
     * Bio of the other party in a private chat
     */
    public String bio;

    /**
     * True, if privacy settings of the other party in the private chat allows to use tg://user?id=<user_id> links only in chats with the user
     */
    public Boolean has_private_forwards;

    /**
     * True, if the privacy settings of the other party restrict sending voice and video note messages in the private chat
     */
    public Boolean has_restricted_voice_and_video_messages;

    /**
     * True, if users need to join the supergroup before they can send messages
     */
    public Boolean join_to_send_messages;

    /**
     * True, if all users directly joining the supergroup without using an invite link need to be approved by supergroup administrators
     */
    public Boolean join_by_request;

    /**
     * Description, for groups, supergroups and channel chats
     */
    public String description;

    /**
     * Primary invite link, for groups, supergroups and channel chats
     */
    public String invite_link;

    /**
     * The most recent pinned message (by sending date)
     */
    public Message pinned_message;

    /**
     * Default chat member permissions, for groups and supergroups
     */
    public ChatPermissions permissions;

    /**
     * For supergroups, the minimum allowed delay between consecutive messages sent by each unprivileged user; in seconds
     */
    public Integer slow_mode_delay;

    /**
     * The time after which all messages sent to the chat will be automatically deleted; in seconds
     */
    public Integer message_auto_delete_time;

    /**
     * True, if aggressive anti-spam checks are enabled in the supergroup. The field is only available to chat administrators.
     */
    public Boolean has_aggressive_anti_spam_enabled;

    /**
     * True, if non-administrators can only get the list of bots and administrators in the chat
     */
    public Boolean has_hidden_members;

    /**
     * True, if messages from the chat can't be forwarded to other chats
     */
    public Boolean has_protected_content;

    /**
     * For supergroups, name of the group sticker set
     */
    public String sticker_set_name;

    /**
     * True, if the bot can change the group sticker set
     */
    public Boolean can_set_sticker_set;

    /**
     *  Unique identifier for the linked chat, i.e. the discussion group identifier for a channel and vice versa;
     *  for supergroups and channel chats.
     */
    public Long linked_chat_id;

    /**
     *  For supergroups, the location to which the supergroup is connected
     */
    public Location location;

    /**
     * Expiration date of the emoji status of the chat or the other party in a private chat, in Unix time, if any
     */
    public Integer emoji_status_expiration_date;

    /**
     * List of available reactions allowed in the chat. If omitted, then all <a href="https://core.telegram.org/bots/api#reactiontypeemoji">emoji reactions</a> are allowed.
     */
    public List<ReactionType> available_reactions;

    /**
     * True, if new chat members will have access to old messages; available only to chat administrators
     */
    public Boolean has_visible_history;

    /**
     * Identifier of the accent color for the chat name and backgrounds of the chat photo, reply header, and link preview.
     * @see <a href="https://core.telegram.org/bots/api#accent-colors">accent colors</a> for more details.
     */
    public Integer accent_color_id;

    /**
     * The maximum number of reactions that can be set on a message in the chat
     */
    public Integer max_reaction_count;

    /**
     *  Custom emoji identifier of the emoji chosen by the chat for the reply header and link preview background
     */
    public String background_custom_emoji_id;

    /**
     * Identifier of the accent color for the chat's profile background.
     * @see <a href="https://core.telegram.org/bots/api#profile-accent-colors">profile accent</a> colors for more details.
     */
    public Integer profile_accent_color_id;

    /**
     * Custom emoji identifier of the emoji chosen by the chat for its profile background
     */
    public String profile_background_custom_emoji_id;

    /**
     * For supergroups, the minimum number of boosts that a non-administrator user needs to add in order to ignore slow mode and chat permissions
     */
    public Integer unrestrict_boost_count;

    /**
     * For supergroups, the name of the group's custom emoji sticker set.
     * Custom emoji from this set can be used by all users and bots in the group.
     */
    public String custom_emoji_sticker_set_name;

    /**
     * For private chats with business accounts, the intro of the business
     */
    public BusinessIntro business_intro;

    /**
     * For private chats with business accounts, the location of the business
     */
    public BusinessLocation business_location;

    /**
     * For private chats with business accounts, the opening hours of the business
     */
    public BusinessOpeningHours business_opening_hours;

    /**
     * For private chats, the personal channel of the user
     */
    public Chat personal_chat;

    /**
     * For private chats, the date of birth of the user
     */
    public Birthdate birthdate;

    /**
     * True, if paid media messages can be sent or forwarded to the channel chat. The field is available only for channel chats.
     */
    public Boolean can_send_paid_media;

    /**
     * Information about types of gifts that are accepted by the chat or by the corresponding user for private chats
     */
    public AcceptedGiftTypes accepted_gift_types;

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
                Objects.equals(can_send_paid_media, that.can_send_paid_media) &&
                Objects.equals(accepted_gift_types, that.accepted_gift_types);
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
                business_opening_hours, personal_chat, birthdate, can_send_paid_media, accepted_gift_types);
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
                ", accepted_gift_types=" + accepted_gift_types +
                '}';
    }
}
