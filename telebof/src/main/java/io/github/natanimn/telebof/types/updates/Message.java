package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.DirectMessagesTopic;
import io.github.natanimn.telebof.types.chat_and_user.*;
import io.github.natanimn.telebof.types.checklist.Checklist;
import io.github.natanimn.telebof.types.checklist.ChecklistTasksAdded;
import io.github.natanimn.telebof.types.checklist.ChecklistTasksDone;
import io.github.natanimn.telebof.types.forum.*;
import io.github.natanimn.telebof.types.gift_and_giveaway.*;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.media_and_service.*;
import io.github.natanimn.telebof.types.passport.PassportData;
import io.github.natanimn.telebof.types.payments.PaidMediaInfo;
import io.github.natanimn.telebof.types.payments.RefundedPayment;
import io.github.natanimn.telebof.types.payments.SuccessfulPayment;
import io.github.natanimn.telebof.types.story.Story;
import io.github.natanimn.telebof.types.suggested.*;
import io.github.natanimn.telebof.types.web.WebAppData;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This record represents message
 *
 * @param messageId Unique message identifier inside this chat. In specific instances
 * @param messageThreadId Unique identifier of a message thread to which the message belongs; for supergroups only
 * @param date Date the message was sent in Unix time. It is always a positive number, representing a valid date.
 * @param editDate Date the message was last edited in Unix time
 * @param migrateToChatId The group has been migrated to a supergroup with the specified identifier.
 * @param migrateFromChatId The supergroup has been migrated from a group with the specified identifier
 * @param authorSignature Signature of the post author for messages in channels, or the custom title of an anonymous group administrator
 * @param text For text messages, the actual UTF-8 text of the message
 * @param caption Caption for the animation, audio, document, paid media, photo, video or voice
 * @param newChatTitle A chat title was changed to this value
 * @param connectedWebsite The domain name of the website on which the user has logged in
 * @param mediaGroupId The unique identifier of a media message group this message belongs to
 * @param businessConnectionId Unique identifier of the business connection from which the message was received.
 *                             If non-empty, the message belongs to a chat of the corresponding business account that is independent from any potential bot chat which might share the same identifier.
 * @param from Sender of the message; may be empty for messages sent to channels. For backward compatibility, if the message was sent on behalf of a chat,
 *             the field contains a fake sender user in non-channel chats
 * @param viaBot Bot through which the message was sent
 * @param leftChatMember A member was removed from the group, information about them (this member may be the bot itself)
 * @param senderBusinessBot The bot that actually sent the message on behalf of the business account.
 *                          Available only for outgoing messages sent on behalf of the connected business account.
 * @param newChatMembers New members that were added to the group or supergroup and information about them (the bot itself may be one of these members)
 * @param senderChat Sender of the message when sent on behalf of a chat. For example, the supergroup itself for messages sent by its
 *                   anonymous administrators or a linked channel for messages automatically forwarded to the channel's discussion group.
 *                   For backward compatibility, if the message was sent on behalf of a chat, the field from contains a fake sender user in non-channel chats.
 * @param chat Chat the message belongs to
 * @param isTopicMessage True, if the message is sent to a forum topic
 * @param isAutomaticForward True, if the message is a channel post that was automatically forwarded to the connected discussion group
 * @param hasProtectedContent True, if the message can't be forwarded
 * @param isFromOnline True, if the message was sent by an implicit action, for example, as an away or a greeting business message, or as a scheduled message
 * @param hasMediaSpoiler True, if the message media is covered by a spoiler animation
 * @param deleteChatPhoto Service message: the chat photo was deleted
 * @param groupChatCreated Service message: the group has been created
 * @param supergroupChatCreated Service message: the supergroup has been created.
 *                              This field can't be received in a message coming through updates, because bot can't be a member of a supergroup when it is created.
 *                              It can only be found in reply_to_message if someone replies to a very first message in a directly created supergroup.
 * @param channelChatCreated Service message: the channel has been created.
 *                           This field can't be received in a message coming through updates, because bot can't be a member of a channel when it is created.
 *                           It can only be found in reply_to_message if someone replies to a very first message in a channel.
 * @param replyToMessage For replies in the same chat and message thread, the original message.
 *                       Note that the Message object in this field will not contain further reply_to_message fields even if it itself is a reply.
 * @param pinnedMessage Specified message was pinned. Note that the Message object in this field will not contain further reply_to_message fields even if it itself is a reply.
 * @param entities For text messages, special entities like usernames, URLs, bot commands, etc. that appear in the text
 * @param captionEntities For messages with a caption, special entities like usernames, URLs, bot commands, etc. that appear in the caption
 * @param animation Message is an animation, information about the animation. For backward compatibility, when this field is set,
 *                  the document field will also be set
 * @param audio Message is an audio file, information about the file
 * @param document Message is a general file, information about the file
 * @param photo Message is a photo, available sizes of the photo
 * @param newChatPhoto A chat photo was change to this value
 * @param sticker Message is a sticker, information about the sticker
 * @param video Message is a video, information about the video
 * @param videoNote Message is a video note, information about the video message
 * @param voice Message is a voice message, information about the file
 * @param contact Message is a shared contact, information about the contact
 * @param dice Message is a dice with random value
 * @param game Message is a game, information about the game
 * @param poll Message is a native poll, information about the poll
 * @param story Message is a forwarded story
 * @param venue Message is a venue, information about the venue.
 *              For backward compatibility, when this field is set, the location field will also be set
 * @param location Message is a shared location, information about the location
 * @param messageAutoDeleteTimerChanged Service message: auto-delete timer settings changed in the chat
 * @param invoice Message is an invoice for a payment, information about the invoice.
 * @param successfulPayment Message is a service message about a successful payment, information about the payment
 * @param usersShared Service message: users were shared with the bot
 * @param chatShared Service message: a chat was shared with the bot
 * @param writeAccessAllowed Service message: the user allowed the bot to write messages after adding it to the attachment or side menu, launching a Web App from a link,
 *                           or accepting an explicit request from a Web App sent by the method requestWriteAccess
 * @param passportData Telegram Passport data
 * @param proximityAlertTriggered Service message. A user in the chat triggered another user's proximity alert while sharing Live Location.
 * @param forumTopicCreated Service message: forum topic created
 * @param forumTopicEdited Service message: forum topic edited
 * @param forumTopicClosed Service message: forum topic closed
 * @param forumTopicReopened Service message: forum topic reopened
 * @param generalForumTopicHidden Service message: the 'General' forum topic hidden
 * @param generalForumTopicUnhidden Service message: the 'General' forum topic unhidden
 * @param videoChatScheduled Service message: video chat scheduled
 * @param videoChatStarted Service message: video chat started
 * @param videoChatEnded Service message: video chat ended
 * @param videoChatParticipantsInvited Service message: new participants invited to a video chat
 * @param webAppData Service message: data sent by a Web App
 * @param replyMarkup Inline keyboard attached to the message. login_url buttons are represented as ordinary url buttons.
 * @param externalReply Information about the message that is being replied to, which may come from another chat or forum topic
 * @param quote For replies that quote part of the original message, the quoted part of the message
 * @param linkPreviewOptions Options used for link preview generation for the message, if it is a text message and link preview options were changed
 * @param giveaway The message is a scheduled giveaway message
 * @param giveawayCreated Service message: a scheduled giveaway was created
 * @param giveawayWinners A giveaway with public winners was completed
 * @param giveawayCompleted Service message: a giveaway without public winners was completed
 * @param forwardOrigin Information about the original message for forwarded messages
 * @param boostAdded Service message: user boosted the chat
 * @param senderBoostCount If the sender of the message boosted the chat, the number of boosts added by the user
 * @param replyToStory For replies to a story, the original story
 * @param chatBackgroundSet Service message: chat background set
 * @param effectId Unique identifier of the message effect added to the message
 * @param showCaptionAboveMedia True, if the caption must be shown above the message media
 * @param paidMedia Message is a general file, information about the file
 * @param refundedPayment Message is a service message about a refunded payment, information about the payment.
 * @param gift Optional. Service message: a regular gift was sent or received
 * @param uniqueGift Optional. Service message: a unique gift was sent or received
 * @param paidMessagePriceChanged Optional. Service message: the price for paid messages has changed in the chat
 * @param paidStarCount Optional. The number of Telegram Stars that were paid by the sender of the message to send it
 * @param checklist Optional. Message is a checklist
 * @param checklistTasksDone Optional. Service message: some tasks in a checklist were marked as done or not done
 * @param checklistTasksAdded Optional. Service message: tasks were added to a checklist
 * @param directMessagePriceChanged Optional. Service message: the price for paid messages in the corresponding direct messages chat of a channel has changed
 * @param replyToChecklistTaskId Optional. Identifier of the specific checklist task that is being replied to
 * @param directMessagesTopic Optional. Information about the direct messages chat topic that contains the message
 * @param isPaidPost Optional. True, if the message is a paid post. Note that such posts must not be deleted for 24 hours to receive the payment and can't be edited.
 * @param suggestedPostApproved Optional. Service message: a suggested post was approved
 * @param suggestedPostApprovalFailed Optional. Service message: approval of a suggested post has failed
 * @param suggestedPostDeclined Optional. Service message: a suggested post was declined
 * @param suggestedPostPaid Optional. Service message: payment for a suggested post was received
 * @param suggestedPostRefunded Optional. Service message: payment for a suggested post was refunded
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Message(
        @SerializedName("message_id") Integer messageId,
        @SerializedName("message_thread_id") Integer messageThreadId,
        Integer date,
        @SerializedName("edit_date") Integer editDate,
        @SerializedName("migrate_to_chat_id") Long migrateToChatId,
        @SerializedName("migrate_from_chat_id") Long migrateFromChatId,
        @SerializedName("author_signature") String authorSignature,
        String text,
        String caption,
        @SerializedName("new_chat_title") String newChatTitle,
        @SerializedName("connected_website") String connectedWebsite,
        @SerializedName("media_group_id") String mediaGroupId,
        @SerializedName("business_connection_id") String businessConnectionId,
        User from,
        @SerializedName("via_bot") User viaBot,
        @SerializedName("left_chat_member") User leftChatMember,
        @SerializedName("sender_business_bot") User senderBusinessBot,
        @SerializedName("new_chat_members") List<User> newChatMembers,
        @SerializedName("sender_chat") Chat senderChat,
        Chat chat,
        @SerializedName("is_topic_message") Boolean isTopicMessage,
        @SerializedName("is_automatic_forward") Boolean isAutomaticForward,
        @SerializedName("has_protected_content") Boolean hasProtectedContent,
        @SerializedName("is_from_online") Boolean isFromOnline,
        @SerializedName("has_media_spoiler") Boolean hasMediaSpoiler,
        @SerializedName("delete_chat_photo") Boolean deleteChatPhoto,
        @SerializedName("group_chat_created") Boolean groupChatCreated,
        @SerializedName("supergroup_chat_created") Boolean supergroupChatCreated,
        @SerializedName("channel_chat_created") Boolean channelChatCreated,
        @SerializedName("reply_to_message") Message replyToMessage,
        @SerializedName("pinned_message") Message pinnedMessage,
        List<MessageEntity> entities,
        @SerializedName("caption_entities") List<MessageEntity> captionEntities,
        Animation animation,
        Audio audio,
        Document document,
        List<PhotoSize> photo,
        @SerializedName("new_chat_photo") List<PhotoSize> newChatPhoto,
        Sticker sticker,
        Video video,
        @SerializedName("video_note") VideoNote videoNote,
        Voice voice,
        Contact contact,
        Dice dice,
        Game game,
        Poll poll,
        Story story,
        Venue venue,
        Location location,
        @SerializedName("message_auto_delete_timer_changed") MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged,
        Invoice invoice,
        @SerializedName("successful_payment") SuccessfulPayment successfulPayment,
        @SerializedName("users_shared") UsersShared usersShared,
        @SerializedName("chat_shared") ChatShared chatShared,
        @SerializedName("write_access_allowed") WriteAccessAllowed writeAccessAllowed,
        @SerializedName("passport_data") PassportData passportData,
        @SerializedName("proximity_alert_triggered") ProximityAlertTriggered proximityAlertTriggered,
        @SerializedName("forum_topic_created") ForumTopicCreated forumTopicCreated,
        @SerializedName("forum_topic_edited") ForumTopicEdited forumTopicEdited,
        @SerializedName("forum_topic_closed") ForumTopicClosed forumTopicClosed,
        @SerializedName("forum_topic_reopened") ForumTopicReopened forumTopicReopened,
        @SerializedName("general_forum_topic_hidden") GeneralForumTopicHidden generalForumTopicHidden,
        @SerializedName("general_forum_topic_unhidden") GeneralForumTopicUnhidden generalForumTopicUnhidden,
        @SerializedName("video_chat_scheduled") VideoChatScheduled videoChatScheduled,
        @SerializedName("video_chat_started") VideoChatStarted videoChatStarted,
        @SerializedName("video_chat_ended") VideoChatEnded videoChatEnded,
        @SerializedName("video_chat_participants_invited") VideoChatParticipantsInvited videoChatParticipantsInvited,
        @SerializedName("web_app_data") WebAppData webAppData,
        @SerializedName("reply_markup") InlineKeyboardMarkup replyMarkup,
        @SerializedName("external_reply") ExternalReplyInfo externalReply,
        TextQuote quote,
        @SerializedName("link_preview_options") LinkPreviewOptions linkPreviewOptions,
        Giveaway giveaway,
        @SerializedName("giveaway_created") GiveawayCreated giveawayCreated,
        @SerializedName("giveaway_winners") GiveawayWinners giveawayWinners,
        @SerializedName("giveaway_completed") GiveawayCompleted giveawayCompleted,
        @SerializedName("forward_origin") MessageOrigin forwardOrigin,
        @SerializedName("boost_added") ChatBoostAdded boostAdded,
        @SerializedName("sender_boost_count") Integer senderBoostCount,
        @SerializedName("reply_to_story") Story replyToStory,
        @SerializedName("chat_background_set") ChatBackground chatBackgroundSet,
        @SerializedName("effect_id") String effectId,
        @SerializedName("show_caption_above_media") Boolean showCaptionAboveMedia,
        @SerializedName("paid_media") PaidMediaInfo paidMedia,
        @SerializedName("refunded_payment") RefundedPayment refundedPayment,
        GiftInfo gift,
        @SerializedName("unique_gift") UniqueGift uniqueGift,
        @SerializedName("paid_message_price_changed") PaidMessagePriceChanged paidMessagePriceChanged,
        @SerializedName("paid_star_count") Integer paidStarCount,
        Checklist checklist,
        @SerializedName("checklist_tasks_done") ChecklistTasksAdded checklistTasksDone,
        @SerializedName("checklist_tasks_added") ChecklistTasksDone checklistTasksAdded,
        @SerializedName("direct_message_price_changed") DirectMessagePriceChanged directMessagePriceChanged,
        @SerializedName("reply_to_checklist_task_id") Integer replyToChecklistTaskId,
        @SerializedName("direct_messages_topic") DirectMessagesTopic directMessagesTopic,
        @SerializedName("is_paid_post") Boolean isPaidPost,
        @SerializedName("suggested_post_approved") SuggestedPostApproved suggestedPostApproved,
        @SerializedName("suggested_post_approval_failed") SuggestedPostApprovalFailed suggestedPostApprovalFailed,
        @SerializedName("suggested_post_declined") SuggestedPostDeclined suggestedPostDeclined,
        @SerializedName("suggested_post_paid") SuggestedPostPaid suggestedPostPaid,
        @SerializedName("suggested_post_refunded") SuggestedPostRefunded suggestedPostRefunded
) implements TelegramUpdate {}