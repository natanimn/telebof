package io.github.natanimn.telebof.enums;

/**
 * Enum representing different types of messages that can be received from Telegram.
 * These types correspond to the filtering methods available in the {@link io.github.natanimn.telebof.filters.Filter} class
 * and represent various message content types, service messages, and update types supported by the Telegram Bot API.
 *
 * @author Natanim
 * @since 1.2.0
 */
public enum MessageType {
    /**
     * Text messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#text()}
     */
    TEXT,

    /**
     * Photo messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#photo()}
     */
    PHOTO,

    /**
     * Video messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#video()}
     */
    VIDEO,

    /**
     * Audio messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#audio()}
     */
    AUDIO,

    /**
     * Animation (GIF) messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#animation()}
     */
    ANIMATION,

    /**
     * Document/file messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#document()}
     */
    DOCUMENT,

    /**
     * Voice messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#voice()}
     */
    VOICE,

    /**
     * Video note (round video) messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#videoNote()}
     */
    VIDEO_NOTE,

    /**
     * Contact sharing messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#contact()}
     */
    CONTACT,

    /**
     * Location sharing messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#location()}
     */
    LOCATION,

    /**
     * Venue information messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#venue()}
     */
    VENUE,

    /**
     * Game messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#game()}
     */
    GAME,

    /**
     * Dice messages with random values, filtered by {@link io.github.natanimn.telebof.filters.Filter#dice()}
     */
    DICE,

    /**
     * Sticker messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#sticker()}
     */
    STICKER,

    /**
     * Invoice/payment request messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#invoice()}
     */
    INVOICE,

    /**
     * Quote messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#quote()}
     */
    QUOTE,

    /**
     * Giveaway announcement messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#giveaway()}
     */
    GIVEAWAY,

    /**
     * Generic media messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#media()}
     */
    MEDIA,

    /**
     * Service messages for new chat members, filtered by {@link io.github.natanimn.telebof.filters.Filter#newChatMember()}
     */
    NEW_CHAT_MEMBER,

    /**
     * Service messages for members leaving chat, filtered by {@link io.github.natanimn.telebof.filters.Filter#leftChatMember()}
     */
    LEFT_CHAT_MEMBER,

    /**
     * Service messages for pinned messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#pinnedMessage()}
     */
    PINNED_MESSAGE,

    /**
     * Service messages for new chat photos, filtered by {@link io.github.natanimn.telebof.filters.Filter#newChatPhoto()}
     */
    NEW_CHAT_PHOTO,

    /**
     * Service messages for new chat titles, filtered by {@link io.github.natanimn.telebof.filters.Filter#newChatTitle()}
     */
    NEW_CHAT_TITLE,

    /**
     * Service messages for group creation, filtered by {@link io.github.natanimn.telebof.filters.Filter#groupCreated()}
     */
    GROUP_CREATED,

    /**
     * Service messages for supergroup creation, filtered by {@link io.github.natanimn.telebof.filters.Filter#supergroupCreated()}
     */
    SUPERGROUP_CREATED,

    /**
     * Service messages for channel creation, filtered by {@link io.github.natanimn.telebof.filters.Filter#channelCreated()}
     */
    CHANNEL_CREATED,

    /**
     * Service messages for auto-delete timer changes, filtered by {@link io.github.natanimn.telebof.filters.Filter#messageAutoDeleteTimerChanged()}
     */
    MESSAGE_AUTO_DELETE_TIMER_CHANGED,

    /**
     * Service messages for chat migration, filtered by {@link io.github.natanimn.telebof.filters.Filter#migrated()}
     */
    MIGRATED,

    /**
     * Service messages for successful payments, filtered by {@link io.github.natanimn.telebof.filters.Filter#successfulPayment()}
     */
    SUCCESSFUL_PAYMENT,

    /**
     * Service messages for proximity alerts, filtered by {@link io.github.natanimn.telebof.filters.Filter#proximityAlertTriggered()}
     */
    PROXIMITY_ALERT_TRIGGERED,

    /**
     * Service messages for forum topic creation, filtered by {@link io.github.natanimn.telebof.filters.Filter#forumTopicCreated()}
     */
    FORUM_TOPIC_CREATED,

    /**
     * Service messages for forum topic edits, filtered by {@link io.github.natanimn.telebof.filters.Filter#forumTopicEdited()}
     */
    FORUM_TOPIC_EDITED,

    /**
     * Service messages for forum topic closure, filtered by {@link io.github.natanimn.telebof.filters.Filter#forumTopicClosed()}
     */
    FORUM_TOPIC_CLOSED,

    /**
     * Service messages for forum topic reopening, filtered by {@link io.github.natanimn.telebof.filters.Filter#forumTopicReopened()}
     */
    FORUM_TOPIC_REOPENED,

    /**
     * Service messages for video chat started, filtered by {@link io.github.natanimn.telebof.filters.Filter#videoChatStarted()}
     */
    VIDEO_CHAT_STARTED,

