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
 * This object represents a message.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Message implements TelegramUpdate {
    /**
     * Unique message identifier inside this chat
     */
    @SerializedName("message_id")
    private Integer messageId;

    /**
     * Unique identifier of a message thread to which the message belongs; for supergroups only
     */
    @SerializedName("message_thread_id")
    private Integer messageThreadId;

    /**
     * Date the message was sent in Unix time
     */
    private Integer date;

    /**
     * Date the message was last edited in Unix time
     */
    @SerializedName("edit_date")
    private Integer editDate;

    /**
     * The group has been migrated to a supergroup with the specified identifier
     */
    @SerializedName("migrate_to_chat_id")
    private Long migrateToChatId;

    /**
     * The supergroup has been migrated from a group with the specified identifier
     */
    @SerializedName("migrate_from_chat_id")
    private Long migrateFromChatId;

    /**
     * Signature of the post author for messages in channels, or the custom title of an anonymous group administrator
     */
    @SerializedName("author_signature")
    private String authorSignature;

    /**
     * For text messages, the actual UTF-8 text of the message
     */
    private String text;

    /**
     * Caption for the animation, audio, document, paid media, photo, video or voice
     */
    private String caption;

    /**
     * A chat title was changed to this value
     */
    @SerializedName("new_chat_title")
    private String newChatTitle;

    /**
     * The domain name of the website on which the user has logged in
     */
    @SerializedName("connected_website")
    private String connectedWebsite;

    /**
     * The unique identifier of a media message group this message belongs to
     */
    @SerializedName("media_group_id")
    private String mediaGroupId;

    /**
     * Unique identifier of the business connection from which the message was received
     */
    @SerializedName("business_connection_id")
    private String businessConnectionId;

    /**
     * Sender of the message; may be empty for messages sent to channels
     */
    private User from;

    /**
     * Bot through which the message was sent
     */
    @SerializedName("via_bot")
    private User viaBot;

    /**
     * A member was removed from the group, information about them (this member may be the bot itself)
     */
    @SerializedName("left_chat_member")
    private User leftChatMember;

    /**
     * The bot that actually sent the message on behalf of the business account
     */
    @SerializedName("sender_business_bot")
    private User senderBusinessBot;

    /**
     * New members that were added to the group or supergroup and information about them
     */
    @SerializedName("new_chat_members")
    private List<User> newChatMembers;

    /**
     * Sender of the message when sent on behalf of a chat
     */
    @SerializedName("sender_chat")
    private Chat senderChat;

    /**
     * Chat the message belongs to
     */
    private Chat chat;

    /**
     * True, if the message is sent to a forum topic
     */
    @SerializedName("is_topic_message")
    private Boolean isTopicMessage;

    /**
     * True, if the message is a channel post that was automatically forwarded to the connected discussion group
     */
    @SerializedName("is_automatic_forward")
    private Boolean isAutomaticForward;

    /**
     * True, if the message can't be forwarded
     */
    @SerializedName("has_protected_content")
    private Boolean hasProtectedContent;

    /**
     * True, if the message was sent by an implicit action
     */
    @SerializedName("is_from_online")
    private Boolean isFromOnline;

    /**
     * True, if the message media is covered by a spoiler animation
     */
    @SerializedName("has_media_spoiler")
    private Boolean hasMediaSpoiler;

    /**
     * Service message: the chat photo was deleted
     */
    @SerializedName("delete_chat_photo")
    private Boolean deleteChatPhoto;

    /**
     * Service message: the group has been created
     */
    @SerializedName("group_chat_created")
    private Boolean groupChatCreated;

    /**
     * Service message: the supergroup has been created
     */
    @SerializedName("supergroup_chat_created")
    private Boolean supergroupChatCreated;

    /**
     * Service message: the channel has been created
     */
    @SerializedName("channel_chat_created")
    private Boolean channelChatCreated;

    /**
     * For replies in the same chat and message thread, the original message
     */
    @SerializedName("reply_to_message")
    private Message replyToMessage;

    /**
     * Specified message was pinned
     */
    @SerializedName("pinned_message")
    private Message pinnedMessage;

    /**
     * For text messages, special entities like usernames, URLs, bot commands, etc. that appear in the text
     */
    private List<MessageEntity> entities;

    /**
     * For messages with a caption, special entities like usernames, URLs, bot commands, etc. that appear in the caption
     */
    @SerializedName("caption_entities")
    private List<MessageEntity> captionEntities;

    /**
     * Message is an animation, information about the animation
     */
    private Animation animation;

    /**
     * Message is an audio file, information about the file
     */
    private Audio audio;

    /**
     * Message is a general file, information about the file
     */
    private Document document;

    /**
     * Message is a photo, available sizes of the photo
     */
    private List<PhotoSize> photo;

    /**
     * A chat photo was change to this value
     */
    @SerializedName("new_chat_photo")
    private List<PhotoSize> newChatPhoto;

    /**
     * Message is a sticker, information about the sticker
     */
    private Sticker sticker;

    /**
     * Message is a video, information about the video
     */
    private Video video;

    /**
     * Message is a video note, information about the video message
     */
    @SerializedName("video_note")
    private VideoNote videoNote;

    /**
     * Message is a voice message, information about the file
     */
    private Voice voice;

    /**
     * Message is a shared contact, information about the contact
     */
    private Contact contact;

    /**
     * Message is a dice with random value
     */
    private Dice dice;

    /**
     * Message is a game, information about the game
     */
    private Game game;

    /**
     * Message is a native poll, information about the poll
     */
    private Poll poll;

    /**
     * Message is a forwarded story
     */
    private Story story;

    /**
     * Message is a venue, information about the venue
     */
    private Venue venue;

    /**
     * Message is a shared location, information about the location
     */
    private Location location;

    /**
     * Service message: auto-delete timer settings changed in the chat
     */
    @SerializedName("message_auto_delete_timer_changed")
    private MessageAutoDeleteTimerChanged messageAutoDeleteTimerChanged;

    /**
     * Message is an invoice for a payment, information about the invoice
     */
    private Invoice invoice;

    /**
     * Message is a service message about a successful payment, information about the payment
     */
    @SerializedName("successful_payment")
    private SuccessfulPayment successfulPayment;

    /**
     * Service message: users were shared with the bot
     */
    @SerializedName("users_shared")
    private UsersShared usersShared;

    /**
     * Service message: a chat was shared with the bot
     */
    @SerializedName("chat_shared")
    private ChatShared chatShared;

    /**
     * Service message: the user allowed the bot to write messages
     */
    @SerializedName("write_access_allowed")
    private WriteAccessAllowed writeAccessAllowed;

    /**
     * Telegram Passport data
     */
    @SerializedName("passport_data")
    private PassportData passportData;

    /**
     * Service message: A user in the chat triggered another user's proximity alert while sharing Live Location
     */
    @SerializedName("proximity_alert_triggered")
    private ProximityAlertTriggered proximityAlertTriggered;

    /**
     * Service message: forum topic created
     */
    @SerializedName("forum_topic_created")
    private ForumTopicCreated forumTopicCreated;

    /**
     * Service message: forum topic edited
     */
    @SerializedName("forum_topic_edited")
    private ForumTopicEdited forumTopicEdited;

    /**
     * Service message: forum topic closed
     */
    @SerializedName("forum_topic_closed")
    private ForumTopicClosed forumTopicClosed;

    /**
     * Service message: forum topic reopened
     */
    @SerializedName("forum_topic_reopened")
    private ForumTopicReopened forumTopicReopened;

    /**
     * Service message: the 'General' forum topic hidden
     */
    @SerializedName("general_forum_topic_hidden")
    private GeneralForumTopicHidden generalForumTopicHidden;

    /**
     * Service message: the 'General' forum topic unhidden
     */
    @SerializedName("general_forum_topic_unhidden")
    private GeneralForumTopicUnhidden generalForumTopicUnhidden;

    /**
     * Service message: video chat scheduled
     */
    @SerializedName("video_chat_scheduled")
    private VideoChatScheduled videoChatScheduled;

    /**
     * Service message: video chat started
     */
    @SerializedName("video_chat_started")
    private VideoChatStarted videoChatStarted;

    /**
     * Service message: video chat ended
     */
    @SerializedName("video_chat_ended")
    private VideoChatEnded videoChatEnded;

    /**
     * Service message: new participants invited to a video chat
     */
    @SerializedName("video_chat_participants_invited")
    private VideoChatParticipantsInvited videoChatParticipantsInvited;

    /**
     * Service message: data sent by a Web App
     */
    @SerializedName("web_app_data")
    private WebAppData webAppData;

    /**
     * Inline keyboard attached to the message
     */
    @SerializedName("reply_markup")
    private InlineKeyboardMarkup replyMarkup;

    /**
     * Information about the message that is being replied to, which may come from another chat or forum topic
     */
    @SerializedName("external_reply")
    private ExternalReplyInfo externalReply;

    /**
     * For replies that quote part of the original message, the quoted part of the message
     */
    private TextQuote quote;

    /**
     * Options used for link preview generation for the message
     */
    @SerializedName("link_preview_options")
    private LinkPreviewOptions linkPreviewOptions;

    /**
     * The message is a scheduled giveaway message
     */
    private Giveaway giveaway;

    /**
     * Service message: a scheduled giveaway was created
     */
    @SerializedName("giveaway_created")
    private GiveawayCreated giveawayCreated;

    /**
     * A giveaway with public winners was completed
     */
    @SerializedName("giveaway_winners")
    private GiveawayWinners giveawayWinners;

    /**
     * Service message: a giveaway without public winners was completed
     */
    @SerializedName("giveaway_completed")
    private GiveawayCompleted giveawayCompleted;

    /**
     * Information about the original message for forwarded messages
     */
    @SerializedName("forward_origin")
    private MessageOrigin forwardOrigin;

    /**
     * Service message: user boosted the chat
     */
    @SerializedName("boost_added")
    private ChatBoostAdded boostAdded;

    /**
     * If the sender of the message boosted the chat, the number of boosts added by the user
     */
    @SerializedName("sender_boost_count")
    private Integer senderBoostCount;

    /**
     * For replies to a story, the original story
     */
    @SerializedName("reply_to_story")
    private Story replyToStory;

    /**
     * Service message: chat background set
     */
    @SerializedName("chat_background_set")
    private ChatBackground chatBackgroundSet;

    /**
     * Unique identifier of the message effect added to the message
     */
    @SerializedName("effect_id")
    private String effectId;

    /**
     * True, if the caption must be shown above the message media
     */
    @SerializedName("show_caption_above_media")
    private Boolean showCaptionAboveMedia;

    /**
     * Message is a general file, information about the file
     */
    @SerializedName("paid_media")
    private PaidMediaInfo paidMedia;

    /**
     * Message is a service message about a refunded payment, information about the payment
     */
    @SerializedName("refunded_payment")
    private RefundedPayment refundedPayment;

    /**
     * Optional. Service message: a regular gift was sent or received
     */
    private GiftInfo gift;

    /**
     * Optional. Service message: a unique gift was sent or received
     */
    @SerializedName("unique_gift")
    private UniqueGift uniqueGift;

    /**
     * Optional. Service message: the price for paid messages has changed in the chat
     */
    @SerializedName("paid_message_price_changed")
    private PaidMessagePriceChanged paidMessagePriceChanged;

    /**
     * Optional. The number of Telegram Stars that were paid by the sender of the message to send it
     */
    @SerializedName("paid_star_count")
    private Integer paidStarCount;

    /**
     * Optional. Message is a checklist
     */
    private Checklist checklist;

    /**
     * Optional. Service message: some tasks in a checklist were marked as done or not done
     */
    @SerializedName("checklist_tasks_done")
    private ChecklistTasksAdded checklistTasksDone;

    /**
     * Optional. Service message: tasks were added to a checklist
     */
    @SerializedName("checklist_tasks_added")
    private ChecklistTasksDone checklistTasksAdded;

    /**
     * Optional. Service message: the price for paid messages in the corresponding direct messages chat of a channel has changed
     */
    @SerializedName("direct_message_price_changed")
    private DirectMessagePriceChanged directMessagePriceChanged;

    /**
     * Optional. Identifier of the specific checklist task that is being replied to
     */
    @SerializedName("reply_to_checklist_task_id")
    private Integer replyToChecklistTaskId;

    /**
     * Optional. Information about the direct messages chat topic that contains the message
     */
    @SerializedName("direct_messages_topic")
    private DirectMessagesTopic directMessagesTopic;

    /**
     * Optional. True, if the message is a paid post
     */
    @SerializedName("is_paid_post")
    private Boolean isPaidPost;

    /**
     * Optional. Service message: a suggested post was approved
     */
    @SerializedName("suggested_post_approved")
    private SuggestedPostApproved suggestedPostApproved;

    /**
     * Optional. Service message: approval of a suggested post has failed
     */
    @SerializedName("suggested_post_approval_failed")
    private SuggestedPostApprovalFailed suggestedPostApprovalFailed;

    /**
     * Optional. Service message: a suggested post was declined
     */
    @SerializedName("suggested_post_declined")
    private SuggestedPostDeclined suggestedPostDeclined;

    /**
     * Optional. Service message: payment for a suggested post was received
     */
    @SerializedName("suggested_post_paid")
    private SuggestedPostPaid suggestedPostPaid;

    /**
     * Optional. Service message: payment for a suggested post was refunded
     */
    @SerializedName("suggested_post_refunded")
    private SuggestedPostRefunded suggestedPostRefunded;

    /**
     * Optional. Service message: upgrade of a gift was purchased after the gift was sent
     */
    @SerializedName("gift_upgrade_sent")
    private GiftInfo giftUpgradeSent;

    public Integer getMessageId() {
        return messageId;
    }

    public Integer getMessageThreadId() {
        return messageThreadId;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getEditDate() {
        return editDate;
    }

    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    public Long getMigrateFromChatId() {
        return migrateFromChatId;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public String getText() {
        return text;
    }

    public String getCaption() {
        return caption;
    }

    public String getNewChatTitle() {
        return newChatTitle;
    }

    public String getConnectedWebsite() {
        return connectedWebsite;
    }

    public String getMediaGroupId() {
        return mediaGroupId;
    }

    public String getBusinessConnectionId() {
        return businessConnectionId;
    }

    public User getFrom() {
        return from;
    }

    public User getViaBot() {
        return viaBot;
    }

    public User getLeftChatMember() {
        return leftChatMember;
    }

    public User getSenderBusinessBot() {
        return senderBusinessBot;
    }

    public List<User> getNewChatMembers() {
        return newChatMembers;
    }

    public Chat getSenderChat() {
        return senderChat;
    }

    public Chat getChat() {
        return chat;
    }

    public Boolean getTopicMessage() {
        return isTopicMessage;
    }

    public Boolean getAutomaticForward() {
        return isAutomaticForward;
    }

    public Boolean getHasProtectedContent() {
        return hasProtectedContent;
    }

    public Boolean getFromOnline() {
        return isFromOnline;
    }

    public Boolean getHasMediaSpoiler() {
        return hasMediaSpoiler;
    }

    public Boolean getDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    public Boolean getGroupChatCreated() {
        return groupChatCreated;
    }

    public Boolean getSupergroupChatCreated() {
        return supergroupChatCreated;
    }

    public Boolean getChannelChatCreated() {
        return channelChatCreated;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public List<MessageEntity> getCaptionEntities() {
        return captionEntities;
    }

    public Animation getAnimation() {
        return animation;
    }

    public Audio getAudio() {
        return audio;
    }

    public Document getDocument() {
        return document;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public List<PhotoSize> getNewChatPhoto() {
        return newChatPhoto;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Video getVideo() {
        return video;
    }

    public VideoNote getVideoNote() {
        return videoNote;
    }

    public Voice getVoice() {
        return voice;
    }

    public Contact getContact() {
        return contact;
    }

    public Dice getDice() {
        return dice;
    }

    public Game getGame() {
        return game;
    }

    public Poll getPoll() {
        return poll;
    }

    public Story getStory() {
        return story;
    }

    public Venue getVenue() {
        return venue;
    }

    public Location getLocation() {
        return location;
    }

    public MessageAutoDeleteTimerChanged getMessageAutoDeleteTimerChanged() {
        return messageAutoDeleteTimerChanged;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public SuccessfulPayment getSuccessfulPayment() {
        return successfulPayment;
    }

    public UsersShared getUsersShared() {
        return usersShared;
    }

    public ChatShared getChatShared() {
        return chatShared;
    }

    public WriteAccessAllowed getWriteAccessAllowed() {
        return writeAccessAllowed;
    }

    public PassportData getPassportData() {
        return passportData;
    }

    public ProximityAlertTriggered getProximityAlertTriggered() {
        return proximityAlertTriggered;
    }

    public ForumTopicCreated getForumTopicCreated() {
        return forumTopicCreated;
    }

    public ForumTopicEdited getForumTopicEdited() {
        return forumTopicEdited;
    }

    public ForumTopicClosed getForumTopicClosed() {
        return forumTopicClosed;
    }

    public ForumTopicReopened getForumTopicReopened() {
        return forumTopicReopened;
    }

    public GeneralForumTopicHidden getGeneralForumTopicHidden() {
        return generalForumTopicHidden;
    }

    public GeneralForumTopicUnhidden getGeneralForumTopicUnhidden() {
        return generalForumTopicUnhidden;
    }

    public VideoChatScheduled getVideoChatScheduled() {
        return videoChatScheduled;
    }

    public VideoChatStarted getVideoChatStarted() {
        return videoChatStarted;
    }

    public VideoChatEnded getVideoChatEnded() {
        return videoChatEnded;
    }

    public VideoChatParticipantsInvited getVideoChatParticipantsInvited() {
        return videoChatParticipantsInvited;
    }

    public WebAppData getWebAppData() {
        return webAppData;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public ExternalReplyInfo getExternalReply() {
        return externalReply;
    }

    public TextQuote getQuote() {
        return quote;
    }

    public LinkPreviewOptions getLinkPreviewOptions() {
        return linkPreviewOptions;
    }

    public Giveaway getGiveaway() {
        return giveaway;
    }

    public GiveawayCreated getGiveawayCreated() {
        return giveawayCreated;
    }

    public GiveawayWinners getGiveawayWinners() {
        return giveawayWinners;
    }

    public GiveawayCompleted getGiveawayCompleted() {
        return giveawayCompleted;
    }

    public MessageOrigin getForwardOrigin() {
        return forwardOrigin;
    }

    public ChatBoostAdded getBoostAdded() {
        return boostAdded;
    }

    public Integer getSenderBoostCount() {
        return senderBoostCount;
    }

    public Story getReplyToStory() {
        return replyToStory;
    }

    public ChatBackground getChatBackgroundSet() {
        return chatBackgroundSet;
    }

    public String getEffectId() {
        return effectId;
    }

    public Boolean getShowCaptionAboveMedia() {
        return showCaptionAboveMedia;
    }

    public PaidMediaInfo getPaidMedia() {
        return paidMedia;
    }

    public RefundedPayment getRefundedPayment() {
        return refundedPayment;
    }

    public GiftInfo getGift() {
        return gift;
    }

    public UniqueGift getUniqueGift() {
        return uniqueGift;
    }

    public PaidMessagePriceChanged getPaidMessagePriceChanged() {
        return paidMessagePriceChanged;
    }

    public Integer getPaidStarCount() {
        return paidStarCount;
    }

    public Checklist getChecklist() {
        return checklist;
    }

    public ChecklistTasksAdded getChecklistTasksDone() {
        return checklistTasksDone;
    }

    public ChecklistTasksDone getChecklistTasksAdded() {
        return checklistTasksAdded;
    }

    public DirectMessagePriceChanged getDirectMessagePriceChanged() {
        return directMessagePriceChanged;
    }

    public Integer getReplyToChecklistTaskId() {
        return replyToChecklistTaskId;
    }

    public DirectMessagesTopic getDirectMessagesTopic() {
        return directMessagesTopic;
    }

    public Boolean getPaidPost() {
        return isPaidPost;
    }

    public SuggestedPostApproved getSuggestedPostApproved() {
        return suggestedPostApproved;
    }

    public SuggestedPostApprovalFailed getSuggestedPostApprovalFailed() {
        return suggestedPostApprovalFailed;
    }

    public SuggestedPostDeclined getSuggestedPostDeclined() {
        return suggestedPostDeclined;
    }

    public SuggestedPostPaid getSuggestedPostPaid() {
        return suggestedPostPaid;
    }

    public SuggestedPostRefunded getSuggestedPostRefunded() {
        return suggestedPostRefunded;
    }

    public GiftInfo getGiftUpgradeSent() {
        return giftUpgradeSent;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", messageThreadId=" + messageThreadId +
                ", date=" + date +
                ", editDate=" + editDate +
                ", migrateToChatId=" + migrateToChatId +
                ", migrateFromChatId=" + migrateFromChatId +
                ", authorSignature='" + authorSignature + '\'' +
                ", text='" + text + '\'' +
                ", caption='" + caption + '\'' +
                ", newChatTitle='" + newChatTitle + '\'' +
                ", connectedWebsite='" + connectedWebsite + '\'' +
                ", mediaGroupId='" + mediaGroupId + '\'' +
                ", businessConnectionId='" + businessConnectionId + '\'' +
                ", from=" + from +
                ", viaBot=" + viaBot +
                ", leftChatMember=" + leftChatMember +
                ", senderBusinessBot=" + senderBusinessBot +
                ", newChatMembers=" + newChatMembers +
                ", senderChat=" + senderChat +
                ", chat=" + chat +
                ", isTopicMessage=" + isTopicMessage +
                ", isAutomaticForward=" + isAutomaticForward +
                ", hasProtectedContent=" + hasProtectedContent +
                ", isFromOnline=" + isFromOnline +
                ", hasMediaSpoiler=" + hasMediaSpoiler +
                ", deleteChatPhoto=" + deleteChatPhoto +
                ", groupChatCreated=" + groupChatCreated +
                ", supergroupChatCreated=" + supergroupChatCreated +
                ", channelChatCreated=" + channelChatCreated +
                ", replyToMessage=" + replyToMessage +
                ", pinnedMessage=" + pinnedMessage +
                ", entities=" + entities +
                ", captionEntities=" + captionEntities +
                ", animation=" + animation +
                ", audio=" + audio +
                ", document=" + document +
                ", photo=" + photo +
                ", newChatPhoto=" + newChatPhoto +
                ", sticker=" + sticker +
                ", video=" + video +
                ", videoNote=" + videoNote +
                ", voice=" + voice +
                ", contact=" + contact +
                ", dice=" + dice +
                ", game=" + game +
                ", poll=" + poll +
                ", story=" + story +
                ", venue=" + venue +
                ", location=" + location +
                ", messageAutoDeleteTimerChanged=" + messageAutoDeleteTimerChanged +
                ", invoice=" + invoice +
                ", successfulPayment=" + successfulPayment +
                ", usersShared=" + usersShared +
                ", chatShared=" + chatShared +
                ", writeAccessAllowed=" + writeAccessAllowed +
                ", passportData=" + passportData +
                ", proximityAlertTriggered=" + proximityAlertTriggered +
                ", forumTopicCreated=" + forumTopicCreated +
                ", forumTopicEdited=" + forumTopicEdited +
                ", forumTopicClosed=" + forumTopicClosed +
                ", forumTopicReopened=" + forumTopicReopened +
                ", generalForumTopicHidden=" + generalForumTopicHidden +
                ", generalForumTopicUnhidden=" + generalForumTopicUnhidden +
                ", videoChatScheduled=" + videoChatScheduled +
                ", videoChatStarted=" + videoChatStarted +
                ", videoChatEnded=" + videoChatEnded +
                ", videoChatParticipantsInvited=" + videoChatParticipantsInvited +
                ", webAppData=" + webAppData +
                ", replyMarkup=" + replyMarkup +
                ", externalReply=" + externalReply +
                ", quote=" + quote +
                ", linkPreviewOptions=" + linkPreviewOptions +
                ", giveaway=" + giveaway +
                ", giveawayCreated=" + giveawayCreated +
                ", giveawayWinners=" + giveawayWinners +
                ", giveawayCompleted=" + giveawayCompleted +
                ", forwardOrigin=" + forwardOrigin +
                ", boostAdded=" + boostAdded +
                ", senderBoostCount=" + senderBoostCount +
                ", replyToStory=" + replyToStory +
                ", chatBackgroundSet=" + chatBackgroundSet +
                ", effectId='" + effectId + '\'' +
                ", showCaptionAboveMedia=" + showCaptionAboveMedia +
                ", paidMedia=" + paidMedia +
                ", refundedPayment=" + refundedPayment +
                ", gift=" + gift +
                ", uniqueGift=" + uniqueGift +
                ", paidMessagePriceChanged=" + paidMessagePriceChanged +
                ", paidStarCount=" + paidStarCount +
                ", checklist=" + checklist +
                ", checklistTasksDone=" + checklistTasksDone +
                ", checklistTasksAdded=" + checklistTasksAdded +
                ", directMessagePriceChanged=" + directMessagePriceChanged +
                ", replyToChecklistTaskId=" + replyToChecklistTaskId +
                ", directMessagesTopic=" + directMessagesTopic +
                ", isPaidPost=" + isPaidPost +
                ", suggestedPostApproved=" + suggestedPostApproved +
                ", suggestedPostApprovalFailed=" + suggestedPostApprovalFailed +
                ", suggestedPostDeclined=" + suggestedPostDeclined +
                ", suggestedPostPaid=" + suggestedPostPaid +
                ", suggestedPostRefunded=" + suggestedPostRefunded +
                ", giftUpgradeSent=" + giftUpgradeSent +
                '}';
    }
}