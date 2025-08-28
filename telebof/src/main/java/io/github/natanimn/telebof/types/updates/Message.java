package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.*;
import io.github.natanimn.telebof.types.forum.*;
import io.github.natanimn.telebof.types.gift_and_giveaway.*;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.media_and_service.*;
import io.github.natanimn.telebof.types.passport.PassportData;
import io.github.natanimn.telebof.types.payments.PaidMediaInfo;
import io.github.natanimn.telebof.types.payments.RefundedPayment;
import io.github.natanimn.telebof.types.payments.SuccessfulPayment;
import io.github.natanimn.telebof.types.story.Story;
import io.github.natanimn.telebof.types.web.WebAppData;

import java.util.List;
import java.util.Objects;

/**
 * This class represents message
 * @author Natanim
 * @since 3 March 2025
 * @version 1.0.0
 */
public class Message implements TelegramUpdate {
    /* Unique message identifier inside this chat. In specific instances */
    public Integer message_id;

    /*  Unique identifier of a message thread to which the message belongs; for supergroups only */
    public Integer message_thread_id;

    /**
     * Date the message was sent in Unix time. It is always a positive number, representing a valid date.
     */
    public Integer date;

    /**
     * Date the message was last edited in Unix time
     */
    public Integer edit_date;

    /**
     *  The group has been migrated to a supergroup with the specified identifier.
     */
    public Long migrate_to_chat_id;

    /**
     * The supergroup has been migrated from a group with the specified identifier
     */
    public Long migrate_from_chat_id;

    /**
     * Signature of the post author for messages in channels, or the custom title of an anonymous group administrator
     */
    public String author_signature;

    /**
     * For text messages, the actual UTF-8 text of the message
     */
    public String text;

    /**
     * Caption for the animation, audio, document, paid media, photo, video or voice
     */
    public String caption;

    /**
     * A chat title was changed to this value
     */
    public String new_chat_title;

    /**
     * The domain name of the website on which the user has logged in
     * @see <a href="https://core.telegram.org/widgets/login">More about Telegram Login</a>
     */
    public String connected_website;

    /**
     * The unique identifier of a media message group this message belongs to
     */
    public String media_group_id;

    /**
     * Unique identifier of the business connection from which the message was received.
     * If non-empty, the message belongs to a chat of the corresponding business account that is independent from any potential bot chat which might share the same identifier.
     */
    public String business_connection_id;

    /** Sender of the message; may be empty for messages sent to channels. For backward compatibility, if the message was sent on behalf of a chat,
     * the field contains a fake sender user in non-channel chats
     * */
    public User from;

    /**
     *  Bot through which the message was sent
     */
    public User via_bot;

    /**
     * A member was removed from the group, information about them (this member may be the bot itself)
     */
    public User left_chat_member;

    /**
     * The bot that actually sent the message on behalf of the business account.
     * Available only for outgoing messages sent on behalf of the connected business account.
     */
    public User sender_business_bot;

    /**
     * New members that were added to the group or supergroup and information about them (the bot itself may be one of these members)
     */
    public List<User> new_chat_members;

    /**
     * Sender of the message when sent on behalf of a chat. For example, the supergroup itself for messages sent by its
     * anonymous administrators or a linked channel for messages automatically forwarded to the channel's discussion group.
     * For backward compatibility, if the message was sent on behalf of a chat, the field from contains a fake sender user in non-channel chats.
     */
    public Chat sender_chat;

    /**
     * Chat the message belongs to
     */
    public Chat chat;

    /**
     * True, if the message is sent to a forum topic
     */
    public Boolean is_topic_message;

    /**
     * True, if the message is a channel post that was automatically forwarded to the connected discussion group
     */
    public Boolean is_automatic_forward;

    /**
     * True, if the message can't be forwarded
     */
    public Boolean has_protected_content;

    /**
     * True, if the message was sent by an implicit action, for example, as an away or a greeting business message, or as a scheduled message
     */
    public Boolean is_from_online;

