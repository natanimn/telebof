package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.enums.Updates;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * This class represents an incoming update.
 * At most one of the optional parameters can be present in any given update.
 *
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Update implements TelegramUpdate {
    /**
     * The update's unique identifier. Update identifiers start from a certain positive number and increase sequentially.
     * This identifier becomes especially handy if you're using webhook since it allows you to ignore repeated updates or to restore the correct update sequence, should they get out of order.
     * If there are no new updates for at least a week, then identifier of the next update will be chosen randomly instead of sequentially.
     */
    @SerializedName("update_id")
    private int updateId;

    /**
     * New incoming message of any kind - text, photo, sticker, etc.
     */
    private Message message;

    /**
     * New version of a message that is known to the bot and was edited.
     * This update may at times be triggered by changes to message fields that are either unavailable or not actively used by your bot.
     */
    @SerializedName("edited_message")
    private Message editedMessage;

    /**
     * New incoming channel post of any kind - text, photo, sticker, etc.
     */
    @SerializedName("channel_post")
    private Message channelPost;

    /**
     * New version of a channel post that is known to the bot and was edited.
     * This update may at times be triggered by changes to message fields that are either unavailable or not actively used by your bot.
     */
    @SerializedName("edited_channel_post")
    private Message editedChannelPost;

    /**
     * New message from a connected business account
     */
    @SerializedName("business_message")
    private Message businessMessage;

    /**
     * New version of a message from a connected business account
     */
    @SerializedName("edited_business_message")
    private Message editedBusinessMessage;

    /**
     * New incoming callback query
     */
    @SerializedName("callback_query")
    private CallbackQuery callbackQuery;

    /**
     * New incoming inline query
     */
    @SerializedName("inline_query")
    private InlineQuery inlineQuery;

    /**
     * The result of an inline query that was chosen by a user and sent to their chat partner.
     */
    @SerializedName("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult;

    /**
     * New poll state. Bots receive only updates about manually stopped polls and polls, which are sent by the bot
     */
    private Poll poll;

    /**
     * A user changed their answer in a non-anonymous poll. Bots receive new votes only in polls that were sent by the bot itself.
     */
    @SerializedName("poll_answer")
    private PollAnswer pollAnswer;

    /**
     * New incoming pre-checkout query. Contains full information about checkout
     */
    @SerializedName("pre_checkout_query")
    private PreCheckoutQuery preCheckoutQuery;

    /**
     * New incoming shipping query. Only for invoices with flexible price
     */
    @SerializedName("shipping_query")
    private ShippingQuery shippingQuery;

    /**
     * The bot's chat member status was updated in a chat.
     * For private chats, this update is received only when the bot is blocked or unblocked by the user.
     */
    @SerializedName("my_chat_member")
    private ChatMemberUpdated myChatMember;

    /**
     * A chat member's status was updated in a chat.
     * The bot must be an administrator in the chat and must explicitly specify {@link Updates#CHAT_MEMBER} in the list of allowed_updates to receive these updates.
     */
    @SerializedName("chat_member")
    private ChatMemberUpdated chatMember;

    /**
     * A request to join the chat has been sent.
     * The bot must have the can_invite_users administrator right in the chat to receive these updates.
     */
    @SerializedName("chat_join_request")
    private ChatJoinRequest chatJoinRequest;

    /**
     * A reaction to a message was changed by a user.
     * The bot must be an administrator in the chat and must explicitly specify {@link Updates#MESSAGE_REACTION} in the list of allowed_updates to receive these updates.
     * The update isn't received for reactions set by bots.
     */
    @SerializedName("message_reaction")
    private MessageReactionUpdated messageReaction;

    /**
     * Reactions to a message with anonymous reactions were changed.
     * The bot must be an administrator in the chat and must explicitly specify {@link Updates#MESSAGE_REACTION_COUNT} in the list of
     * allowed_updates to receive these updates. The updates are grouped and can be sent with delay up to a few minutes.
     */
    @SerializedName("message_reaction_count")
    private MessageReactionCountUpdated messageReactionCount;

    /**
     * A chat boost was added or changed. The bot must be an administrator in the chat to receive these updates.
     */
    @SerializedName("chat_boost")
    private ChatBoostUpdated chatBoost;

    /**
     * A boost was removed from a chat. The bot must be an administrator in the chat to receive these updates.
     */
    @SerializedName("removed_chat_boost")
    private ChatBoostRemoved removedChatBoost;

    /**
     * The bot was connected to or disconnected from a business account, or a user edited an existing connection with the bot
     */
    @SerializedName("business_connection")
    private BusinessConnection businessConnection;

    /**
     * Messages were deleted from a connected business account
     */
    @SerializedName("deleted_business_messages")
    private BusinessMessagesDeleted deletedBusinessMessages;

    /**
     * A user purchased paid media with a non-empty payload sent by the bot in a non-channel chat
     */
    @SerializedName("purchased_paid_media")
    private PaidMediaPurchased purchasedPaidMedia;

    public int getUpdateId() {
        return updateId;
    }

    public Message getMessage() {
        return message;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public Message getChannelPost() {
        return channelPost;
    }

    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public Message getBusinessMessage() {
        return businessMessage;
    }

    public Message getEditedBusinessMessage() {
        return editedBusinessMessage;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    public Poll getPoll() {
        return poll;
    }

    public PollAnswer getPollAnswer() {
        return pollAnswer;
    }

    public PreCheckoutQuery getPreCheckoutQuery() {
        return preCheckoutQuery;
    }

    public ShippingQuery getShippingQuery() {
        return shippingQuery;
    }

    public ChatMemberUpdated getMyChatMember() {
        return myChatMember;
    }

    public ChatMemberUpdated getChatMember() {
        return chatMember;
    }

    public ChatJoinRequest getChatJoinRequest() {
        return chatJoinRequest;
    }

    public MessageReactionUpdated getMessageReaction() {
        return messageReaction;
    }

    public MessageReactionCountUpdated getMessageReactionCount() {
        return messageReactionCount;
    }

    public ChatBoostUpdated getChatBoost() {
        return chatBoost;
    }

    public ChatBoostRemoved getRemovedChatBoost() {
        return removedChatBoost;
    }

    public BusinessConnection getBusinessConnection() {
        return businessConnection;
    }

    public BusinessMessagesDeleted getDeletedBusinessMessages() {
        return deletedBusinessMessages;
    }

    public PaidMediaPurchased getPurchasedPaidMedia() {
        return purchasedPaidMedia;
    }
}