package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/** Message class.
 * @author Natanim Negash
 */

/**
 * Natanim Negash
 *  3 March 2025
 */
public class Message implements Serializable {
    public Integer message_id, message_thread_id, date, edit_date;
    public Long migrate_to_chat_id, migrate_from_chat_id;
    public String author_signature, text, caption,
            new_chat_title, connected_website, media_group_id, business_connection_id;
    public User from, via_bot, left_chat_member, sender_business_bot;
    public List<User> new_chat_members;
    public Chat sender_chat, chat;
    public Boolean is_topic, is_topic_message, is_automatic_forward, has_protected_content, is_from_online,
            has_media_spoiler, delete_chat_photo, group_chat_created, supergroup_chat_created, channel_chat_created;
    public Message reply_to_message, pinned_message;
    public List<MessageEntity> entities, caption_entities;
    public Animation animation;
    public Audio audio;
    public Document document;
    public List<PhotoSize> photo, new_chat_photo;
    public Sticker sticker;
    public Video video;
    public VideoNote video_note;
    public Voice voice;
    public Contact contact;
    public Dice dice;
    public Game game;
    public Poll poll;
    public Story story;
    public Venue venue;
    public Location location;
    public Integer message_auto_delete_timer_changed;
    public Invoice invoice;
    public SuccessfulPayment successful_payment;
    public UsersShared users_shared;
    public ChatShared chat_shared;
    public WriteAccessAllowed write_access_allowed;
    public PassportData passport_data;
    public ProximityAlertTriggered proximity_alert_triggered;
    public ForumTopicCreated forum_topic_created;
    public ForumTopicEdited forum_topic_edited;
    public ForumTopicClosed forum_topic_closed;
    public ForumTopicReopened forum_topic_reopened;
    public GeneralForumTopicHidden general_forum_topic_hidden;
    public GeneralForumTopicUnhidden general_forum_topic_unhidden;
    public VideoChatScheduled video_chat_scheduled;
    public VideoChatStarted video_chat_started;
    public VideoChatEnded video_chat_ended;
    public VideoChatParticipantsInvited video_chat_participants_invited;
    public WebAppData web_app_data;
    public InlineKeyboardMarkup reply_markup;
    public ExternalReplyInfo external_reply;
    public TextQuote quote;
    public LinkPreviewOptions link_preview_options;
    public Giveaway giveaway;
    public GiveawayCreated giveaway_created;
    public GiveawayWinners giveaway_winners;
    public GiveawayCompleted giveaway_completed;
    public MessageOrigin forward_origin;
    public ChatBoostAdded boost_added;
    public Integer sender_boost_count;
    public Story reply_to_story;
    public ChatBackground chat_background_set;
    public String effect_id;
    public Boolean show_caption_above_media;
    public PaidMediaInfo paid_media;
    public RefundedPayment refunded_payment;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Message message = (Message) object;
        return Objects.equals(message_id, message.message_id) &&
                Objects.equals(message_thread_id, message.message_thread_id) &&
                Objects.equals(date, message.date) && Objects.equals(edit_date, message.edit_date) &&
                Objects.equals(migrate_to_chat_id, message.migrate_to_chat_id) &&
                Objects.equals(migrate_from_chat_id, message.migrate_from_chat_id) &&
                Objects.equals(author_signature, message.author_signature) && Objects.equals(text, message.text) &&
                Objects.equals(caption, message.caption) && Objects.equals(new_chat_title, message.new_chat_title) &&
                Objects.equals(connected_website, message.connected_website) &&
                Objects.equals(media_group_id, message.media_group_id) &&
                Objects.equals(business_connection_id, message.business_connection_id) &&
                Objects.equals(from, message.from) && Objects.equals(via_bot, message.via_bot) &&
                Objects.equals(left_chat_member, message.left_chat_member) &&
                Objects.equals(sender_business_bot, message.sender_business_bot) &&
                Objects.equals(new_chat_members, message.new_chat_members) &&
                Objects.equals(sender_chat, message.sender_chat) && Objects.equals(chat, message.chat) &&
                Objects.equals(is_topic, message.is_topic) &&
                Objects.equals(is_topic_message, message.is_topic_message) &&
                Objects.equals(is_automatic_forward, message.is_automatic_forward) &&
                Objects.equals(has_protected_content, message.has_protected_content) &&
                Objects.equals(is_from_online, message.is_from_online) &&
                Objects.equals(has_media_spoiler, message.has_media_spoiler) &&
                Objects.equals(delete_chat_photo, message.delete_chat_photo) &&
                Objects.equals(group_chat_created, message.group_chat_created) &&
                Objects.equals(supergroup_chat_created, message.supergroup_chat_created) &&
                Objects.equals(channel_chat_created, message.channel_chat_created) &&
                Objects.equals(reply_to_message, message.reply_to_message) &&
                Objects.equals(pinned_message, message.pinned_message) &&
                Objects.equals(entities, message.entities) &&
                Objects.equals(caption_entities, message.caption_entities) &&
                Objects.equals(animation, message.animation) && Objects.equals(audio, message.audio) &&
                Objects.equals(document, message.document) && Objects.equals(photo, message.photo) &&
                Objects.equals(new_chat_photo, message.new_chat_photo) && Objects.equals(sticker, message.sticker) &&
                Objects.equals(video, message.video) && Objects.equals(video_note, message.video_note) &&
                Objects.equals(voice, message.voice) && Objects.equals(contact, message.contact) &&
                Objects.equals(dice, message.dice) && Objects.equals(game, message.game) &&
                Objects.equals(poll, message.poll) && Objects.equals(story, message.story) &&
                Objects.equals(venue, message.venue) && Objects.equals(location, message.location) &&
                Objects.equals(message_auto_delete_timer_changed, message.message_auto_delete_timer_changed) &&
                Objects.equals(invoice, message.invoice) &&
                Objects.equals(successful_payment, message.successful_payment) &&
                Objects.equals(users_shared, message.users_shared) &&
                Objects.equals(chat_shared, message.chat_shared) &&
                Objects.equals(write_access_allowed, message.write_access_allowed) &&
                Objects.equals(passport_data, message.passport_data) &&
                Objects.equals(proximity_alert_triggered, message.proximity_alert_triggered) &&
                Objects.equals(forum_topic_created, message.forum_topic_created) &&
                Objects.equals(forum_topic_edited, message.forum_topic_edited) &&
                Objects.equals(forum_topic_closed, message.forum_topic_closed) &&
                Objects.equals(forum_topic_reopened, message.forum_topic_reopened) &&
                Objects.equals(general_forum_topic_hidden, message.general_forum_topic_hidden) &&
                Objects.equals(general_forum_topic_unhidden, message.general_forum_topic_unhidden) &&
                Objects.equals(video_chat_scheduled, message.video_chat_scheduled) &&
                Objects.equals(video_chat_started, message.video_chat_started) &&
                Objects.equals(video_chat_ended, message.video_chat_ended) &&
                Objects.equals(video_chat_participants_invited, message.video_chat_participants_invited) &&
                Objects.equals(web_app_data, message.web_app_data) &&
                Objects.equals(reply_markup, message.reply_markup) &&
                Objects.equals(external_reply, message.external_reply) &&
                Objects.equals(quote, message.quote) &&
                Objects.equals(link_preview_options, message.link_preview_options) &&
                Objects.equals(giveaway, message.giveaway) &&
                Objects.equals(giveaway_created, message.giveaway_created) &&
                Objects.equals(giveaway_winners, message.giveaway_winners) &&
                Objects.equals(giveaway_completed, message.giveaway_completed) &&
                Objects.equals(forward_origin, message.forward_origin) &&
                Objects.equals(boost_added, message.boost_added) &&
                Objects.equals(sender_boost_count, message.sender_boost_count) &&
                Objects.equals(reply_to_story, message.reply_to_story) &&
                Objects.equals(chat_background_set, message.chat_background_set) &&
                Objects.equals(effect_id, message.effect_id) &&
                Objects.equals(show_caption_above_media, message.show_caption_above_media) &&
                Objects.equals(paid_media, message.paid_media) &&
                Objects.equals(refunded_payment, message.refunded_payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message_id, message_thread_id, date, edit_date, migrate_to_chat_id, migrate_from_chat_id,
                author_signature, text, caption, new_chat_title, connected_website, media_group_id, business_connection_id,
                from, via_bot, left_chat_member, sender_business_bot, new_chat_members, sender_chat, chat, is_topic, is_topic_message,
                is_automatic_forward, has_protected_content, is_from_online, has_media_spoiler, delete_chat_photo, group_chat_created,
                supergroup_chat_created, channel_chat_created, reply_to_message, pinned_message, entities, caption_entities, animation,
                audio, document, photo, new_chat_photo, sticker, video, video_note, voice, contact, dice, game, poll, story, venue,
                location, message_auto_delete_timer_changed, invoice, successful_payment, users_shared, chat_shared, write_access_allowed,
                passport_data, proximity_alert_triggered, forum_topic_created, forum_topic_edited, forum_topic_closed, forum_topic_reopened,
                general_forum_topic_hidden, general_forum_topic_unhidden, video_chat_scheduled, video_chat_started, video_chat_ended,
                video_chat_participants_invited, web_app_data, reply_markup, external_reply, quote, link_preview_options, giveaway,
                giveaway_created, giveaway_winners, giveaway_completed, forward_origin, boost_added, sender_boost_count, reply_to_story,
                chat_background_set, effect_id, show_caption_above_media, paid_media);
    }


    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", message_thread_id=" + message_thread_id +
                ", date=" + date +
                ", edit_date=" + edit_date +
                ", migrate_to_chat_id=" + migrate_to_chat_id +
                ", migrate_from_chat_id=" + migrate_from_chat_id +
                ", author_signature='" + author_signature + '\'' +
                ", text='" + text + '\'' +
                ", caption='" + caption + '\'' +
                ", new_chat_title='" + new_chat_title + '\'' +
                ", connected_website='" + connected_website + '\'' +
                ", media_group_id='" + media_group_id + '\'' +
                ", business_connection_id='" + business_connection_id + '\'' +
                ", from=" + from +
                ", via_bot=" + via_bot +
                ", left_chat_member=" + left_chat_member +
                ", sender_business_bot=" + sender_business_bot +
                ", new_chat_members=" + new_chat_members +
                ", sender_chat=" + sender_chat +
                ", chat=" + chat +
                ", is_topic=" + is_topic +
                ", is_topic_message=" + is_topic_message +
                ", is_automatic_forward=" + is_automatic_forward +
                ", has_protected_content=" + has_protected_content +
                ", is_from_online=" + is_from_online +
                ", has_media_spoiler=" + has_media_spoiler +
                ", delete_chat_photo=" + delete_chat_photo +
                ", group_chat_created=" + group_chat_created +
                ", supergroup_chat_created=" + supergroup_chat_created +
                ", channel_chat_created=" + channel_chat_created +
                ", reply_to_message=" + reply_to_message +
                ", pinned_message=" + pinned_message +
                ", entities=" + entities +
                ", caption_entities=" + caption_entities +
                ", animation=" + animation +
                ", audio=" + audio +
                ", document=" + document +
                ", photo=" + photo +
                ", new_chat_photo=" + new_chat_photo +
                ", sticker=" + sticker +
                ", video=" + video +
                ", video_note=" + video_note +
                ", voice=" + voice +
                ", contact=" + contact +
                ", dice=" + dice +
                ", game=" + game +
                ", poll=" + poll +
                ", story=" + story +
                ", venue=" + venue +
                ", location=" + location +
                ", message_auto_delete_timer_changed=" + message_auto_delete_timer_changed +
                ", invoice=" + invoice +
                ", successful_payment=" + successful_payment +
                ", users_shared=" + users_shared +
                ", chat_shared=" + chat_shared +
                ", write_access_allowed=" + write_access_allowed +
                ", passport_data=" + passport_data +
                ", proximity_alert_triggered=" + proximity_alert_triggered +
                ", forum_topic_created=" + forum_topic_created +
                ", forum_topic_edited=" + forum_topic_edited +
                ", forum_topic_closed=" + forum_topic_closed +
                ", forum_topic_reopened=" + forum_topic_reopened +
                ", general_forum_topic_hidden=" + general_forum_topic_hidden +
                ", general_forum_topic_unhidden=" + general_forum_topic_unhidden +
                ", video_chat_scheduled=" + video_chat_scheduled +
                ", video_chat_started=" + video_chat_started +
                ", video_chat_ended=" + video_chat_ended +
                ", video_chat_participants_invited=" + video_chat_participants_invited +
                ", web_app_data=" + web_app_data +
                ", reply_markup=" + reply_markup +
                ", external_reply=" + external_reply +
                ", quote=" + quote +
                ", link_preview_options=" + link_preview_options +
                ", giveaway=" + giveaway +
                ", giveaway_created=" + giveaway_created +
                ", giveaway_winners=" + giveaway_winners +
                ", giveaway_completed=" + giveaway_completed +
                ", forward_origin=" + forward_origin +
                ", boost_added=" + boost_added +
                ", sender_boost_count=" + sender_boost_count +
                ", reply_to_story=" + reply_to_story +
                ", chat_background_set=" + chat_background_set +
                ", effect_id='" + effect_id + '\'' +
                ", show_caption_above_media=" + show_caption_above_media +
                ", paid_media=" + paid_media +
                '}';
    }
}