    /**
     * True, if the message media is covered by a spoiler animation
     */
    public Boolean has_media_spoiler;

    /**
     * Service message: the chat photo was deleted
     */
    public Boolean delete_chat_photo;

    /**
     * Service message: the group has been created
     */
    public Boolean group_chat_created;

    /**
     * Service message: the supergroup has been created.
     * This field can't be received in a message coming through updates, because bot can't be a member of a supergroup when it is created.
     * It can only be found in reply_to_message if someone replies to a very first message in a directly created supergroup.
     */
    public Boolean supergroup_chat_created;

    /**
     * Service message: the channel has been created.
     * This field can't be received in a message coming through updates, because bot can't be a member of a channel when it is created.
     * It can only be found in reply_to_message if someone replies to a very first message in a channel.
     */
    public Boolean channel_chat_created;

    /**
     * For replies in the same chat and message thread, the original message. N
     * ote that the Message object in this field will not contain further reply_to_message fields even if it itself is a reply.
     */
    public Message reply_to_message;

    /**
     * Specified message was pinned. Note that the Message object in this field will not contain further reply_to_message fields even if it itself is a reply.
     */
    public Message pinned_message;

    /**
     * For text messages, special entities like usernames, URLs, bot commands, etc. that appear in the text
     */
    public List<MessageEntity> entities;

    /**
     * For messages with a caption, special entities like usernames, URLs, bot commands, etc. that appear in the caption
     */
    public List<MessageEntity> caption_entities;

    /**
     * Message is an animation, information about the animation. For backward compatibility, when this field is set,
     * the document field will also be set
     */
    public Animation animation;

    /**
     * Message is an audio file, information about the file
     */
    public Audio audio;

    /**
     * Message is a general file, information about the file
     */
    public Document document;

    /**
     * Message is a photo, available sizes of the photo
     */
    public List<PhotoSize> photo;

    /**
     * A chat photo was change to this value
     */
    public List<PhotoSize> new_chat_photo;

    /**
     * Message is a sticker, information about the sticker
     */
    public Sticker sticker;

    /**
     * Message is a video, information about the video
     */
    public Video video;

    /**
     * Message is a <a href="https://telegram.org/blog/video-messages-and-telescope">video note</a>, information about the video message
     */
    public VideoNote video_note;

    /**
     * Message is a voice message, information about the file
     */
    public Voice voice;

    /**
     * Message is a shared contact, information about the contact
     */
    public Contact contact;

    /**
     * Message is a dice with random value
     */
    public Dice dice;

    /**
     * Message is a game, information about the game
     * @see <a href="https://core.telegram.org/bots/api#games">More about games</a>
     */
    public Game game;

    /**
     * Message is a native poll, information about the poll
     */
    public Poll poll;

    /**
     * Message is a forwarded story
     */
    public Story story;

    /**
     * Message is a venue, information about the venue.
     * For backward compatibility, when this field is set, the location field will also be set
     */
    public Venue venue;

    /**
     * Message is a shared location, information about the location
     */
    public Location location;

    /**
     * Service message: auto-delete timer settings changed in the chat
     */
    public MessageAutoDeleteTimerChanged message_auto_delete_timer_changed;

    /**
     * Message is an invoice for a <a href="https://core.telegram.org/bots/api#payments">payment</a>, information about the invoice.
     * @see <a href="https://core.telegram.org/bots/api#payments">More about payments</a>
     */
    public Invoice invoice;

    /**
     * Message is a service message about a successful payment, information about the payment
     * @see <a href="https://core.telegram.org/bots/api#payments">More about payments</a>
     */
    public SuccessfulPayment successful_payment;

    /**
     * Service message: users were shared with the bot
     */
    public UsersShared users_shared;

    /**
     * Service message: a chat was shared with the bot
     */
    public ChatShared chat_shared;

    /**
     * Service message: the user allowed the bot to write messages after adding it to the attachment or side menu, launching a Web App from a link,
     * or accepting an explicit request from a Web App sent by the method <a href="https://core.telegram.org/bots/webapps#initializing-mini-apps">requestWriteAccess</a>
     */
    public WriteAccessAllowed write_access_allowed;