    /**
     * Service messages for video chat scheduled, filtered by {@link io.github.natanimn.telebof.filters.Filter#videoChatScheduled()}
     */
    VIDEO_CHAT_SCHEDULED,

    /**
     * Service messages for video chat participant invitations, filtered by {@link io.github.natanimn.telebof.filters.Filter#videoChatParticipantInvited()}
     */
    VIDEO_CHAT_PARTICIPANT_INVITED,

    /**
     * Service messages for video chat ended, filtered by {@link io.github.natanimn.telebof.filters.Filter#videoChatEnded()}
     */
    VIDEO_CHAT_ENDED,

    /**
     * Service messages for forwarded messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#forwarded()}
     */
    FORWARDED,

    /**
     * Service messages for replied messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#replied()}
     */
    REPLIED,

    /**
     * Service messages for replied to story messages, filtered by {@link io.github.natanimn.telebof.filters.Filter#repliedToStory()}
     */
    REPLIED_TO_STORY,

    /**
     * Messages coming from bots, filtered by {@link io.github.natanimn.telebof.filters.Filter#bot()}
     */
    BOT,

    /**
     * Service messages for giveaway creation, filtered by {@link io.github.natanimn.telebof.filters.Filter#giveawayCreated()}
     */
    GIVEAWAY_CREATED,

    /**
     * Service messages for giveaway completion, filtered by {@link io.github.natanimn.telebof.filters.Filter#giveawayCompleted()}
     */
    GIVEAWAY_COMPLETED,

    /**
     * Service messages for boost added, filtered by {@link io.github.natanimn.telebof.filters.Filter#boostAdded()}
     */
    BOOST_ADDED,

    /**
     * Service messages for users shared, filtered by {@link io.github.natanimn.telebof.filters.Filter#usersShared()}
     */
    USERS_SHARED,

    /**
     * Service messages for write access allowed, filtered by {@link io.github.natanimn.telebof.filters.Filter#writeAccessAllowed()}
     */
    WRITE_ACCESS_ALLOWED,

    /**
     * Messages containing checklists, filtered by {@link io.github.natanimn.telebof.filters.Filter#checklist()}
     */
    CHECKLIST,

    /**
     *  Service messages for checklist tasks done, filtered by {@link io.github.natanimn.telebof.filters.Filter#checklistTasksDone()}
     */
    CHECKLIST_TASKS_DONE,

    /**
     * Service messages for checklist tasks added, filtered by {@link io.github.natanimn.telebof.filters.Filter#checklistTasksAdded()}
     */
    CHECKLIST_TASKS_ADDED,

    /**
     *  Service messages for direct message price changes, filtered by {@link io.github.natanimn.telebof.filters.Filter#directMessagePriceChanged()}
     */
    DIRECT_MESSAGE_PRICE_CHANGED,

    /**
     * Messages containing entities (formatting), filtered by {@link io.github.natanimn.telebof.filters.Filter#entities()}
     */
    ENTITIES,

    /**
     * Service messages for chat background set, filtered by {@link io.github.natanimn.telebof.filters.Filter#chatBackgroundSet()}
     */
    CHAT_BACKGROUND_SET,

    /**
     * Service messages for chat shared, filtered by {@link io.github.natanimn.telebof.filters.Filter#chatShared()}
     */
    CHAT_SHARED,

    /**
     * Messages containing web app data, filtered by {@link io.github.natanimn.telebof.filters.Filter#webAppData()}
     */
    WEB_APP_DATA,

    /**
     * Messages containing passport data, filtered by {@link io.github.natanimn.telebof.filters.Filter#passportData()}
     */
    PASSPORT_DATA,

    /**
     * Service messages for refunded payments, filtered by {@link io.github.natanimn.telebof.filters.Filter#refundedPayment()}
     */
    REFUNDED_PAYMENT,

    /**
     * Service messages for approved suggested posts, filtered by {@link io.github.natanimn.telebof.filters.Filter#suggestedPostApproved()}
     */
    SUGGESTED_POST_APPROVED,

    /**
     * Service messages for suggested post approval failures, filtered by {@link io.github.natanimn.telebof.filters.Filter#suggestedPostApprovalFailed()}
     */
    SUGGESTED_POST_APPROVAL_FAILED,

    /**
     * Service messages for declined suggested posts, filtered by {@link io.github.natanimn.telebof.filters.Filter#suggestedPostDeclined()}
     */
    SUGGESTED_POST_DECLINED,

    /**
     * Service messages for paid suggested posts, filtered by {@link io.github.natanimn.telebof.filters.Filter#suggestedPostPaid()}
     */
    SUGGESTED_POST_PAID,

    /**
     * Service messages for refunded suggested posts, filtered by {@link io.github.natanimn.telebof.filters.Filter#suggestedPostRefunded()}
     */
    SUGGESTED_POST_REFUNDED
}