    /**
     * Telegram Passport data
     */
    public PassportData passport_data;

    /**
     * Service message. A user in the chat triggered another user's proximity alert while sharing Live Location.
     */
    public ProximityAlertTriggered proximity_alert_triggered;

    /**
     * Service message: forum topic created
     */
    public ForumTopicCreated forum_topic_created;

    /**
     * Service message: forum topic edited
     */
    public ForumTopicEdited forum_topic_edited;

    /**
     * Service message: forum topic closed
     */
    public ForumTopicClosed forum_topic_closed;

    /**
     * Service message: forum topic reopened
     */
    public ForumTopicReopened forum_topic_reopened;

    /**
     * Service message: the 'General' forum topic hidden
     */
    public GeneralForumTopicHidden general_forum_topic_hidden;

    /**
     * Service message: the 'General' forum topic unhidden
     */
    public GeneralForumTopicUnhidden general_forum_topic_unhidden;

    /**
     * Service message: video chat scheduled
     */
    public VideoChatScheduled video_chat_scheduled;

    /**
     *  Service message: video chat started
     */
    public VideoChatStarted video_chat_started;

    /**
     * Service message: video chat ended
     */
    public VideoChatEnded video_chat_ended;

    /**
     * Service message: new participants invited to a video chat
     */
    public VideoChatParticipantsInvited video_chat_participants_invited;

    /**
     * Service message: data sent by a Web App
     */
    public WebAppData web_app_data;

    /**
     * Inline keyboard attached to the message. login_url buttons are represented as ordinary url buttons.
     */
    public InlineKeyboardMarkup reply_markup;

    /**
     * Information about the message that is being replied to, which may come from another chat or forum topic
     */
    public ExternalReplyInfo external_reply;

    /**
     *  For replies that quote part of the original message, the quoted part of the message
     */
    public TextQuote quote;

    /**
     *  Options used for link preview generation for the message, if it is a text message and link preview options were changed
     */
    public LinkPreviewOptions link_preview_options;

    /**
     * The message is a scheduled giveaway message
     */
    public Giveaway giveaway;

    /**
     * Service message: a scheduled giveaway was created
     */
    public GiveawayCreated giveaway_created;

    /**
     * A giveaway with public winners was completed
     */
    public GiveawayWinners giveaway_winners;

    /**
     * Service message: a giveaway without public winners was completed
     */
    public GiveawayCompleted giveaway_completed;

    /**
     * Information about the original message for forwarded messages
     */
    public MessageOrigin forward_origin;

    /**
     * Service message: user boosted the chat
     */
    public ChatBoostAdded boost_added;

    /**
     * If the sender of the message boosted the chat, the number of boosts added by the user
     */
    public Integer sender_boost_count;

    /**
     *  For replies to a story, the original story
     */
    public Story reply_to_story;

    /**
     * Service message: chat background set
     */
    public ChatBackground chat_background_set;

    /**
     *  Unique identifier of the message effect added to the message
     */
    public String effect_id;

    /**
     * True, if the caption must be shown above the message media
     */
    public Boolean show_caption_above_media;

    /**
     * Message is a general file, information about the file
     */
    public PaidMediaInfo paid_media;

    /**
     * Message is a service message about a refunded payment, information about the payment.
     * @see <a href="https://core.telegram.org/bots/api#payments">More about payment</a>
     */
    public RefundedPayment refunded_payment;

    /**
     * Optional. Service message: a regular gift was sent or received
     */
    public GiftInfo gift;

    /**
     * Optional. Service message: a unique gift was sent or received
     */
    public UniqueGift unique_gift;

    /**
     * Optional. Service message: the price for paid messages has changed in the chat
     */
    public PaidMessagePriceChanged paid_message_price_changed;

    /**
     * Optional. The number of Telegram Stars that were paid by the sender of the message to send it
     */
    public Integer paid_star_count;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Message message = (Message) object;
        return Objects.equals(message_id, message.message_id) &&
                Objects.equals(message_thread_id, message.message_thread_id) &&
                Objects.equals(date, message.date) &&
                Objects.equals(edit_date, message.edit_date) &&
                Objects.equals(migrate_to_chat_id, message.migrate_to_chat_id) &&
                Objects.equals(migrate_from_chat_id, message.migrate_from_chat_id) &&
                Objects.equals(author_signature, message.author_signature) &&
                Objects.equals(text, message.text) &&
                Objects.equals(caption, message.caption) &&
                Objects.equals(new_chat_title, message.new_chat_title) &&
                Objects.equals(connected_website, message.connected_website) &&
                Objects.equals(media_group_id, message.media_group_id) &&
                Objects.equals(business_connection_id, message.business_connection_id) &&
                Objects.equals(from, message.from) && Objects.equals(via_bot, message.via_bot) &&
                Objects.equals(left_chat_member, message.left_chat_member) &&
                Objects.equals(sender_business_bot, message.sender_business_bot) &&
                Objects.equals(new_chat_members, message.new_chat_members) &&
                Objects.equals(sender_chat, message.sender_chat) &&
                Objects.equals(chat, message.chat) &&
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
                Objects.equals(animation, message.animation) &&
                Objects.equals(audio, message.audio) &&
                Objects.equals(document, message.document) &&
                Objects.equals(photo, message.photo) &&
                Objects.equals(new_chat_photo, message.new_chat_photo) &&
                Objects.equals(sticker, message.sticker) &&
                Objects.equals(video, message.video) &&
                Objects.equals(video_note, message.video_note) &&
                Objects.equals(voice, message.voice) &&
                Objects.equals(contact, message.contact) &&
                Objects.equals(dice, message.dice) &&
                Objects.equals(game, message.game) &&
                Objects.equals(poll, message.poll) &&
                Objects.equals(story, message.story) &&
                Objects.equals(venue, message.venue) &&
                Objects.equals(location, message.location) &&
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
                Objects.equals(refunded_payment, message.refunded_payment) &&
                Objects.equals(gift, message.gift) &&
                Objects.equals(unique_gift, message.unique_gift) &&
                Objects.equals(paid_message_price_changed, message.paid_message_price_changed) &&
                Objects.equals(paid_star_count, message.paid_star_count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                message_id, message_thread_id, date, edit_date, migrate_to_chat_id, migrate_from_chat_id,
                author_signature, text, caption, new_chat_title, connected_website, media_group_id, business_connection_id,
                from, via_bot, left_chat_member, sender_business_bot, new_chat_members, sender_chat, chat, is_topic_message,
                is_automatic_forward, has_protected_content, is_from_online, has_media_spoiler, delete_chat_photo, group_chat_created,
                supergroup_chat_created, channel_chat_created, reply_to_message, pinned_message, entities, caption_entities, animation,
                audio, document, photo, new_chat_photo, sticker, video, video_note, voice, contact, dice, game, poll, story, venue,
                location, message_auto_delete_timer_changed, invoice, successful_payment, users_shared, chat_shared, write_access_allowed,
                passport_data, proximity_alert_triggered, forum_topic_created, forum_topic_edited, forum_topic_closed, forum_topic_reopened,
                general_forum_topic_hidden, general_forum_topic_unhidden, video_chat_scheduled, video_chat_started, video_chat_ended,
                video_chat_participants_invited, web_app_data, reply_markup, external_reply, quote, link_preview_options, giveaway,
                giveaway_created, giveaway_winners, giveaway_completed, forward_origin, boost_added, sender_boost_count, reply_to_story,
                chat_background_set, effect_id, show_caption_above_media, paid_media, gift, unique_gift, paid_message_price_changed,
                paid_star_count);
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
                ", gift=" + gift +
                ", unique_gift=" + unique_gift +
                ", paid_message_price_changed=" + paid_message_price_changed +
                ", paid_star_count=" + paid_star_count +
                '}';
    }
}
